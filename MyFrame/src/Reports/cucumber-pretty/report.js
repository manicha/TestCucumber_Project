$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/657392/eclipse-workspace/MyFrame/src/Features/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Validation",
  "description": "",
  "id": "amazon-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Amazon Testing",
  "description": "",
  "id": "amazon-validation;amazon-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to Amazon Website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "validate the Amazon website",
  "keyword": "Then "
});
formatter.match({
  "location": "Flipkart.launch_the_browser()"
});
formatter.result({
  "duration": 15128251338,
  "status": "passed"
});
formatter.match({
  "location": "Amazon.navigate_to_Amazon_Website()"
});
formatter.result({
  "duration": 33278448384,
  "status": "passed"
});
formatter.match({
  "location": "Amazon.validate_the_Amazon_website()"
});
formatter.result({
  "duration": 1729145781,
  "status": "passed"
});
});