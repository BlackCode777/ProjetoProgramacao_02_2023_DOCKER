import redis
import json
from random import randint
from time import sleep

if __name__ == '__main__':
    r = redis.Redis(host='queue', port=6379, db=0)
    while True:
        mensagem = json.loads(r.blpop('sender')[1])
        print('Mandando a mensagem', mensagem['assunto'])
        sleep(randint(14, 45))
        print('Mensagem', mensagem['assunto'], 'enviada')