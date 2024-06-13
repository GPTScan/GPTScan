import logging
import datetime

OPENAI_API_KEY = "NOT NEEDED"

OPENAI_APIS = ["NOT NEEDED"]

GPT4_API = "NOT NEEDED"


GITHUB_TOKEN = "NOT NEEDED"
LOGGING_LEVEL = logging.INFO
LOGGING_FORMAT = "%(name)s: %(message)s"
# LOGGING_TARGET = datetime.datetime.now().strftime("logs/main.py-output-%Y%m%d-%H%M%S.log")
STATEMENT_FILE = "output/statements.csv"
WRITE_STATEMENTS_INTO_FILE = True
BACKUP_STATEMENTS = True

ENABLE_STATIC_ANALYSIS = True

SEND_PRICE = 0.0015 / 1000
RECEIVE_PRICE = 0.002 / 1000

GPT4_SEND_PRICE = 0.03 / 1000
GPT4_RECEIVE_PRICE = 0.06 / 1000

