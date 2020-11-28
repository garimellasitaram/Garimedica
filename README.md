# Garimedica
Running the application :
You can run the application using
java -jar sourcecode-reader-app-0.0.1-SNAPSHOT.jar


Swagger URL:
http://localhost:8080/swagger-ui.html#/exercise-controller

Swagger Api docs:

http://localhost:8080/v2/api-docs



{
   "swagger":"2.0",
   "info":{
      "description":"Api Documentation",
      "version":"1.0",
      "title":"Api Documentation",
      "termsOfService":"urn:tos",
      "contact":{
         
      },
      "license":{
         "name":"Apache 2.0",
         "url":"http://www.apache.org/licenses/LICENSE-2.0"
      }
   },
   "host":"localhost:8080",
   "basePath":"/",
   "tags":[
      {
         "name":"basic-error-controller",
         "description":"Basic Error Controller"
      },
      {
         "name":"exercise-controller",
         "description":"Exercise Controller"
      }
   ],
   "paths":{
      "/deleteAll":{
         "delete":{
            "tags":[
               "exercise-controller"
            ],
            "summary":"deleteAllSourceCodeData",
            "operationId":"deleteAllSourceCodeDataUsingDELETE",
            "produces":[
               "*/*"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "type":"object"
                  }
               },
               "204":{
                  "description":"No Content"
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               }
            },
            "deprecated":false
         }
      },
      "/error":{
         "get":{
            "tags":[
               "basic-error-controller"
            ],
            "summary":"errorHtml",
            "operationId":"errorHtmlUsingGET",
            "produces":[
               "text/html"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "$ref":"#/definitions/ModelAndView"
                  }
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               },
               "404":{
                  "description":"Not Found"
               }
            },
            "deprecated":false
         },
         "head":{
            "tags":[
               "basic-error-controller"
            ],
            "summary":"errorHtml",
            "operationId":"errorHtmlUsingHEAD",
            "consumes":[
               "application/json"
            ],
            "produces":[
               "text/html"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "$ref":"#/definitions/ModelAndView"
                  }
               },
               "204":{
                  "description":"No Content"
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               }
            },
            "deprecated":false
         },
         "post":{
            "tags":[
               "basic-error-controller"
            ],
            "summary":"errorHtml",
            "operationId":"errorHtmlUsingPOST",
            "consumes":[
               "application/json"
            ],
            "produces":[
               "text/html"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "$ref":"#/definitions/ModelAndView"
                  }
               },
               "201":{
                  "description":"Created"
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               },
               "404":{
                  "description":"Not Found"
               }
            },
            "deprecated":false
         },
         "put":{
            "tags":[
               "basic-error-controller"
            ],
            "summary":"errorHtml",
            "operationId":"errorHtmlUsingPUT",
            "consumes":[
               "application/json"
            ],
            "produces":[
               "text/html"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "$ref":"#/definitions/ModelAndView"
                  }
               },
               "201":{
                  "description":"Created"
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               },
               "404":{
                  "description":"Not Found"
               }
            },
            "deprecated":false
         },
         "delete":{
            "tags":[
               "basic-error-controller"
            ],
            "summary":"errorHtml",
            "operationId":"errorHtmlUsingDELETE",
            "produces":[
               "text/html"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "$ref":"#/definitions/ModelAndView"
                  }
               },
               "204":{
                  "description":"No Content"
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               }
            },
            "deprecated":false
         },
         "options":{
            "tags":[
               "basic-error-controller"
            ],
            "summary":"errorHtml",
            "operationId":"errorHtmlUsingOPTIONS",
            "consumes":[
               "application/json"
            ],
            "produces":[
               "text/html"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "$ref":"#/definitions/ModelAndView"
                  }
               },
               "204":{
                  "description":"No Content"
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               }
            },
            "deprecated":false
         },
         "patch":{
            "tags":[
               "basic-error-controller"
            ],
            "summary":"errorHtml",
            "operationId":"errorHtmlUsingPATCH",
            "consumes":[
               "application/json"
            ],
            "produces":[
               "text/html"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "$ref":"#/definitions/ModelAndView"
                  }
               },
               "204":{
                  "description":"No Content"
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               }
            },
            "deprecated":false
         }
      },
      "/find":{
         "get":{
            "tags":[
               "exercise-controller"
            ],
            "summary":"fetchByCode",
            "operationId":"fetchByCodeUsingGET",
            "produces":[
               "*/*"
            ],
            "parameters":[
               {
                  "in":"body",
                  "name":"code",
                  "description":"code",
                  "required":false,
                  "schema":{
                     "type":"string"
                  }
               }
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "type":"object"
                  }
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               },
               "404":{
                  "description":"Not Found"
               }
            },
            "deprecated":false
         }
      },
      "/findAll":{
         "get":{
            "tags":[
               "exercise-controller"
            ],
            "summary":"fetchAllSourceCodeData",
            "operationId":"fetchAllSourceCodeDataUsingGET",
            "produces":[
               "*/*"
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "type":"object"
                  }
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               },
               "404":{
                  "description":"Not Found"
               }
            },
            "deprecated":false
         }
      },
      "/upload":{
         "post":{
            "tags":[
               "exercise-controller"
            ],
            "summary":"uploadMultipart",
            "operationId":"uploadMultipartUsingPOST",
            "consumes":[
               "multipart/form-data"
            ],
            "produces":[
               "*/*"
            ],
            "parameters":[
               {
                  "name":"file",
                  "in":"formData",
                  "description":"file",
                  "required":true,
                  "type":"file"
               }
            ],
            "responses":{
               "200":{
                  "description":"OK",
                  "schema":{
                     "type":"object"
                  }
               },
               "201":{
                  "description":"Created"
               },
               "401":{
                  "description":"Unauthorized"
               },
               "403":{
                  "description":"Forbidden"
               },
               "404":{
                  "description":"Not Found"
               }
            },
            "deprecated":false
         }
      }
   },
   "definitions":{
      "ModelAndView":{
         "type":"object",
         "properties":{
            "empty":{
               "type":"boolean"
            },
            "model":{
               "type":"object"
            },
            "modelMap":{
               "type":"object",
               "additionalProperties":{
                  "type":"object"
               }
            },
            "reference":{
               "type":"boolean"
            },
            "status":{
               "type":"string",
               "enum":[
                  "100 CONTINUE",
                  "101 SWITCHING_PROTOCOLS",
                  "102 PROCESSING",
                  "103 CHECKPOINT",
                  "200 OK",
                  "201 CREATED",
                  "202 ACCEPTED",
                  "203 NON_AUTHORITATIVE_INFORMATION",
                  "204 NO_CONTENT",
                  "205 RESET_CONTENT",
                  "206 PARTIAL_CONTENT",
                  "207 MULTI_STATUS",
                  "208 ALREADY_REPORTED",
                  "226 IM_USED",
                  "300 MULTIPLE_CHOICES",
                  "301 MOVED_PERMANENTLY",
                  "302 FOUND",
                  "302 MOVED_TEMPORARILY",
                  "303 SEE_OTHER",
                  "304 NOT_MODIFIED",
                  "305 USE_PROXY",
                  "307 TEMPORARY_REDIRECT",
                  "308 PERMANENT_REDIRECT",
                  "400 BAD_REQUEST",
                  "401 UNAUTHORIZED",
                  "402 PAYMENT_REQUIRED",
                  "403 FORBIDDEN",
                  "404 NOT_FOUND",
                  "405 METHOD_NOT_ALLOWED",
                  "406 NOT_ACCEPTABLE",
                  "407 PROXY_AUTHENTICATION_REQUIRED",
                  "408 REQUEST_TIMEOUT",
                  "409 CONFLICT",
                  "410 GONE",
                  "411 LENGTH_REQUIRED",
                  "412 PRECONDITION_FAILED",
                  "413 PAYLOAD_TOO_LARGE",
                  "413 REQUEST_ENTITY_TOO_LARGE",
                  "414 URI_TOO_LONG",
                  "414 REQUEST_URI_TOO_LONG",
                  "415 UNSUPPORTED_MEDIA_TYPE",
                  "416 REQUESTED_RANGE_NOT_SATISFIABLE",
                  "417 EXPECTATION_FAILED",
                  "418 I_AM_A_TEAPOT",
                  "419 INSUFFICIENT_SPACE_ON_RESOURCE",
                  "420 METHOD_FAILURE",
                  "421 DESTINATION_LOCKED",
                  "422 UNPROCESSABLE_ENTITY",
                  "423 LOCKED",
                  "424 FAILED_DEPENDENCY",
                  "425 TOO_EARLY",
                  "426 UPGRADE_REQUIRED",
                  "428 PRECONDITION_REQUIRED",
                  "429 TOO_MANY_REQUESTS",
                  "431 REQUEST_HEADER_FIELDS_TOO_LARGE",
                  "451 UNAVAILABLE_FOR_LEGAL_REASONS",
                  "500 INTERNAL_SERVER_ERROR",
                  "501 NOT_IMPLEMENTED",
                  "502 BAD_GATEWAY",
                  "503 SERVICE_UNAVAILABLE",
                  "504 GATEWAY_TIMEOUT",
                  "505 HTTP_VERSION_NOT_SUPPORTED",
                  "506 VARIANT_ALSO_NEGOTIATES",
                  "507 INSUFFICIENT_STORAGE",
                  "508 LOOP_DETECTED",
                  "509 BANDWIDTH_LIMIT_EXCEEDED",
                  "510 NOT_EXTENDED",
                  "511 NETWORK_AUTHENTICATION_REQUIRED"
               ]
            },
            "view":{
               "$ref":"#/definitions/View"
            },
            "viewName":{
               "type":"string"
            }
         },
         "title":"ModelAndView"
      },
      "View":{
         "type":"object",
         "properties":{
            "contentType":{
               "type":"string"
            }
         },
         "title":"View"
      }
   }
}
