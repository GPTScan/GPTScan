import logging
from config import LOGGING_FORMAT, LOGGING_LEVEL
# logging.basicConfig(level=LOGGING_LEVEL, format=LOGGING_FORMAT)

from rich.logging import RichHandler

logging.basicConfig(
    level=LOGGING_LEVEL, format=LOGGING_FORMAT, handlers=[RichHandler(rich_tracebacks=True)]
)

logger = logging.getLogger(__name__)
import json
import tasks
import rich

console = rich.get_console()

def welcome():
    console.print("""[bold blue]

  .oooooo.    ooooooooo.   ooooooooooooo  .oooooo..o                                 
 d8P'  `Y8b   `888   `Y88. 8'   888   `8 d8P'    `Y8                                 
888            888   .d88'      888      Y88bo.       .ooooo.   .oooo.   ooo. .oo.   
888            888ooo88P'       888       `"Y8888o.  d88' `"Y8 `P  )88b  `888P"Y88b  
888     ooooo  888              888           `"Y88b 888        .oP"888   888   888  
`88.    .88'   888              888      oo     .d8P 888   .o8 d8(  888   888   888  
 `Y8bood8P'   o888o            o888o     8""88888P'  `Y8bod8P' `Y888""8o o888o o888o                                                        


                                                                   
[/bold blue]""")

if __name__ == '__main__':
    welcome()
    tasks.simple_cli()
