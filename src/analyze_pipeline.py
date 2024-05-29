import subprocess
import time
import multiprocessing
from typing import List, Dict, Tuple
from query_template import prompt_single_yes_no_question, prompt_multiple_choice_scenarios
from chatgpt_api import Chat
from utils import split_answer_section
from antlr4helper import parseString
from antlr4helper.callgraph import CallGraph
import logging
import os
from utils import split_answer_section
import traceback
import json
import re
import rich
import rich_utils
logger = logging.getLogger(__name__)
console = rich.get_console()

def ask_with_timeout(prompt, gpt4=False, timeout=90):
    # logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    # logger.info(f"Sending message: \n{prompt}")
    # logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    pool = multiprocessing.Pool(processes=1)
    process = pool.apply_async(Chat().sendMessages, args=(prompt, gpt4))
    pool.close()
    start_time = time.time()
    while True:
        if time.time() - start_time > timeout:
            pool.terminate()
            raise TimeoutError("Timeout")
        if process.ready() == True:
            res = process.get()
            # logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
            # logger.info(f"Received message: \n{res}")
            # logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
            return res


def ask_for_function_to_focus_with_feature_words_v2(source_dir: str, feature_words: List[List[str]]) -> Tuple[CallGraph, Dict[str, Dict[str, List[int]]]]:
    def contains_any(str_, iter_):
        for iter in iter_:
            if iter.lower() in str_.lower():
                return True
        return False
    # get all functions
    cg = CallGraph(source_dir)
    result = {}
    for file in cg.files:
        for contract in cg.files[file]["subcontracts"]:
            for func in contract["functions"]:
                for feature_index, features in enumerate(feature_words):
                    if contains_any(func["name"].lower(), features):
                        if file not in result:
                            result[file] = {}
                        if func["name"] not in result[file]:
                            result[file][func["name"]] = []
                        result[file][func["name"]].append(feature_index)
                    else:
                        pass

    return cg, result

def ask_whether_has_vul_with_scenario_v9(src_folder: str, rules: List[dict]) -> Tuple[Dict[str, str], CallGraph, Dict]:
    cg = CallGraph(src_folder)
    file_func_question_map = {}
    meta_data = {
        # 所有set都会转换成整数，即set中元素个数
        "files": 0, # 文件总数
        "contracts": 0, # 合约总数
        "functions": 0, # 函数总数
        "loc": 0, # 代码总行数
        "files_after_filter": set(), # 过滤后的文件总数
        "files_after_step_1": set(), # 第一次提问后的文件总数
        "files_after_step_2": set(), # 第二次提问后的文件总数
        "files_after_static": set(), # 静态分析后的文件总数
        "contracts_after_filter": set(), # 过滤后的合约总数
        "contracts_after_step_1": set(), # 第一次提问后的合约总数
        "contracts_after_step_2": set(), # 第二次提问后的合约总数
        "contracts_after_static": set(), # 静态分析后的合约总数
        "functions_after_filter": set(), # 过滤后的函数总数
        "functions_after_step_1": set(), # 第一次提问后的函数总数
        "functions_after_step_2": set(), # 第二次提问后的函数总数
        "functions_after_static": set(), # 静态分析后的函数总数
        "rules_loaded": len(rules), # 加载的规则总数
        "rules_types_for_step_1": set(), # 过滤后的规则总数，也就是第一次提问用到的规则总数
        "rules_types_for_step_2": set(), # 第二次提问用到的规则总数
        "rules_types_for_static": set(), # 静态分析用到的规则总数
        "rules_types_after_static": set(), # 静态分析后的有漏洞的规则总数
    }

    for file in cg.files:
        meta_data["files"] += 1
        meta_data["loc"] += len(open(file, errors="ignore").read().splitlines())
        file_func_question_map[file] = {}
        for contract in cg.files[file]["subcontracts"]:
            meta_data["contracts"] += 1
            file_func_question_map[file][contract["name"]] = {}
            for func in contract["functions"]:
                meta_data["functions"] += 1
                file_func_question_map[file][contract["name"]
                                             ][func["name"]] = {}
                # ignore functions with only one line
                if int(func["loc"]["start"].split(":")[0]) == int(func["loc"]["end"].split(":")[0]):
                    continue
                func_text = "\n".join(open(file).read().splitlines()[int(
                    func["loc"]["start"].split(":")[0])-1:int(func["loc"]["end"].split(":")[0])])
                func_text_without_def = func_text[func_text.index("{")+1:func_text.rindex("}")]
                file_func_question_map[file][contract["name"]
                                             ][func["name"]]["source"] = func_text
                file_func_question_map[file][contract["name"]
                                             ][func["name"]]["data"] = []
                # if file in folder test
                paths = list(map(lambda x: x.lower(), os.path.split(file)))
                if "test" in paths or "tests" in paths or "testing" in paths or "unittest" in paths or "unit_test" in paths or "unit tests" in paths or "unit_testing" in paths:
                    continue
                
                for rule in rules:
                    func_name_flag = True
                    func_param_flag = True
                    func_content_flag = True
                    func_reachable_flag = False
                    func_public_flag = True
                    func_contain_any_flag = False
                    func_not_flag = True
                    function_not_inside_flag = True
                    function_not_contain_any_flag = True
                    check_only_modifier_flag = True

                    and_filter_enabled_at_least_one_flag = False
                    # func_text = "\n".join(open(file).read().splitlines()[int(func["loc"]["start"].split(":")[0])-1:int(func["loc"]["end"].split(":")[0])])
                    # file_func_question_map[file][contract["name"]][func["name"]]["source"]=func_text
                    # file_func_question_map[file][contract["name"]][func["name"]]["data"] = []
                    # if function name
                    if "functions" in rule:
                        and_filter_enabled_at_least_one_flag = True
                        func_name_flag = False
                        for func_name in rule["functions"]:
                            if func_name.lower() in func["name"].lower():
                                func_name_flag = True
                                break
                    # if function param
                    if "function_parameters" in rule:
                        and_filter_enabled_at_least_one_flag = True
                        func_param_flag = False
                        param_text = func_text[func_text.index(
                            "(")+1:func_text.index(")")]
                        for param in rule["function_parameters"]:
                            for p in param_text.split(","):
                                if param.lower() in p.split(" ")[0].lower():
                                    func_param_flag = True
                                    break
                            # if param.lower() in param_text.lower():
                            #     func_param_flag = True
                            #     break
                    # if function content
                    if "function_inside" in rule:
                        and_filter_enabled_at_least_one_flag = True
                        func_content_flag = False
                        for content in rule["function_inside"]:
                            if content.lower() in func_text_without_def.lower():
                                func_content_flag = True
                                break
                    # if function public
                    if "function_public" in rule:
                        and_filter_enabled_at_least_one_flag = True
                        func_public_flag = False
                        if func["visibility"] == "public" or func["visibility"] == "external":
                            func_public_flag = True

                    # if function contain any
                    # make sure that there is at least one list
                    if "function_contain_any" in rule and len(rule["function_contain_any"]) != 0:
                        func_contain_any_flag = True
                        for content_list in rule["function_contain_any"]:
                            tmp_flag = False
                            for content in content_list:
                                if content.lower() in func_text_without_def.lower():
                                    tmp_flag = True
                                    break
                            # if all the items in any list is not contained, then flag is False
                            func_contain_any_flag = func_contain_any_flag and tmp_flag

                    # if function not contain any
                    if "function_not_contain_any" in rule and len(rule["function_not_contain_any"]) != 0:
                        function_not_contain_any_flag = True
                        processed_text = func_text_without_def
                        if "function_not_contain_any_ignore_space_and_underline" in rule and rule["function_not_contain_any_ignore_space_and_underline"] == True:
                            processed_text = processed_text.replace("_","")
                            processed_text = processed_text.replace(" ","")
                        for content_list in rule["function_not_contain_any"]:
                            tmp_flag = False
                            for content in content_list:
                                if "function_not_contain_any_ignore_space_and_underline" in rule and rule["function_not_contain_any_ignore_space_and_underline"] == True:
                                    content = content.replace("_","")
                                    content = content.replace(" ","")
                                if content.lower() in processed_text.lower():
                                    tmp_flag = True
                                    break
                            function_not_contain_any_flag = function_not_contain_any_flag and tmp_flag\
                        # if all the items in any list is contained, then flag is False
                        function_not_contain_any_flag = not function_not_contain_any_flag
                    
                    if "not_funtion" in rule:
                        and_filter_enabled_at_least_one_flag = True
                        for content in rule["not_funtion"]:
                            if content.lower() == func["name"].lower():
                                func_not_flag = False
                                break

                    if "function_not_inside" in rule:
                        # and_filter_enabled_at_least_one_flag = True
                        for content in rule["function_not_inside"]:
                            if isinstance(content, str):
                                if content.lower() in func_text_without_def.lower():
                                    function_not_inside_flag = False
                                    break
                            elif isinstance(content, dict) and "REGEX" in content:
                                for stmt in func_text_without_def.split(";"):
                                    if re.search(content["REGEX"], stmt.replace("\n","").replace("\r","").strip()):
                                        function_not_inside_flag = False
                                        break

                    if "check_only_modifier" in rule and rule["check_only_modifier"] == True:
                        check_only_modifier_flag = True
                        # get all modifiers
                        modifier_text = func_text[func_text.index(")"):func_text.index("{")]
                        if "only" in modifier_text.lower():
                            check_only_modifier_flag = False

                    # reachable problem
                    callers = cg.get_callers(func["name"])
                    visited = set()
                    tovisit = set()
                    frozenset_origin_map = {}
                    if func['visibility'] != 'external' and func['visibility'] != 'public':
                        # callers = cg.get_callers(function)
                        callers_ = []
                        for x in callers:
                            if frozenset(x) not in frozenset_origin_map:
                                frozenset_origin_map[frozenset(x)] = x
                            callers_.append(frozenset(x))
                        tovisit.update(callers_)
                        while len(tovisit) > 0:
                            caller = tovisit.pop()
                            if caller in visited:
                                continue
                            visited.add(caller)
                            caller_detail = cg.get_function_detail(*frozenset_origin_map[caller])
                            if caller_detail is None:
                                continue
                            if caller_detail['visibility'] == 'external' or caller_detail['visibility'] == 'public':
                                func_reachable_flag = True
                                break
                            else:
                                for x in cg.get_callers(frozenset_origin_map[caller][2]):
                                    if frozenset(x) not in frozenset_origin_map:
                                        frozenset_origin_map[frozenset(x)] = x
                                    tovisit.add(frozenset(x))
                    else:
                        func_reachable_flag = True

                    # if satisfy all the condition
                    if (((func_not_flag and func_name_flag and func_param_flag and func_content_flag and func_reachable_flag and func_public_flag) and and_filter_enabled_at_least_one_flag) or func_contain_any_flag) and function_not_inside_flag and function_not_contain_any_flag and check_only_modifier_flag:
                        file_func_question_map[file][contract["name"]][func["name"]]["data"].append(
                            rule)
                        meta_data["rules_types_for_step_1"].add(rule["name"])
                        
    file_contract_function_res_map = {}

    for file, file_data in file_func_question_map.items():
        meta_data["files_after_filter"].add(file)
        file_contract_function_res_map[file] = {}
        for contract, contract_data in file_data.items():
            meta_data["contracts_after_filter"].add(f"{file}!!!{contract}")
            file_contract_function_res_map[file][contract] = {}
            for func_, function_data in contract_data.items():
                meta_data["functions_after_filter"].add(f"{file}!!!{contract}!!!{func_}")
                if len(function_data) == 0 or len(function_data["data"]) == 0:
                    continue
                try:
                    if func_ not in file_contract_function_res_map[file][contract]:
                        file_contract_function_res_map[file][contract][func_] = {}
                    # ask only function scenario
                    has_property_rules = list(
                        filter(lambda x: "property" in x, function_data["data"]))

                    # if not need ask for scenarios, just add static check
                    for rule in filter(lambda x: "property" not in x, function_data["data"]):
                        if "__ONLY_FUNCTION__" not in file_contract_function_res_map[file][contract][func_]:
                            file_contract_function_res_map[file][contract][func_]["__ONLY_FUNCTION__"] = {
                                "source": function_data["source"], "data": []}
                        file_contract_function_res_map[file][contract][func_]["__ONLY_FUNCTION__"]["data"].append(
                            rule)

                    # if needed, ask
                    if len(has_property_rules) != 0:
                        console.print(rich_utils.make_prompt_panel(function_data["source"], "\n".join(list(map(lambda x: x["property"][0], has_property_rules))), "Multiple Choice Scenarios"))
                        prompt = prompt_multiple_choice_scenarios(
                            list(map(lambda x: x["property"][0], has_property_rules)), function_data["source"])
                        res = ask_with_timeout(prompt)
                        answer = json.loads(res.split("}")[0]+"}")
                        for key, value in answer.items():
                            try:
                                int_key = int(key)
                                if int_key > len(has_property_rules):
                                    continue
                            except:
                                logger.error("Wrong format: {}".format(key))
                                continue
                            if value.lower().startswith("yes"):
                                meta_data["files_after_step_1"].add(file)
                                meta_data["contracts_after_step_1"].add(f"{file}!!!{contract}")
                                meta_data["functions_after_step_1"].add(f"{file}!!!{contract}!!!{func_}")
                                meta_data["rules_types_for_step_2"].add(has_property_rules[int_key-1]["name"])
                                prompt = prompt_single_yes_no_question(
                                    has_property_rules[int_key-1]["property"][0]+" "+has_property_rules[int_key-1]["property"][1], function_data["source"])
                                try:
                                    console.print(rich_utils.make_prompt_panel(function_data["source"], has_property_rules[int_key-1]["property"][0]+" "+has_property_rules[int_key-1]["property"][1], "Single Choice Scenario"))
                                    res = ask_with_timeout(prompt)
                                    # process answer
                                    if res.lower().startswith("yes"):
                                        meta_data["files_after_step_2"].add(file)
                                        meta_data["contracts_after_step_2"].add(f"{file}!!!{contract}")
                                        meta_data["functions_after_step_2"].add(f"{file}!!!{contract}!!!{func_}")
                                        if "__ONLY_FUNCTION__" not in file_contract_function_res_map[file][contract][func_]:
                                            file_contract_function_res_map[file][contract][func_]["__ONLY_FUNCTION__"] = {
                                                "source": function_data["source"], "data": []}
                                        file_contract_function_res_map[file][contract][func_]["__ONLY_FUNCTION__"]["data"].append(
                                            function_data["data"][int_key-1])
                                except TimeoutError:
                                    logger.error(
                                        "Timeout when asking function {}".format(func_))
                                    logger.error(traceback.format_exc())
                                except:
                                    logger.error(
                                        "Error when parsing function: {}".format(func_))
                                    logger.error(traceback.format_exc())
                except TimeoutError:
                    logger.error(
                        "Timeout when asking function {}".format(func_))
                    logger.error(traceback.format_exc())
                except:
                    logger.error(
                        "Error when parsing function: {}".format(func_))
                    logger.error(traceback.format_exc())

                rules_for_caller = list(filter(lambda x: ("function_public" not in x or x["function_public"] == False) and (
                    "property" in x) and ("only_this_function" not in x or x["only_this_function"] == False), function_data["data"]))
                # find callers
                callers = cg.get_callers(func_)

                functions_ = set()
                for caller in callers:
                    with open(caller[0]) as f:
                        detail = cg.get_function_detail(*caller)
                        if detail is None:
                            continue
                        source = f.read().splitlines()
                        
                        functions_.add(caller)

                caller_code = {}

                for function_file_pair in functions_:
                    with open(function_file_pair[0]) as f:
                        source = f.read().splitlines()
                        detail = cg.get_function_detail(*function_file_pair)
                        if detail is None:
                            continue
                        caller_sig = function_file_pair[0]+"!!!"+function_file_pair[1]+"!!!"+function_file_pair[2]
                        caller_code[caller_sig] = ("\n".join(source[int(detail['loc']['start'].split(
                            ":")[0])-1:int(detail['loc']['end'].split(":")[0])]))

                for caller_key in caller_code:
                    meta_data["files_after_filter"].add(caller_key.split("!!!")[0])
                    meta_data["contracts_after_filter"].add(f"{caller_key.split('!!!')[0]}!!!{caller_key.split('!!!')[1]}")
                    meta_data["functions_after_filter"].add(caller_key)
                    caller_c = caller_code[caller_key]
                    for rule in filter(lambda x: "property" not in x and ("function_public" not in x or x["function_public"] == False), function_data["data"]):
                        if caller_key not in file_contract_function_res_map[file][contract][func_]:
                            file_contract_function_res_map[file][contract][func_][caller_key] = {
                                "source": caller_c+"\n"+function_data["source"], "data": []}
                        file_contract_function_res_map[file][contract][func_][caller_key]["data"].append(
                            rule)
                    if len(rules_for_caller) != 0:
                        prompt = prompt_multiple_choice_scenarios(
                            list(map(lambda x: x["property"][0], rules_for_caller)), caller_c+"\n"+function_data["source"])
                        try:
                            console.print(rich_utils.make_prompt_panel(caller_c+"\n"+function_data["source"], "\n".join(list(map(lambda x: x["property"][0], rules_for_caller))), "Multiple Choice Scenarios"))
                            res = ask_with_timeout(prompt)
                            answer = json.loads(res.split("}")[0]+"}")
                        except TimeoutError:
                            logger.error(
                                "Timeout when asking function {}".format(func_))
                            logger.error(traceback.format_exc())
                            continue
                        except:
                            logger.error(
                                "Error when parsing answer: {}".format(func_))
                            logger.error(traceback.format_exc())
                            continue
                        if contract not in file_contract_function_res_map[file]:
                            file_contract_function_res_map[file][contract] = {}
                        if func_ not in file_contract_function_res_map[file][contract]:
                            file_contract_function_res_map[file][contract][func_] = {}
                        for key, value in answer.items():
                            try:
                                int_key = int(key)
                                if int_key > len(rules_for_caller):
                                    continue
                            except:
                                logger.error("Wrong format: {}".format(key))
                                continue
                            if value.lower().startswith("yes"):
                                meta_data["files_after_step_1"].add(file)
                                meta_data["contracts_after_step_1"].add(f"{file}!!!{contract}")
                                meta_data["functions_after_step_1"].add(f"{file}!!!{contract}!!!{func_}")
                                meta_data["files_after_step_1"].add(caller_key.split("!!!")[0])
                                meta_data["contracts_after_step_1"].add(f"{caller_key.split('!!!')[0]}!!!{caller_key.split('!!!')[1]}")
                                meta_data["functions_after_step_1"].add(caller_key)
                                meta_data["rules_types_for_step_2"].add(rules_for_caller[int_key-1]["name"])
                                prompt = prompt_single_yes_no_question(
                                    rules_for_caller[int_key-1]["property"][0]+" "+rules_for_caller[int_key-1]["property"][1], caller_c+"\n"+function_data["source"])
                                try:
                                    console.print(rich_utils.make_prompt_panel(caller_c+"\n"+function_data["source"], rules_for_caller[int_key-1]["property"][0]+" "+rules_for_caller[int_key-1]["property"][1], "Single Choice Scenario"))
                                    res = ask_with_timeout(prompt)
                                    # process answer
                                    if res.lower().startswith("yes"):
                                        meta_data["files_after_step_2"].add(file)
                                        meta_data["contracts_after_step_2"].add(f"{file}!!!{contract}")
                                        meta_data["functions_after_step_2"].add(f"{file}!!!{contract}!!!{func_}")
                                        meta_data["files_after_step_2"].add(caller_key.split("!!!")[0])
                                        meta_data["contracts_after_step_2"].add(f"{caller_key.split('!!!')[0]}!!!{caller_key.split('!!!')[1]}")
                                        meta_data["functions_after_step_2"].add(caller_key)
                                        if caller_key not in file_contract_function_res_map[file][contract][func_]:
                                            file_contract_function_res_map[file][contract][func_][caller_key] = {
                                                "source": caller_c+"\n"+function_data["source"], "data": []}
                                        file_contract_function_res_map[file][contract][func_][caller_key]["data"].append(
                                            rules_for_caller[int_key-1])
                                except TimeoutError:
                                    logger.error(
                                        "Timeout when asking function {}".format(func_))
                                    logger.error(traceback.format_exc())
                                except:
                                    logger.error(
                                        "Error when parsing answer: {}".format(func_))
                                    logger.error(traceback.format_exc())

                # clean json
                if func_ in file_contract_function_res_map[file][contract] and len(file_contract_function_res_map[file][contract][func_]) == 0:
                    file_contract_function_res_map[file][contract].pop(func_)
            if contract in file_contract_function_res_map[file] and len(file_contract_function_res_map[file][contract]) == 0:
                file_contract_function_res_map[file].pop(contract)
        # clean json
        if file in file_contract_function_res_map and len(file_contract_function_res_map[file]) == 0:
            file_contract_function_res_map.pop(file)
    return file_contract_function_res_map, cg, meta_data



def static_analysis(sink, source, file, function):
    subprocess.run(["java", "-jar", "jars/SolidityStaticAnalysis-1.0-SNAPSHOT-standalone.jar",
                   file, function, 'dataflow.json'])
    data = json.load(open("dataflow.json"))
    for source_sink in data:
        sink_ = source_sink[0]
        source_ = source_sink[1]

        if source == source_ and sink == sink_:
            return True
    return False


def ask_for_static_multistep(prompts, source, answer_keys):
    answer = {}
    for key, prompt in zip(answer_keys, prompts):
        try:
            console.print(rich_utils.make_prompt_panel(source, prompt, "Current Step"))
            res = ask_with_timeout(prompt+"\n"+source)
            # process answer, only keep inline code block
            splited_res = res.split("`")
            code_segs = []
            for i in range(1, len(splited_res), 2):
                for seg in splited_res[i].strip().splitlines():
                    code_segs.append(seg)
            code_segs = list(filter(lambda x: len(x) > 5 and (";" in x or "(" in x), code_segs))
            answer[key] = code_segs
            if len(code_segs) == 0:
                try:
                    splited_res = res.splitlines()
                    for line in splited_res:
                        if line.startswith("- "):
                            code_segs.append(line[2:].strip())
                    code_segs = list(filter(lambda x: len(x) > 5, code_segs))
                except TimeoutError:
                    logger.error("Timeout when asking function {}".format(source))
                    logger.error(traceback.format_exc())
                except:
                    logger.error("Error when parsing answer: {}".format(source))
                    logger.error(traceback.format_exc())

                answer[key] = code_segs

                if len(code_segs) == 0:
                    return {x: [] for x in answer_keys}
        except TimeoutError:
            logger.error("Timeout when asking function {}".format(source))
            logger.error(traceback.format_exc())
        except:
            logger.error("Error when parsing answer: {}".format(source))
            logger.error(traceback.format_exc())
    return answer


def ask_for_static(prompts, source, answer_keys):
    res = ask_with_timeout(prompts+"\n"+source)
    # process answer
    answer = split_answer_section(answer_keys, res)
    return answer

def ask_for_static_json(prompts, source, answer_keys):
    res = ask_with_timeout(prompts+"\n"+source)
    # process answer
    answer = {}
    data = json.loads(res[:res.rindex("}")+1])
    for key in answer_keys:
        if key in data:
            have_result_flag = False
            for value in data[key]:
                answer[key] = value
                have_result_flag = True
                break
            if not have_result_flag:
                answer[key] = None
        else:
            answer[key] = None
    return answer, data

def ask_for_static_json_single(prompts, source, answer_key):
    res = ask_with_timeout(prompts+"\n"+source)
    data = json.loads(res[:res.rindex("}")+1])
    return {answer_key: list(data.values())[0]}


