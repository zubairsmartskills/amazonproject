$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefiles/amazon.feature");
formatter.feature({
  "name": "To user  verify search box",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.scenario({
  "name": "To user enter valid product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To user launch edge browser and pass amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonDef.toUserLaunchEdgeBrowserAndPassAmazonUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter product in search box",
  "rows": [
    {
      "cells": [
        "samsung",
        "iphone",
        "moto",
        "oppo"
      ]
    },
    {
      "cells": [
        "samsung 24",
        "iphone 14",
        "moto edge 50",
        "oppo t50"
      ]
    },
    {
      "cells": [
        "samsung 25",
        "iphone 15",
        "moto edge 50 pro",
        "oppo"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AmazonDef.toUserEnterProductInSearchBox(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user click search box button",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDef.toUserClickSearchBoxButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/featurefiles/loginpage.feature");
formatter.feature({
  "name": "To user verify the login function",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@facebook"
    }
  ]
});
formatter.scenario({
  "name": "To user verify login function with valid user and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@facebook"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To user launch edge browser and pass valid url",
  "keyword": "Given "
});
formatter.match({
  "location": "Defi.to_user_launch_edge_browser_and_pass_valid_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter valid username and valid password",
  "rows": [
    {
      "cells": [
        "ram",
        "111",
        "ram@123"
      ]
    },
    {
      "cells": [
        "sai",
        "222",
        "sai@123"
      ]
    },
    {
      "cells": [
        "java",
        "333",
        "java@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Defi.toUserEnterValidUsernameAndValidPassword(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: To false\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.def.Defi.toUserEnterValidUsernameAndValidPassword(Defi.java:36)\r\n\tat ✽.To user enter valid username and valid password(file:src/test/resources/featurefiles/loginpage.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Defi.toUserClickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To user verify login function with valid user and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@facebook"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To user launch edge browser and enter  url",
  "keyword": "Given "
});
formatter.match({
  "location": "Defi.toUserLaunchEdgeBrowserAndEnterUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Defi.toUserEnterValidUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Defi.toUserClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});