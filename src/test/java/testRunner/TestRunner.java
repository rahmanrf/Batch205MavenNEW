package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features="src\\test\\resources\\Features",
		glue={"stepDefinition"},
		plugin= {"html:target/cucumber-html-report",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags="@Login",
		monochrome=false,
		dryRun = false
		)

public class TestRunner {

	
}
