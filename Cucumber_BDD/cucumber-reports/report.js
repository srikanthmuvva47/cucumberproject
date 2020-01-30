$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeliton/DemoWebshopLogin.feature");
formatter.feature({
  "name": "Demo Web Shop Login feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Valid Login for Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The url of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User entere \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "askmail@gmail.com",
        "abc123"
      ]
    },
    {
      "cells": [
        "askmail@gmail.com",
        "abc123"
      ]
    },
    {
      "cells": [
        "askmail@gmail.com",
        "abc123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid Login for Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The url of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.the_url_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_enters(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User entere \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_entere_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login for Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The url of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.the_url_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_enters(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User entere \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_entere_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login for Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The url of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.the_url_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_enters(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User entere \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_entere_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeliton.demowebshopstepdefs.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
});