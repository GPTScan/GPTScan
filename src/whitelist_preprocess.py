import json
import re

def process():
    data:dict = json.load(open("src/whitelist.json"))
    new_whitelist = {}
    for key in data.keys():
        origin_key = key
        key = re.sub(r"uint\d+", "uint", key)
        key = re.sub(r"int\d+", "int", key)
        new_whitelist[key] = data[origin_key]
    
    json.dump(new_whitelist, open("src/whitelist.json", "w"), indent=4)

{
    "xxxxxxxxxxxxxxxxxx":{
        "line": 1,
        "type": []
    }
}


if __name__ == '__main__':
    process()