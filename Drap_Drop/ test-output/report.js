$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/drapDrop/features/Application.feature");
formatter.feature({
  "line": 1,
  "name": "Drap and Drop element",
  "description": "",
  "id": "drap-and-drop-element",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Application with cucumber",
  "description": "",
  "id": "drap-and-drop-element;application-with-cucumber",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "visit the site",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "get title of page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click into link",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "drap and drop element",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "exit page",
  "keyword": "Then "
});
formatter.match({
  "location": "drapAndDropSteps.visit_the_site()"
});
formatter.result({
  "duration": 76534599388,
  "status": "passed"
});
formatter.match({
  "location": "drapAndDropSteps.get_title_of_page()"
});
formatter.result({
  "duration": 28762111,
  "status": "passed"
});
formatter.match({
  "location": "drapAndDropSteps.click_into_link()"
});
formatter.result({
  "duration": 2732799960,
  "status": "passed"
});
formatter.match({
  "location": "drapAndDropSteps.drap_and_drop_element()"
});
formatter.result({
  "duration": 1650563113,
  "status": "passed"
});
formatter.match({
  "location": "drapAndDropSteps.exit_page()"
});
formatter.result({
  "duration": 119727075,
  "status": "passed"
});
});