# -*- coding: utf-8 -*-
import os
import xmltodict
import json


BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
ROOT = 'br.com.intmed.protocolos:Root'
DB_DIR = os.path.join(BASE_DIR, 'db')


def main():
    with open(os.path.join(DB_DIR, 'InfeccaoUrinaria.xmi'), 'r') as fd:
        xmi = xmltodict.parse(fd.read(), attr_prefix='')

    doc_json = json.dumps(
        xmi[ROOT]['protocolo'],
        indent=2,
        ensure_ascii=False
    ).encode('utf8')

    with open(os.path.join(DB_DIR, 'InfeccaoUrinaria.json'), 'wb') as f:
        f.write(doc_json)


if __name__ == '__main__':
    main()
    print('JSON criado...')
