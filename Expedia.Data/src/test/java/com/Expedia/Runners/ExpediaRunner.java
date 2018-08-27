package com.Expedia.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\Expedia\\features\\Expedia.feature",
		glue = {"com.Expedia.DifinitionSteps"},
		format = {"pretty", "html: test-output", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true,
		strict = true
)

public class ExpediaRunner {

}
