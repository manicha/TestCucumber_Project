$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles.feature");
formatter.feature({
  "line": 1,
  "name": "Test Feature",
  "description": "",
  "id": "test-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing",
  "description": "",
  "id": "test-feature;testing",
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
  "name": "Navigate to  a website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "validate the website",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleLaunch.launch_the_browser()"
});
formatter.result({
  "duration": 15587636578,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLaunch.navigate_to_a_website()"
});
formatter.result({
  "duration": 13730775280,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLaunch.validate_the_website()"
});
formatter.result({
  "duration": 35318,
  "status": "passed"
});
});