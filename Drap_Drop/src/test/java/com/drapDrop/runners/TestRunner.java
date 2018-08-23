package com.drapDrop.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\drapDrop\\features\\Application.feature",
		glue = {"com.drapDrop.stepsDifinitions"},
		format = {"pretty", "html: test-output", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true,
		strict = true
)

public class TestRunner {

}
