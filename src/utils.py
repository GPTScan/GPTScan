from typing import List, Dict, Callable
from antlr4helper.callgraph import CallGraph
import os
import logging
import rich
from rich.table import Table

console = rich.get_console()

logger = logging.getLogger(__name__)

def split_answer_section(answer_keys:List[str], response:str) -> Dict[str, str]:
    """
    Split the response into sections based on the answer keys.
    """
    current_section = None
    answer = {}
    for line in response.splitlines():
        is_key_flag = False
        for key in answer_keys:
            if line.startswith(key):
                current_section = key
                answer[key] = line[len(key)+1:].strip()
                is_key_flag = True
                break
        if not is_key_flag and current_section is not None:
            answer[current_section] += line
    
    return answer

def try_to_handle_too_long_code(render_target_func:Callable, code_segments:List[str], statements:List[str], *args) -> List[str]:
    """
    Try to handle the too long code problem. By divid and conqure code segments.
    """
    pass
    


def clean_the_origin_output(origin_output:Dict) -> Dict:
    sig_vul_map = {}
    for file_, file_data_ in origin_output.items():
        for contract_, contract_data_ in file_data_.items():
            for functionA_, functionA_data_ in contract_data_.items():
                # visit ONLY FUNCTION first
                self_vul = set()
                if "__ONLY_FUNCTION__" in functionA_data_:
                    for vul_type in functionA_data_["__ONLY_FUNCTION__"]:
                        if "StaticAnalysis" in functionA_data_["__ONLY_FUNCTION__"][vul_type] and functionA_data_["__ONLY_FUNCTION__"][vul_type]["StaticAnalysis"] != False:
                            self_vul.add(vul_type)
                sig_vul_map[f"{file_}!!!{contract_}!!!{functionA_}"] = self_vul

    to_remove = {}

    for file_, file_data_ in origin_output.items():
        for contract_, contract_data_ in file_data_.items():
            for functionA_, functionA_data_ in contract_data_.items():
                for functionB_sig_, functionB_data_ in functionA_data_.items():
                    if functionB_sig_ == "__ONLY_FUNCTION__":
                        continue
                    for vul_type in functionB_data_:
                        if "StaticAnalysis" in functionB_data_[vul_type] and functionB_data_[vul_type]["StaticAnalysis"] != False:
                            if f"{file_}!!!{contract_}!!!{functionA_}" in sig_vul_map and vul_type in sig_vul_map[f"{file_}!!!{contract_}!!!{functionA_}"]:
                                to_remove[f"{file_}!!!{contract_}!!!{functionA_}!!!{functionB_sig_}!!!{vul_type}"] = True
                                logger.info(f"Remove the redundant result: {file_}!!!{contract_}!!!{functionA_}!!!{functionB_sig_}!!!{vul_type}")
                            elif functionB_sig_ in sig_vul_map and vul_type in sig_vul_map[functionB_sig_]:
                                to_remove[f"{file_}!!!{contract_}!!!{functionA_}!!!{functionB_sig_}!!!{vul_type}"] = True
                                logger.info(f"Remove the redundant result: {file_}!!!{contract_}!!!{functionA_}!!!{functionB_sig_}!!!{vul_type}")

    # remove the redundant result
    for file_, file_data_ in origin_output.copy().items():
        for contract_, contract_data_ in file_data_.copy().items():
            for functionA_, functionA_data_ in contract_data_.copy().items():
                for functionB_sig_, functionB_data_ in functionA_data_.copy().items():
                    if f"{file_}!!!{contract_}!!!{functionA_}!!!{functionB_sig_}!!!{vul_type}" in to_remove:
                        origin_output[file_][contract_][functionA_].pop(functionB_sig_)
    
    return origin_output


def convert_output(origin_output:Dict, scan_rules:List[Dict], cg:CallGraph, base_dir:str) -> Dict:
    res = {
        "version": "1.1.0",
        "success": True, 
        "message": None,
        "results": [
            
        ]
    }
    # logger.info("Output before clean")
    # logger.info(origin_output)
    origin_output = clean_the_origin_output(origin_output)
    # logger.info("Output after clean")
    # logger.info(origin_output)

    for filename in origin_output:
        for contract in origin_output[filename]:
            for functionA in origin_output[filename][contract]:
                for functionB_sig in origin_output[filename][contract][functionA]:
                    for vul_type in origin_output[filename][contract][functionA][functionB_sig]:
                        if "StaticAnalysis" in origin_output[filename][contract][functionA][functionB_sig][vul_type] and origin_output[filename][contract][functionA][functionB_sig][vul_type]["StaticAnalysis"] != False:
                            detail = cg.get_function_detail(filename, contract, functionA)
                            start_line = int(detail['loc']['start'].split(":")[0])
                            end_line = int(detail['loc']['end'].split(":")[0])
                            rel_path = os.path.abspath(filename)

                            for rule in scan_rules:
                                if vul_type == rule["name"]:
                                    title = rule["output"]["title"]
                                    description = rule["output"]["description"]
                                    recommendation = rule["output"]["recommendation"]
                                    break
                            if functionB_sig == "__ONLY_FUNCTION__":
                                result = {
                                    "code": vul_type,
                                    "severity": "HIGH",
                                    "title": title,
                                    "description": description,
                                    "recommendation": recommendation,
                                    "affectedFiles": [
                                        {
                                        "filePath": rel_path,
                                        "range": {
                                            "start": {
                                            "line": start_line
                                            },
                                            "end": {
                                            "line": end_line
                                            }
                                        },
                                        "highlights": []
                                        }
                                    ]
                                }

                                res["results"].append(result)
                            else:
                                try:
                                    detail_b = cg.get_function_detail(*(functionB_sig.split("!!!")))
                                    start_line_b = int(detail_b['loc']['start'].split(":")[0])
                                    end_line_b = int(detail_b['loc']['end'].split(":")[0])
                                    if detail_b == detail:
                                        raise Exception("Same function")
                                    result = {
                                        "code": vul_type,
                                        "severity": "HIGH",
                                        "title": title,
                                        "description": description,
                                        "recommendation": recommendation,
                                        "affectedFiles": [
                                            {
                                                "filePath": rel_path,
                                                "range": {
                                                    "start": {
                                                    "line": start_line
                                                    },
                                                    "end": {
                                                    "line": end_line
                                                    }
                                                },
                                                "highlights": []
                                            },
                                            {
                                                "filePath": functionB_sig.split("!!!")[0],
                                                "range": {
                                                    "start": {
                                                    "line": start_line_b
                                                    },
                                                    "end": {
                                                    "line": end_line_b
                                                    }
                                                },
                                                "highlights": []
                                            }
                                        ]
                                    }
                                except:
                                    logger.warning("Cannot find functionB or same function")
                                    result = {
                                        "code": vul_type,
                                        "severity": "HIGH",
                                        "title": title,
                                        "description": description,
                                        "recommendation": recommendation,
                                        "affectedFiles": [
                                            {
                                            "filePath": rel_path,
                                            "range": {
                                                "start": {
                                                "line": start_line
                                                },
                                                "end": {
                                                "line": end_line
                                                }
                                            },
                                            "highlights": []
                                            }
                                        ]
                                    }

                                res["results"].append(result)
    

    # remove redundant result
    tmp_list = res["results"]
    res["results"] = []
    for result in tmp_list:
        dup_flag = False
        for result_added in res["results"]:
            if result["code"] == result_added["code"] and result["affectedFiles"][0]["filePath"] == result_added["affectedFiles"][0]["filePath"] and result["affectedFiles"][0]["range"]["start"]["line"] == result_added["affectedFiles"][0]["range"]["start"]["line"] and result["affectedFiles"][0]["range"]["end"]["line"] == result_added["affectedFiles"][0]["range"]["end"]["line"] and len(result["affectedFiles"]) == len(result_added["affectedFiles"]):
                dup_flag = True
                break
        if not dup_flag:
            res["results"].append(result)
    
    # printing output:
    table = Table("Type", "Description", "Affected Files",title="Scan Results", show_lines=True)
    for result in res["results"]:
        afftected_table = Table("File Path", "Line Range", "Code")
        for affectedFile in result["affectedFiles"]:
            afftected_table.add_row(affectedFile["filePath"], f"{affectedFile['range']['start']['line']} - {affectedFile['range']['end']['line']}", "\n".join(open(affectedFile["filePath"]).readlines()[affectedFile['range']['start']['line']-1:affectedFile['range']['end']['line']]))
        table.add_row(result["title"].split(":")[1].strip(), result["description"], afftected_table)
    console.print(table)
    return res
