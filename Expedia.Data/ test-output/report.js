$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Expedia/features/Expedia.feature");
formatter.feature({
  "line": 1,
  "name": "Search Trip on Expedia",
  "description": "",
  "id": "search-trip-on-expedia",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "init browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open init browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ExpediaSteps.open_init_browser()"
});
formatter.result({
  "duration": 23565513658,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Search normal",
  "description": "",
  "id": "search-trip-on-expedia;search-normal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Click on Flights",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter information",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Search",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Check validate information",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close init browser",
  "keyword": "And "
});
formatter.match({
  "location": "ExpediaSteps.click_on_Flights()"
});
formatter.result({
  "duration": 706580813,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.enter_information()"
});
formatter.result({
  "duration": 23344757783,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to no longer be visible: By.xpath: //*[@id\u003d\"gcw-flights-form-hp-flight\"]/div[3]/div[1]/div/div[2] (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027THUAN-PC\u0027, ip: \u0027192.168.1.170\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00279.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\Thuan\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51508}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.106, webStorageEnabled: true}\nSession ID: f8ba003aaa6d95368b9f23bd2cbe0a50\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:113)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:283)\r\n\tat com.Expedia.pages.ExpediaIndex.waitForControlInvisible(ExpediaIndex.java:376)\r\n\tat com.Expedia.DifinitionSteps.ExpediaSteps.enter_information(ExpediaSteps.java:45)\r\n\tat ✽.Then Enter information(src/test/java/com/Expedia/features/Expedia.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ExpediaSteps.click_on_Search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ExpediaSteps.check_validate_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ExpediaSteps.close_init_browser()"
});
formatter.result({
  "status": "skipped"
});
});