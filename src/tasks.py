import yaml
import os
import logging
from typing import Dict, List, Tuple
import config as global_config
import datetime
import json
import falcon_adapter
import traceback
import static_check
import utils
import sys
import time
import argparse
import subprocess
import rich
from rich.progress import Progress
from rich.table import Table
from rich_utils import *
import falcon

logger = logging.getLogger(__name__)

console = rich.get_console()

def _do_load_config(config_path: str):
    with open(os.path.join("tasks", config_path), "r") as f:
        config = yaml.load(f, Loader=yaml.FullLoader)
    return config


def load_config(config_name: str):
    if os.path.exists(os.path.join("tasks", config_name+".yml")):
        path = os.path.join("tasks", config_name+".yml")
    elif os.path.exists(os.path.join("tasks", config_name+".yaml")):
        path = os.path.join("tasks", config_name+".yaml")
    else:
        raise FileNotFoundError("No such file: {}".format(config_name))
    return _do_load_config(os.path.basename(path))


def load_configs(config_names: list):
    configs = []
    for config_name in config_names:
        configs.append(load_config(config_name))
    return configs


def load_all_configs():
    configs = []
    for file in os.listdir("tasks"):
        if file.endswith(".yml") or file.endswith(".yaml"):
            configs.append(_do_load_config(file))
    return configs


def load_rule(rule_indexs: List[int]):
    result = []
    for rule in rule_indexs:
        if os.path.exists(os.path.join("rules", rule+".yml")):
            result.append(yaml.load(
                open(os.path.join("rules", rule+".yml"), "r"), Loader=yaml.FullLoader))
        else:
            raise FileNotFoundError("No such file: {}".format(rule))
    return result


def load_all_rules():
    result = []
    for file in os.listdir("rules"):
        if file.endswith(".yml"):
            result.append(
                yaml.load(open(os.path.join("rules", file), "r"), Loader=yaml.FullLoader))
    return result


def compile_project(abs_path:str):
    # with Progress(transient=True) as progress:
    #     task = progress.add_task("Compiling", total=None, start=False)
    #     data = {
    #         "version": "0.0.1",
    #         "user": {
    #             "project": {
    #                 "workspace": f"{abs_path}"
    #             },
    #             "operation": ["detection", "dependency", "compile"],
    #             "output_format": ["standard", "compatible-ast"],
    #             "output_path": f"{os.path.join(abs_path, 'ast')}"
    #         }
    #     }
    #     json.dump(data, open(os.path.join(abs_path, 'parse-config.json'), "w"))
    #     output = subprocess.check_output(['mt-parsing', 'parse-config.json'], cwd=os.path.abspath(abs_path))
    #     if len(os.listdir(os.path.join(abs_path, "ast", "standard"))) > 0:
    #         return True
    #     else:
    #         logger.error(output)
    #         return False
    return falcon.Falcon(abs_path)


def simple_cli():
    start_time = time.time()

    parser = argparse.ArgumentParser(
                    prog='GPTScan',
                    description='GPTScan is an AI based smart contract vulnerability scanner.')
    parser.add_argument("-s", "--source", help="The source code directory", required=True)
    # not need ast, compile first
    # parser.add_argument("-a", "--ast", help="The AST directory", required=True)
    parser.add_argument("-o", "--output", help="The output file", required=True)
    parser.add_argument("-k", "--gptkey", help="The OpenAI API key", required=True)
    
    
    scan_rules = load_all_rules()
    console.log(f"Loaded [bold green]{len(scan_rules)}[/bold green] rules")
    
    source_dir = parser.parse_args().source

    try:
        falcon_instance = compile_project(source_dir)
    except:
        console.log(traceback.format_exc())
        console.log("Compile [bold red]failed[/bold red].")
        console.log("[yellow]Since the compilation is failed, some static analysis tool may not be enabled, which may cause lower precision and recall.[/yellow]")
    output_file = parser.parse_args().output
    gptkey = parser.parse_args().gptkey

    global_config.OPENAI_API_KEY = gptkey
    global_config.OPENAI_APIS.append(gptkey)

    import analyze_pipeline
    import chatgpt_api

    res, cg, meta_data = analyze_pipeline.ask_whether_has_vul_with_scenario_v9(
        source_dir, scan_rules)
    final_result = {}
    # logger.info(res)
    for file in res:
        with open(file) as f:
            source = f.read().splitlines()
            for contract in res[file]:
                for function1 in res[file][contract]:
                    
                    # I think should first ask for function 1
                    # this is a key value map for vul -> result
                    function1_tmp_result = {}

                    for function2 in res[file][contract][function1]:
                        confirmed_vuls = {}
                        for vul in res[file][contract][function1][function2]["data"]:
                            meta_data["rules_types_for_static"].add(vul["name"])
                            # if the rule need static check
                            if "static" in vul:
                                # if need static check

                                # if function1 is not asked yet, ask for function1 first
                                if vul["name"] not in function1_tmp_result:
                                    function1_detail = cg.get_function_detail(file, contract, function1)
                                    function1_text = "\n".join(open(file).read().splitlines()[int(function1_detail['loc']['start'].split(":")[0])-1:int(function1_detail['loc']['end'].split(":")[0])])
                                    try:
                                        args = []
                                        checker = vul["static"]["rule"]["name"]
                                        if "multisteps" in vul["static"] and vul["static"]["multisteps"] == True:
                                            answer = analyze_pipeline.ask_for_static_multistep(vul["static"]["prompt"], function1_text, vul["static"]["output_keys"])
                                            if "filter" in vul["static"]:
                                                for filter_variable in vul["static"]["filter"]:
                                                    if filter_variable in answer:
                                                        for var in answer[filter_variable].copy():
                                                            var_remove_flag = True
                                                            for target_feature in vul["static"]["filter"][filter_variable]:
                                                                if target_feature.lower() in var.lower():
                                                                    var_remove_flag = False
                                                                    break
                                                            if var_remove_flag == True:
                                                                answer[filter_variable].remove(var)
                                                                
                                                    else:
                                                        raise Exception("Filter variable not found")
                                        else:
                                            if "format" in vul["static"] and vul["static"]["format"] == "json":
                                                answer, raw = analyze_pipeline.ask_for_static_json(vul["static"]["prompt"], function1_text, vul["static"]["output_keys"])
                                                if "validate_description" in vul["static"]:
                                                    for to_validate_key, to_validate_values in vul["static"]["validate_description"].items():
                                                        validate_flag = True
                                                        if to_validate_key in raw and answer[to_validate_key] in raw[to_validate_key]:
                                                            for v_line in to_validate_values:
                                                                v_line_flag = False
                                                                for v in v_line:
                                                                    if v.lower() in raw[to_validate_key][answer[to_validate_key]].lower():
                                                                        v_line_flag = True
                                                                        break
                                                                validate_flag = validate_flag and v_line_flag
                                                        if validate_flag == False:
                                                            raise Exception("The description of variable did not pass the `validate_description` validation")
                                                if "exclude_variable" in vul["static"]:
                                                    for to_exclude_key, to_exclude_values in vul["static"]["exclude_variable"].items():
                                                        validate_flag = True
                                                        for var in to_exclude_values:
                                                            if var.lower() in answer[to_exclude_key].lower():
                                                                validate_flag = False
                                                                break
                                                        if validate_flag == False:
                                                            raise Exception("The description of variable did not pass the `exclude_variable` validation")
                                            elif "format" in vul["static"] and vul["static"]["format"] == "json_single":
                                                answer = analyze_pipeline.ask_for_static_json_single(vul["static"]["prompt"], function1_text, vul["static"]["output_keys"][0])
                                            elif "format" in vul["static"] and vul["static"]["format"] == "not_need":
                                                pass
                                            else:
                                                answer = analyze_pipeline.ask_for_static(vul["static"]["prompt"], function1_text, vul["static"]["output_keys"])

                                        if "multisteps" not in vul["static"] or vul["static"]["multisteps"] == False:
                                            for arg in vul["static"]["rule"]["args"]:
                                                if "CONSTANT" in arg:
                                                    args.append(arg["CONSTANT"])
                                                else:
                                                    if "format" in vul["static"] and vul["static"]["format"] == "json" or vul["static"]["format"] == "json_single":
                                                        args.append(answer[arg])
                                                    elif "format" in vul["static"] and vul["static"]["format"] == "not_need":
                                                        args = list(map(lambda x: x["constant"], vul["static"]["args"]))
                                                    else:
                                                        args.append(
                                                            answer[arg].split(" ")[0])
                                        else:
                                            for arg in vul["static"]["rule"]["args"]:
                                                if "CONSTANT" in arg:
                                                    args.append(arg["CONSTANT"])
                                                else:
                                                    args.append(answer[arg])

                                        res_1 = static_check.run_static_check(checker, args, function1, falcon_instance, function1_text)
                                        function1_tmp_result[vul["name"]] = res_1
                                    except:
                                        logger.error(
                                            "Static analysis failed: Invalid args")
                                        logger.error(f"Current File: {file}, current function: {function1}, current vul: {vul['name']}")
                                        logger.error(traceback.format_exc())
                                        # raise Exception(
                                        #     "Static analysis failed: Invalid args")
                                        function1_tmp_result[vul["name"]] = False


                                # if function1 is asked, use the result directly
                                # and ask for function2
                                res_2 = None
                                if function2 == "__ONLY_FUNCTION__":
                                    res_2 = False
                                else:
                                    try:
                                        args = []
                                        checker = vul["static"]["rule"]["name"]
                                        function2_splitted = function2.split("!!!")
                                        function2_file = function2_splitted[0]
                                        function2_contract = function2_splitted[1]
                                        function2_func = function2_splitted[2]
                                        function2_detail = cg.get_function_detail(function2_file, function2_contract, function2_func)
                                        function2_text = "\n".join(open(function2_file).read().splitlines()[int(function2_detail['loc']['start'].split(":")[0])-1:int(function2_detail['loc']['end'].split(":")[0])])
                                        if "multisteps" in vul["static"] and vul["static"]["multisteps"] == True:
                                            answer = analyze_pipeline.ask_for_static_multistep(vul["static"]["prompt"], function2_text, vul["static"]["output_keys"])
                                        else:
                                            if "format" in vul["static"] and vul["static"]["format"] == "json":
                                                answer, raw = analyze_pipeline.ask_for_static_json(vul["static"]["prompt"], function2_text, vul["static"]["output_keys"])
                                                if "validate_description" in vul["static"]:
                                                    for to_validate_key, to_validate_values in vul["static"]["validate_description"].items():
                                                        validate_flag = True
                                                        if to_validate_key in raw and answer[to_validate_key] in raw[to_validate_key]:
                                                            for v_line in to_validate_values:
                                                                v_line_flag = False
                                                                for v in v_line:
                                                                    if v.lower() in raw[to_validate_key][answer[to_validate_key]].lower():
                                                                        v_line_flag = True
                                                                        break
                                                                validate_flag = validate_flag and v_line_flag
                                                        if validate_flag == False:
                                                            raise Exception("The description of variable did not pass the validation")
                                                if "exclude_variable" in vul["static"]:
                                                    for to_exclude_key, to_exclude_values in vul["static"]["exclude_variable"].items():
                                                        validate_flag = True
                                                        for var in to_exclude_values:
                                                            if var.lower() in answer[to_exclude_key].lower():
                                                                validate_flag = False
                                                                break
                                                        if validate_flag == False:
                                                            raise Exception("The description of variable did not pass the `exclude_variable` validation")
                                            elif "format" in vul["static"] and vul["static"]["format"] == "json_single":
                                                answer = analyze_pipeline.ask_for_static_json_single(vul["static"]["prompt"], function2_text, vul["static"]["output_keys"][0])
                                            elif "format" in vul["static"] and vul["static"]["format"] == "not_need":
                                                pass
                                            else:
                                                answer = analyze_pipeline.ask_for_static(vul["static"]["prompt"], function2_text, vul["static"]["output_keys"])

                                        if "multisteps" not in vul["static"] or vul["static"]["multisteps"] == False:
                                            for arg in vul["static"]["rule"]["args"]:
                                                if "CONSTANT" in arg:
                                                    args.append(arg["CONSTANT"])
                                                else:
                                                    if "format" in vul["static"] and vul["static"]["format"] == "json" or vul["static"]["format"] == "json_single":
                                                        args.append(answer[arg])
                                                    elif "format" in vul["static"] and vul["static"]["format"] == "not_need":
                                                        args = list(map(lambda x: x["constant"], vul["static"]["args"]))
                                                    else:
                                                        args.append(
                                                            answer[arg].split(" ")[0])
                                        else:
                                            for arg in vul["static"]["rule"]["args"]:
                                                if "CONSTANT" in arg:
                                                    args.append(arg["CONSTANT"])
                                                else:
                                                    args.append(answer[arg])
                                        res_2 = static_check.run_static_check(checker, args, function2_func, falcon_instance, function2_text)
                                    except:
                                        logger.error(
                                            "Static analysis failed: Invalid args")
                                        logger.error(f"Current File: {file}, current function: {function1}, current vul: {vul['name']}")
                                        logger.error(traceback.format_exc())
                                        res_2 = False
                                

                                # if function1 and function2 are both asked, merge the result
                                confirmed_vuls[vul["name"]]={"StaticAnalysis": function1_tmp_result[vul["name"]] or res_2}

                            else:
                                confirmed_vuls[vul["name"]]={"StaticAnalysis": "Not Needed"}
                        if len(confirmed_vuls)>0:
                            if file not in final_result:
                                final_result[file] = {}
                            if contract not in final_result[file]:
                                final_result[file][contract] = {}
                            if function1 not in final_result[file][contract]:
                                final_result[file][contract][function1] = {}
                            final_result[file][contract][function1][function2] = confirmed_vuls

    num_true = 0
    num_false = 0
    for file_, file_data_ in final_result.items():
        for contract_, contract_data_ in file_data_.items():
            for function1_, function1_data_ in contract_data_.items():
                for function2_, function2_data_ in function1_data_.items():
                    for vul_, vul_data_ in function2_data_.items():
                        if "StaticAnalysis" in vul_data_:
                            if vul_data_["StaticAnalysis"] == False:
                                num_false += 1
                            else:
                                meta_data["files_after_static"].add(file_)
                                meta_data["contracts_after_static"].add(file_+"!!!"+contract_)
                                meta_data["functions_after_static"].add(file_+"!!!"+contract_+"!!!"+function1_)
                                if function2_ != "__ONLY_FUNCTION__":
                                    meta_data["files_after_static"].add(function2_.split("!!!")[0])
                                    meta_data["contracts_after_static"].add(function2_.split("!!!")[0]+"!!!"+function2_.split("!!!")[1])
                                    meta_data["functions_after_static"].add(function2_)
                                meta_data["rules_types_after_static"].add(vul_)
                                num_true += 1

    # json.dump(res, open(output_file, "w"), indent=4)
    output_json = utils.convert_output(final_result, scan_rules, cg, source_dir)

    meta_data["used_time"]= time.time()-start_time  # 花费时间，单位为秒
    meta_data["vul_before_static"] = num_true + num_false   # 静态分析前，第二次交互为yes的数量，可能有重复（A和A+B）
    meta_data["vul_after_static"] = num_true    # 静态分析后，结果不为False的数量（之前有不需要静态分析的，现在没了）
    meta_data["vul_after_merge"] = len(output_json["results"])  # 去重后的结果数量

    meta_data["token_sent"] = chatgpt_api.tokens_sent.value # 发送的Token数量
    meta_data["token_received"] = chatgpt_api.tokens_received.value # 接收的Token数量
    meta_data["token_sent_gpt4"] = chatgpt_api.tokens_sent_gpt4.value # 发送的Token数量
    meta_data["token_received_gpt4"] = chatgpt_api.tokens_received_gpt4.value # 接收的Token数量
    meta_data["estimated_cost"] = (meta_data["token_sent"] * global_config.SEND_PRICE) + (meta_data["token_received"] * global_config.RECEIVE_PRICE) + (meta_data["token_sent_gpt4"] * global_config.GPT4_SEND_PRICE) + (meta_data["token_received_gpt4"] * global_config.GPT4_RECEIVE_PRICE)# 预估的花费

    for metadata_key, metadata_value in meta_data.copy().items():
        if isinstance(metadata_value, set):
            meta_data[metadata_key] = len(metadata_value)

    # logger.info("============= Summary ===============")
    # logger.info(json.dumps(meta_data))

    summary_table = Table(title="Summary")
    summary_table.add_column("Key")
    summary_table.add_column("Value")
    summary_table.add_row("Files", str(meta_data["files"]))
    summary_table.add_row("Contracts", str(meta_data["contracts"]))
    summary_table.add_row("Functions", str(meta_data["functions"]))
    summary_table.add_row("Lines of Code", str(meta_data["loc"]))
    summary_table.add_row("Used Time", str(meta_data["used_time"]))
    summary_table.add_row("Estimated Cost (USD)", str(meta_data["estimated_cost"]))

    console.print(summary_table)


    json.dump(output_json, open(output_file, "w"), indent=4)
    json.dump(meta_data, open(output_file+".metadata.json", "w"), indent=4)
