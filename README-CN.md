# GPTScan

## 描述

使用ChatGPT进行逻辑漏洞检测。

## 如何使用

1. 安装依赖，

- 需要Python 3.10+
- 安装依赖：`pip install -r requirements.txt`

2. 运行GPTScan

例如，我这边源码存放于`/source`目录，则运行命令为：

```shell
python3.10 main.py -s /sourcecode -o /sourcecode/output.json -k OPEN_AI_API_KEY_xxxxxxxxxxxxx
```

3. 查看输出

输出结果位于`-o`参数指定的位置，在上例中位于`/sourcecode/output.json`。

## 支持的项目类型

目前支持的项目类型有：
- 单文件，即一个sol文件
- 多文件，即一个目录下有多个sol文件，不包括其它外部依赖
- 常见的框架项目，如truffle，hardhat，brownie等

经测试的框架有：
- hardhad
- truffle
- brownie

注意，这个项目不包含编译环境，如Node.js等，需要自行安装。

## 如何引用这个项目

```bibtex
@inproceedings{sun2024gptscan,
    author = {Sun, Yuqiang and Wu, Daoyuan and Xue, Yue and Liu, Han and Wang, Haijun and Xu, Zhengzi and Xie, Xiaofei and Liu, Yang},
    title = {{GPTScan}: Detecting Logic Vulnerabilities in Smart Contracts by Combining GPT with Program Analysis},
    year = {2024},
    isbn = {9798400702174},
    publisher = {Association for Computing Machinery},
    address = {New York, NY, USA},
    url = {https://doi.org/10.1145/3597503.3639117},
    doi = {10.1145/3597503.3639117},
    booktitle = {Proceedings of the IEEE/ACM 46th International Conference on Software Engineering},
    articleno = {166},
    numpages = {13},
    series = {ICSE '24}
}
```

