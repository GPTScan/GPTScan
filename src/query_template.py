from typing import List, Dict


def prompt1_v1(code_segments: List[str], statements: List[str]) -> str:
    question_template_3 = 'Now I give you a piece of vulnerable smart contract code (in a paragraph called "VulnerableCode:") and the corresponding description about its vulnerability impact (in a paragraph called "VulnerabilityImpact:"), please use natural language to summarize a key sentence from Sentence %s of "VulnerabilityImpact:" so that it can summarize the vulnerability impact (strictly no other information) of "VulnerableCode:". Please output this key sentence in "KeySentence:". In the key sentence, there should not exists any information about function name or line number.\n\n'
    # count statements
    statements_number_str = "1" if len(
        statements) == 1 else f"1-{len(statements)}"
    res = question_template_3 % (statements_number_str)
    # add code segments
    code_segments_str = "VulnerableCode:\n"
    for code in code_segments:
        code_segments_str += code
        code_segments_str += "\n"
    res += code_segments_str
    res += "\n"
    # add statements
    statements_str = "VulnerabilityImpact:\n"
    for index, state in enumerate(statements):
        statements_str += f"- Sentence {index + 1}: {state}\n"
    res += statements_str
    return res


def prompt1_v2(code_segments: List[str], statements: List[List[str]]) -> str:
    question_template_4 = """
Now I give you a piece of vulnerable smart contract code (in a paragraph called "VulnerableCode:") and the corresponding description about its vulnerability impact (in a paragraph called "VulnerabilityImpact:").
- Please use natural language to summarize a key sentence from Sentence %s of "VulnerabilityImpact:" so that it can summarize the vulnerability impact (strictly no other information) of "VulnerableCode:".
- Moreover, this key sentence should use only natural English words or numbers (i.e., for all the words with brackets () or quotation marks ``, MUST transform them to the equivalent English version with no brackets and quotation marks).
- Please output the final key sentence starting with "KeySentence:".\n\n"""
    # count statements
    statements_number_str = "1" if len(
        statements) == 1 else f"1-{len(statements)}"
    res = question_template_4 % (statements_number_str)
    # add code segments
    code_segments_str = "VulnerableCode:\n"
    for code in code_segments:
        code_segments_str += code
        code_segments_str += "\n"
    res += code_segments_str
    # res += "\n"
    # add statements
    statements_str = "VulnerabilityImpact:\n"
    for index, state in enumerate(statements):
        statements_str += f"- Sentence {index + 1}: {state[1]}\n"
    res += statements_str
    return res


def prompt1_v3(code_segments: List[str], statements: List[List[str]]) -> str:
    question_template_4 = """
Now I give you a piece of vulnerable smart contract code (in a paragraph called "VulnerableCode:") and the corresponding description about its vulnerability impact (in a paragraph called "VulnerabilityImpact:").
- Please use natural language to summarize a key sentence from given sentences of "VulnerabilityImpact:" so that it can summarize the vulnerability impact (strictly no other information) of "VulnerableCode:".
- Moreover, this key sentence should use only natural English words or numbers (i.e., for all the words with brackets () or quotation marks ``, MUST transform them to the equivalent English version with no brackets and quotation marks).
- Please output the final key sentence starting with "KeySentence:".\n\n"""
    res = question_template_4
    # add code segments
    code_segments_str = "VulnerableCode:\n"
    for code in code_segments:
        code_segments_str += code
        code_segments_str += "\n"
    res += code_segments_str
    # res += "\n"
    # add statements
    statements_str = "VulnerabilityImpact:\n"
    for index, state in enumerate(statements):
        statements_str += f"- {state[0]}: {state[1]}\n"
    res += statements_str
    return res


def prompt1_v4(code_segments: List[str], statements: List[List[str]]) -> str:
    question_template_4 = """
Now I give you a piece of vulnerable smart contract code (in a paragraph called "VulnerableCode:") and the corresponding description about its vulnerability impact (in a paragraph called "VulnerabilityImpact:").
- Please use natural language to summarize a key sentence from (%s) of "VulnerabilityImpact:" so that it can summarize the vulnerability impact (strictly no other information) of "VulnerableCode:".
- Moreover, this key sentence should use only natural English words or numbers (i.e., for all the words with brackets () or quotation marks ``, MUST transform them to the equivalent English version with no brackets and quotation marks).
- Please output the final key sentence starting with "KeySentence:".\n\n"""
    # count statements
    statements_number_str = "S1" if len(
        statements) == 1 else f"S1 to S{len(statements)}"
    res = question_template_4 % (statements_number_str)
    # add code segments
    code_segments_str = "VulnerableCode:\n"
    for code in code_segments:
        code_segments_str += code
        code_segments_str += "\n"
    res += code_segments_str
    # res += "\n"
    # add statements
    statements_str = "VulnerabilityImpact:\n"
    for index, state in enumerate(statements):
        statements_str += f"- (S{index + 1}) {state[0]}: {state[1]}\n"
    res += statements_str
    return res


def prompt1_v5(code_segments: List[str], statements: List[List[str]]) -> str:
    question_template = """
Now I give you a piece of vulnerable smart contract code (in a paragraph called "VulnerableCode:") and the corresponding description about its vulnerability impact (in a paragraph called "VulnerabilityImpact:").
- Please describe the vulnerability (in a paragraph called "Description:").
- Please use natural language to summarize the vulnerability in ONLY ONE sentence. Do not include mitigation in this sentence.
- Moreover, this key sentence should use only natural English words or numbers (i.e., for all the words with brackets () or quotation marks ``, MUST transform them to the equivalent English version with no brackets and quotation marks).
- Please output the summarized sentence starting with "KeySentence:".
    """
    res = question_template
    code_segments_str = "VulnerableCode:\n"
    for code in code_segments:
        code_segments_str += code
        code_segments_str += "\n"
    res += code_segments_str

    statements_str = "VulnerabilityImpact:\n"
    for index, state in enumerate(statements):
        statements_str += f"- (S{index + 1}) {state[0]}: {state[1]}\n"
    res += statements_str
    return res

def prompt1_v6(code_segments: List[str], statements: List[List[str]]) -> str:
    question_template = """
Now I give you a piece of vulnerable smart contract code (in a paragraph called "VulnerableCode:") and the corresponding description about its vulnerability impact (in a paragraph called "VulnerabilityImpact:").
- Please describe the vulnerability (in a paragraph called "Description:").
- Please use natural language to summarize the vulnerability in ONLY ONE sentence. Do not include mitigation in this sentence.
- Moreover, this key sentence should use only natural English words or numbers (i.e., for all the words with brackets () or quotation marks ``, MUST transform them to the equivalent English version with no brackets and quotation marks).
- Please output the summarized sentence starting with "KeySentence:".
- Please use only one word to summarize the scenario that the vulnerability would be triggered. This word should be summarized from function names and output in a sentence starts with "Scenario:".
    """
    res = question_template
    code_segments_str = "\nVulnerableCode:\n"
    for code in code_segments:
        code_segments_str += code
        code_segments_str += "\n"
    res += code_segments_str

    statements_str = "VulnerabilityImpact:\n"
    for index, state in enumerate(statements):
        statements_str += f"- (S{index + 1}) {state[0]}: {state[1]}\n"
    res += statements_str
    return res


def render_templete_whether_has_vul_v1(code_segments: List[str], statements: List[str]) -> str:
    question_template = f"""
In the following smart contract code (with a paragraph called "Code:"), does it have a vulnerability called "{' '.join(statements)}"?
- First, please answer the question in one word, yes or no, with a key called "Answer:".
- If yes, please use the given code to describe the root cause of this vulnerability with a key called "Description:", generate a corresponding patch code example with a key called "PatchCode:", and output a PoC code example with a key called "ProofOfConcept:".
- If not, please output an empty paragraph with a key called "NoVulnerability:".
- Please strictly follow the format I mentioned using "Description:", "PatchCode:", "ProofOfConcept:" (for the yes case), or "NoVulnerability:" (for the no case).
"""
    # add code segments
    code_segments_str = "Code:\n"
    for code in code_segments:
        code_segments_str += code
        code_segments_str += "\n"
    question_template += code_segments_str
    return question_template


def render_templete_whether_has_vul_v2(code_segments: List[str], statements: List[str]) -> str:
    question_template = f"""
In the following smart contract code (with a paragraph called "Code:"), does it have a vulnerability called "{' '.join(statements)}"?
- First, please answer the question in one word, yes or no, with a key called "Answer:".
- If yes, please tell me the function name and line number of the vulnerable code with a key called "Location:".
- If yes, please use the given code to describe the root cause of this vulnerability with a key called "Description:", generate a corresponding patch code example with a key called "PatchCode:", and output a PoC code example with a key called "ProofOfConcept:".
- If not, please output an empty paragraph with a key called "NoVulnerability:".
- Please strictly follow the format I mentioned using "Description:", "PatchCode:", "ProofOfConcept:" (for the yes case), or "NoVulnerability:" (for the no case).
"""
    # add code segments
    code_segments_str = "Code:\n"
    for code in code_segments:
        code_segments_str += code
        code_segments_str += "\n"
    question_template += code_segments_str
    return question_template


def render_template_vul_multiple_choose_v1(code_segments: List[str], statements: List[str]) -> str:
    question_template = """
In the following smart contract code (with a paragraph called "Code:"), choose only one of the following statements (with a paragraph callded "Statements:") that most satifies the given code.
- First, please answer the question with the number of statement, with a key called "Answer:".
- If the last option is not chosen, please tell me the function name of the vulnerable code with a key called "Location:".
- If the last option is not chosen, please use the given code to describe the root cause of this vulnerability with a key called "Description:", generate a corresponding patch code example with a key called "PatchCode:".
- Please strictly follow the format I mentioned using "Answer:", "Location:", "Description:", "PatchCode:".

Statements:"""
    # add statements
    for index, statement in enumerate(statements):
        question_template += f"\n{index + 1}. {statement}"
    question_template += f"\n{len(statements)+1}. The given code have no logical vulnerability. Although there may have other vulnerabilities, these vulnerabilities were not mentioned above."
    # add code
    question_template += "\n\nCode:\n```solidity\n"
    question_template += "\n".join(code_segments)
    question_template += "\n```"

    return question_template

def render_template_vul_multiple_choose_v2(code_segments: List[str], statements: List[str]) -> str:
    question_template = """
In the following smart contract code (with a paragraph called "Code:"), vulnerable to only one of the following vulnerability patterns (in a paragraph callded "Patterns:")?
- First, please answer the question with the number of statement, with a key called "Answer:".
- If the last option is not chosen, please tell me the function name of the vulnerable code with a key called "Location:".
- If the last option is not chosen, please use the given code to describe the root cause of this vulnerability with a key called "Description:", generate a corresponding patch code example with a key called "PatchCode:".
- Please strictly follow the format I mentioned using "Answer:", "Location:", "Description:", "PatchCode:".
"""
    # add code
    question_template += "\n\nCode:\n```solidity\n"
    question_template += "\n".join(code_segments)
    question_template += "\n```"
     # add statements
    question_template += "\n\nPatterns:"
    for index, statement in enumerate(statements):
        question_template += f"\n{index + 1}. {statement}"
    question_template += f"\n{len(statements)+1}. The given code have no logical vulnerability. Although there may have other vulnerabilities, these vulnerabilities were not mentioned above."

    return question_template

def render_template_vul_multiple_choose_v3(code_segments: List[str], statements: List[str], filename:str) -> str:
    question_template = f"""
In the following smart contract code (with a paragraph called "Code:") in file `{filename}`, vulnerable to only one of the following vulnerability patterns (in a paragraph callded "Patterns:")?
- First, please answer the question with the number of statement, with a key called "Answer:".
- If the last option is not chosen, please tell me the function name of the vulnerable code with a key called "Location:".
- If the last option is not chosen, please use the given code to describe the root cause of this vulnerability with a key called "Description:", generate a corresponding patch code example with a key called "PatchCode:".
- Please strictly follow the format I mentioned using "Answer:", "Location:", "Description:", "PatchCode:".
"""
    # add code
    question_template += "\n\nCode:\n```solidity\n"
    question_template += "\n".join(code_segments)
    question_template += "\n```"
     # add statements
    question_template += "\n\nPatterns:"
    for index, statement in enumerate(statements):
        question_template += f"\n{index + 1}. {statement}"
    question_template += f"\n{len(statements)+1}. The given code have no logical vulnerability. Although there may have other vulnerabilities, these vulnerabilities were not mentioned above."

    return question_template

def render_template_vul_multiple_choose_v4(code_segments: List[str], statements: List[str]) -> str:
    question_template = f"""Now I give you a list of logic smart contract vulnerability patterns in "Pattern:" and a piece of smart contract code in "Code:" that I want you to analyze. Please check whether the given smart contract "Code:" from the file `NFTXLPStaking.sol` vulnerable to one of the given patterns?
- If yes, please output the result in the format of "Answer: ID", where "ID" is the ID of the matched pattern. In this case, please also output the root cause of this vulnerability in a paragraph called "Description:" and generate the corresponding patch code example in a paragraph called "PatchCode:".
- If not, i.e., the given code is not vulnerable to any given Pattern, please only output "Answer: NoPatternMatched".
"""
    # add patterns
    question_template += "\n\nPattern:"
    for index, statement in enumerate(statements):
        question_template += f"\n{index + 1}. {statement}"
    
    # add code
    question_template += "\n\nCode:\n```solidity\n"
    question_template += "\n".join(code_segments)
    question_template += "\n```"

    return question_template


def render_template_function_to_focus_v1(filename:str, function_list:List[str], statements:List[Dict[str,str]]) -> str:
    question_template = f"""
In the following functions from file `{filename}` (in a paragraph called "Functions", splited by comma), which of them may be vulnerable from the following statements (in a paragraph called "Statements")?
- For each statement in paragraph "Statements", the statement will have three sections, which are one-sentence description (starts with "KeySentence:"), scenario (starts with "Scenario:") and functions name that may be affects (starts with "FunctionNames:").
- Give you answer in a paragraph called "Result". If the answer contains more than one function name, split it with comma.
- If none of the functions are related to the statements above, please answer in one word "None".
    """

    # add functions
    question_template += "\n\nFunctions: "
    question_template += ", ".join(function_list)

    # add statements
    question_template += "\n\nStatements:"
    for index, statement in enumerate(statements):
        question_template += f"\n{index + 1}."
        question_template += f"\nKeySentence. {statement['KeySentence']}"
        question_template += f"\nScenario: {statement['Scenario']}"
        question_template += f"\nFunctionNames: {statement['FunctionNames'].replace(' ',', ')}"
    
    return question_template


def render_template_function_to_focus_v2(function_list:List[str], statements:List[Dict[str,str]]) -> str:
    question_template = """
    Please pick up all the function names in "FunctionNames A:" that are related or similar to one or more function names in "FunctionNames B:" and output them to "FunctionNames C:".
    """
    # add FunctionNames A
    question_template += "\n\nFunctionNames A: \n"
    question_template += ", ".join(function_list)

    # add FunctionNames B
    question_template += "\n\nFunctionNames B: \n"
    functionB = set()
    for statement in statements:
        for f in statement['FunctionNames'].split(' '):
            functionB.add(f)
    question_template += ", ".join(functionB)

    return question_template

def render_template_function_to_focus_v3(function_listA:List[str], function_listB:List[str]) -> str:
    question_template = """
    Please pick up all the function names in "FunctionNames A:" that are related or similar to one or more function names in "FunctionNames B:" and output them to "FunctionNames C:".
    """
    # add FunctionNames A
    question_template += "\n\nFunctionNames A: \n"
    question_template += ", ".join(function_listA)

    # add FunctionNames B
    question_template += "\n\nFunctionNames B: \n"
    functionB = set(function_listB)
    question_template += ", ".join(functionB)

    return question_template

def prompt_summarize_v1(type_to_summarize: str, data: List[str])->str:
    question_template = f"""
    Please summarize these similar {type_to_summarize} into one sentence, and output them to "Answer:".
    """
    # add data
    question_template+="\n"
    for index, s in enumerate(data):
        question_template+=f"\n{index+1}. {s}"
    return question_template


def prompt_related_scenario(function_list:List[str], scenario_list:List[str]) -> str:
    question_template = """
    Please pick up all the scenarios in "Scenarios A:" that are related or similar to one or more function names in "FunctionNames B:" and output them to "Scenarios C:". Inputs and outputs should be splited by comma.
    """
    # add Scenarios A
    question_template += "\n\nScenarios A: \n"
    question_template += ", ".join(scenario_list)

    # add FunctionNames B
    question_template += "\n\nFunctionNames B: \n"
    question_template += ", ".join(function_list)

    return question_template


def prompt_related_scenario_v2(function_list:List[str], scenario_list:List[str]) -> str:
    question_template = """Now I give you a set of "Scenario" keywords and a list of "FunctionName" names. Please pick up all the "FunctionName" that are semantically similar to "Scenario" and output the result in a json format of 
{
"FunctionNameA": "ScenarioA",
"FunctionNameB": "ScenarioB",
"FunctionNameN": "ScenarioN"
}, where "FunctionNameN" is from "FunctionName:" and "ScenarioN" is from "Scenario".
When you do such semantic mapping, please strictly follow these three rules:
1) One "FunctionName" typically maps to one closest "Scenario", but may occasionally map to at most two "Scenario" keywords if both are similar to the given "FunctionName".
2) If a "FunctionName" does not have any similar "Scenario", please output "NoMatch" for the "Scenario" in the result json.
3) The order in the output json should follow the order of the input "FunctionName".
"""
    # add Scenarios A
    question_template += "\n\nScenario: \n"
    question_template += ", ".join(scenario_list)

    # add FunctionNames B
    question_template += "\n\FunctionName: \n"
    question_template += ", ".join(function_list)

    return question_template


def prompt_single_yes_no_question(question:str, code:str) -> str:
    question_template = f"""Does the following smart contract code "{question}"? Answer only "Yes" or "No".

{code}
    """
    return question_template


def prompt_related_functions(feature_words:List[str], code:List[str]) -> str:
    question_template = """
    Please pick up all the function names in "Code:" that are related or similar to one or more words in "Words:" and output them to "FunctionNames:". Outputs should be splited by comma.
    """
    # add Code
    question_template += "\n\nCode: \n"
    question_template += "\n".join(code)

    # add Words
    question_template += "\n\nWords: \n"
    question_template += ", ".join(feature_words)

    return question_template

def prompt_multiple_choice_scenarios(scenarios:List[str], code:str) -> str:
    question_template="""Given the following smart contract code, answer the questions below and organize the result in a json format like {"""
    
    for index, scenario in enumerate(scenarios):
        question_template += f'"{index+1}": "Yes" or "No"'
        if index != len(scenarios)-1:
            question_template += ', '

    question_template += f'}}.\n'

    for index, scenario in enumerate(scenarios):
        question_template += f'"{index+1}": Does it "{scenario}"?\n'
    
    question_template += f'\n{code}'
    
    return question_template
