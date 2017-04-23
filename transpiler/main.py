# -*- coding: utf-8 -*-
import os
import xmltodict
import json
import re
from collections import OrderedDict
from swagger import SwaggerParser


BASE_DIR = os.path.dirname(os.path.abspath(__file__))
FILE = os.path.join(BASE_DIR, 'example.xml')


def main():
  xmi = get_xmi()['apimodeler:API']
  api = parse_api(xmi)
  document = json.dumps(api, indent=2)
  save_json(document)


def get_xmi():
  ''' Retorna um dicionário baseado no XMI '''
  with open(FILE, 'r') as fd:
    xmi = xmltodict.parse(fd.read(), attr_prefix='')
  return xmi


def save_json(document):
  ''' Salva documento json '''
  with open('document.json', 'w') as f:
    f.write(document)


def parse_api(xmi, to='swagger'):
  ''' Retorna json que atende às espeficações do Swagger '''
  xmi_cleaned = filter_xmi(xmi)
  if to == 'swagger':
    sw = SwaggerParser(xmi_cleaned)
    api = sw.parse()
  return api


def filter_xmi(xmi):
  ''' Retorna dicionário sem chaves relacionas a atributos xmi '''
  xmi_cleaned = OrderedDict()
  patterns = [r'^xmi:.*', r'^xmlns:.*']
  for prop in xmi.keys():
    ctrl = [re.match(pattern, prop, re.M | re.I)
            is None for pattern in patterns]
    if all(ctrl):
      xmi_cleaned[prop] = xmi[prop]
  return xmi_cleaned

if __name__ == '__main__':
  main()
