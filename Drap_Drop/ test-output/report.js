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
  "duration": 12128540008,
  "status": "passed"
});
formatter.match({
  "location": "drapAndDropSteps.get_title_of_page()"
});
formatter.result({
  "duration": 27240715,
  "status": "passed"
});
formatter.match({
  "location": "drapAndDropSteps.click_into_link()"
});
formatter.result({
  "duration": 2099638016,
  "status": "passed"
});
formatter.match({
  "location": "drapAndDropSteps.drap_and_drop_element()"
});
formatter.result({
  "duration": 547187169,
  "status": "passed"
});
formatter.match({
  "location": "drapAndDropSteps.exit_page()"
});
formatter.result({
  "duration": 2082334520,
  "status": "passed"
});
});