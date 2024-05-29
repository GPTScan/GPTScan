import logging

logger = logging.getLogger(__name__)
from falcon.__main__ import process_single, get_detectors_and_printers, parse_args
from falcon import Falcon
import os
import sys
from falcon.analyses.data_dependency.data_dependency import is_dependent
from falcon.analyses.data_dependency.data_dependency import is_tainted
from falcon.ir.operations.binary import Binary, BinaryType
from falcon.ir.operations.assignment import Assignment
from falcon.ir.operations.call import Call
from falcon.ir.operations.return_operation import Return
from falcon.ir.variables import Constant
from falcon.ir.variables import ReferenceVariable
from falcon.ir.operations.lvalue import OperationWithLValue
from falcon.ir.operations.high_level_call import HighLevelCall
from falcon.ir.operations.internal_call import InternalCall
import subprocess
import json
import traceback

TEST_DIR = "/data/yuqiang/Web3Bugs/contracts/5/standard"

detectors, printers = get_detectors_and_printers()


def compile_project(project_dir: str) -> str:
    # generate config json
    config = {
        "version": "0.0.1",
        "user": {
            "project": {
                "workspace": os.path.abspath(project_dir)
            },
            "operation": ["detection", "dependency", "compile"],
            "output_format": ["standard", "compatible-ast"],
            "output_path": os.path.abspath(project_dir)
        }
    }
    json.dump(config, open("project-config.json", "w"))

    # run mt-parsing
    subprocess.run(["mt-parsing", "project-config.json"])

    # remove config json
    os.remove("project-config.json")


def load_file(falcon_base_dir: str, sol_file_path: str) -> Falcon:
    try:
        filename = os.path.basename(sol_file_path)
        fullpath = None
        for file in os.listdir(falcon_base_dir):
            if filename in file:
                fullpath = os.path.join(falcon_base_dir, file)
                break
        if fullpath is None:
            filename = "contracts.json"
            for file in os.listdir(falcon_base_dir):
                if filename in file:
                    fullpath = os.path.join(falcon_base_dir, file)
                    break
            if fullpath is None:
                raise Exception(f"File {fullpath} not found")
        sys.argv = ["--solc-ast", falcon_base_dir, "--json", os.path.abspath(os.path.join(
            falcon_base_dir, os.pardir, fullpath)), "--filter-paths=node_modules"]
        args = parse_args(detectors, printers)
        (
            falcon_instance,
            results_detectors_tmp,
            results_printers_tmp,
            number_contracts_tmp,
        ) = process_single(fullpath, args, [], [])
        return falcon_instance
    except:
        logger.error(traceback.format_exc())
        return None


def find_data_dependency(source: str, sink: str, function: str, falcon: Falcon):
    for contract in falcon.contracts:
        for fn in contract.functions:
            if function == fn.name:
                source_ = None
                sink_ = None
                # support temp vars

                for node in fn.nodes:
                    for ir in node.irs:
                        if isinstance(ir, HighLevelCall):
                            # if is a call, check the call it self and all its arguments
                            for arg in ir.arguments:
                                if arg.name == source:
                                    source_ = arg
                                if arg.name == sink:
                                    sink_ = arg
                        elif isinstance(ir, Assignment):
                            for var in ir.variables:
                                if var.name == source:
                                    source_ = var
                                if var.name == sink:
                                    sink_ = var

                for var in fn.variables:
                    if var.name == source:
                        source_ = var
                    if var.name == sink:
                        sink_ = var
                for var in contract.variables:
                    if var.name == source:
                        source_ = var
                    if var.name == sink:
                        sink_ = var


                if source_ is None or sink_ is None:
                    continue
                if is_dependent(sink_, source_, fn):
                    return True
    return False


def first_deposit_check(current_pool_var: str, deposit_amount: str, total_share: str, function: str, falcon: Falcon):
    for contract in falcon.contracts:
        for fn in contract.functions:
            if function == fn.name:
                deposit_amount_ = None
                total_share_ = None
                for node in fn.nodes:
                    for ir in node.irs:
                        if isinstance(ir, Assignment):
                            try:
                                in_file = fn.contract.source_mapping.filename.absolute
                                in_file_str = open(in_file, "rb").read()
                                start=node.source_mapping.start
                                stop=start+node.source_mapping.length
                                text = in_file_str[start:stop].decode("utf-8")
                                left_part = text[:text.index("=")].strip()
                                right_part = text[text.index("=")+1:].strip()

                                if total_share in left_part and deposit_amount in right_part:
                                    return True
                            except:
                                # breakpoint()
                                logger.error(traceback.format_exc())
                                continue
                        elif isinstance(ir, HighLevelCall):
                            try:
                                in_file = fn.contract.source_mapping.filename.absolute
                                in_file_str = open(in_file, "rb").read()
                                start=node.source_mapping.start
                                stop=start+node.source_mapping.length
                                text = in_file_str[start:stop].decode("utf-8")

                                args_text = text[text.index("("):text.rindex(")")+1]
                                if deposit_amount in args_text and ir.function.name.lower().endswith("mint"):
                                    return True
                            except:
                                # breakpoint()
                                logger.error(traceback.format_exc())
                                continue
                        elif isinstance(ir, InternalCall):
                            try:
                                in_file = fn.contract.source_mapping.filename.absolute
                                in_file_str = open(in_file, "rb").read()
                                start=node.source_mapping.start
                                stop=start+node.source_mapping.length
                                text = in_file_str[start:stop].decode("utf-8")

                                args_text = text[text.index("("):text.rindex(")")+1]
                                if deposit_amount in args_text and ir.function.name.lower().endswith("mint"):
                                    return True
                            except:
                                # breakpoint()
                                logger.error(traceback.format_exc())
                                continue
                #         if isinstance(ir, Return):
                #             for ret in ir.values:
                #                 if ret.name == deposit_amount:
                #                     deposit_amount_ = ret
                #                 if ret.name == total_share:
                #                     total_share_ = ret
                #         if isinstance(ir, HighLevelCall):
                #             # if is a call, check the call it self and all its arguments
                #             for arg in ir.arguments:
                #                 if arg.name == deposit_amount_:
                #                     deposit_amount_ = arg
                #                 if arg.name == total_share_:
                #                     total_share_ = arg
                #         elif isinstance(ir, Assignment):
                #             for var in ir.variables:
                #                 if var.name == deposit_amount_:
                #                     deposit_amount_ = var
                #                 if var.name == total_share_:
                #                     total_share_ = var
                # for var in fn.variables:
                #     if var.name == deposit_amount:
                #         deposit_amount_ = var
                #     if var.name == total_share:
                #         total_share_ = var
                # for var in contract.variables:
                #     if var.name == deposit_amount:
                #         deposit_amount_ = var
                #     if var.name == total_share:
                #         total_share_ = var


                # total_equal_deposit_flag = False


                # for node in fn.nodes:
                #     for ir in node.irs:
                #         if isinstance(ir, Assignment):
                #             if ir.lvalue == total_share_ and ir.rvalue == deposit_amount_:
                #                 # there is a condition that total share is equal to deposit amount7
                #                 total_equal_deposit_flag = True
                # if total_equal_deposit_flag:
                #     return True
    return False


def is_arg_taint(call: str, arg_index: int, function:str, falcon:Falcon):
    for contract in falcon.contracts:
        for fn in contract.functions_declared:
            if fn.name != function:
                continue
            if fn.is_constructor or fn.is_protected():
                continue
            for node in fn.nodes:
                has_tainted_int_result = False
                tainted_node = None

                for ir in node.irs:
                    if isinstance(ir, HighLevelCall):
                        func_name = ir.function_name
                        if func_name == call:
                            
                            if len(ir.arguments) == 4:
                                target_param = ir.arguments[1]
                            elif len(ir.arguments) == 3:
                                target_param = ir.arguments[0]
                            else:
                                target_param = ir.arguments[arg_index]
                            # print(target_param)
                            if is_tainted(target_param, fn, only_unprotected=True) and target_param.name != "msg.sender":
                                return True
    return False

