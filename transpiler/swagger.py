# -*- coding: utf-8 -*-
from collections import OrderedDict


class SwaggerParser():
  def __init__(self, xmi):
    self.api = OrderedDict()
    self.api['swagger'] = '2.0'
    self.xmi = xmi

  def parse(self):
    for prop in self.xmi.keys():
      newProp, newValue = self.__setApiProperties(prop)
      self.api[newProp] = newValue
    return self.api

  def __setApiProperties(self, prop):
    if prop == 'schemes':
      return prop, list([self.xmi[prop], ])
    elif prop == 'resource':
      return 'paths', self.__parsePaths(self.xmi[prop])
    elif prop == 'document':
      return 'definitions', self.__parseDefinitions(self.xmi[prop])
    elif prop == 'response':
      return 'responses', self.__parseResponses(self.xmi[prop])
    else:
      return prop, self.xmi[prop]

  def __parseDefinitions(self, documents):
    documents = self.__toList(documents)
    definitions = OrderedDict()

    for d in documents:
      definitions[d['name']] = OrderedDict()
      definitions[d['name']]['type'] = 'object'
      definitions[d['name']]['properties'] = OrderedDict()

      for p in d['field']:
        definitions[d['name']]['properties'][p['name']] = OrderedDict()
        definitions[d['name']]['properties'][p['name']]['type'] = p['type']

    return definitions

  def __parseResponses(self, responses):
    responses = self.__toList(responses)
    resp = OrderedDict()

    for response in responses:
      resp[response['name']] = OrderedDict()
      resp[response['name']]['description'] = response['description']

    return resp

  def __parsePaths(self, resources):
    resources = self.__toList(resources)
    paths = OrderedDict()

    for resource in resources:
      if 'pathParameter' in resource:
        param = 'contactId'
        paths['/%s/{%s}' % (resource['name'], param)] = OrderedDict()
        path = paths['/%s/{%s}' % (resource['name'], param)]
      else:
        paths['/{}'.format(resource['name'])] = OrderedDict()
        path = paths['/{}'.format(resource['name'])]

      actions = self.__toList([resource['action']])
      for action in actions:
        path[action['type']] = self.__parseAction(action)

    return paths

  def __parseAction(self, action):
    operation = OrderedDict()
    # Initialize Operation Fields
    operation['description'] = action['description']
    operation['parameters'] = list()
    operation['responses'] = OrderedDict()

    if 'parameters' in action:
      for parameter in action['parameters'].split():
        operation['parameters'].append(
            {'$ref': self.__translateUri(parameter)})

    for parameter in self.__toList([action['parameter']]):
      operation['parameters'].append(self.__parseParameter(parameter))

    for response in action['responses'].split():
      # Substituir o x pelo codigo da variavel recuperada
      auxResp = self.__getElementByUri(response)
      operation['responses'][auxResp['code']] = {
          '$ref': self.__translateUri(response)
      }

    for response in self.__toList([action['response']]):
      operation['responses'][response['code']] = self.__parseResponse(response)

    return operation

  def __parseParameter(self, parameter):
    param = OrderedDict()

    for p in parameter.keys():
      if p == 'required':
        param[p] = parameter[p] == 'true'
      else:
        param[p] = parameter[p]
    return param

  def __parseResponse(self, response):
    resp = OrderedDict()
    resp['description'] = response['description']

    if response['type'] == 'object':
      resp['schema'] = {'$ref': self.__translateUri(response['documents'])}

    return resp

  def __convertUri(self, uri):
    uri = uri[2:].replace('@', '')
    path = list()
    for l in uri.split('/'):
      path.append(tuple(l.split('.')))
    return path

  def __getElementByUri(self, uri):
    path = self.__convertUri(uri)
    aux = self.xmi
    for p in path:
      if isinstance(aux[p[0]], list):
        index = int(p[1])
        aux = aux[p[0]][index]
      else:
        aux = aux[p[0]]
    return aux

  def __translateUri(self, uri):
    path = self.__convertUri(uri)[0]
    element = self.__getElementByUri(uri)
    newURI = list(['#', ])
    if path[0] == 'response':
      newURI.append('responses')
    elif path[0] == 'document':
      newURI.append('definitions')
    elif path[0] == 'parameter':
      newURI.append('parameters')

    newURI.append(element['name'])

    return '/'.join(newURI)

  def __toList(self, param):
    if isinstance(param, list):
      return param
    else:
      return list([param, ])
