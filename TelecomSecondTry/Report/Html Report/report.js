$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feat/telecomGuru99.feature");
formatter.feature({
  "name": "Validate Telecom Scenarios from Guru99 demo Site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Register New Customer \u0026 Print Customer ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on add customer link",
  "keyword": "When "
});
formatter.step({
  "name": "user fills details in add customer page by entering \"\u003cfirstname\u003e\" and \"\u003csecondname\u003e\" and \"\u003cemail\u003e\" and \"\u003caddress\u003e\" and \"\u003cphoneNum\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user gets Customer Id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "secondname",
        "email",
        "address",
        "phoneNum"
      ]
    },
    {
      "cells": [
        "Gary",
        "Harris",
        "gary@harris.com",
        "123 Random St",
        "9898032311"
      ]
    },
    {
      "cells": [
        "Lucy",
        "Federer",
        "lucy@ferr.com",
        "123 Second St",
        "8812920311"
      ]
    },
    {
      "cells": [
        "Angelina",
        "Kerber",
        "angel@kerb.com",
        "456 Random St",
        "0909132311"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Register New Customer \u0026 Print Customer ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add customer link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_add_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills details in add customer page by entering \"Gary\" and \"Harris\" and \"gary@harris.com\" and \"123 Random St\" and \"9898032311\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_fills_details_in_add_customer_page_by_entering_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets Customer Id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_gets_Customer_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Register New Customer \u0026 Print Customer ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add customer link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_add_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills details in add customer page by entering \"Lucy\" and \"Federer\" and \"lucy@ferr.com\" and \"123 Second St\" and \"8812920311\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_fills_details_in_add_customer_page_by_entering_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets Customer Id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_gets_Customer_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Register New Customer \u0026 Print Customer ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add customer link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_add_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills details in add customer page by entering \"Angelina\" and \"Kerber\" and \"angel@kerb.com\" and \"456 Random St\" and \"0909132311\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_fills_details_in_add_customer_page_by_entering_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets Customer Id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_gets_Customer_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});