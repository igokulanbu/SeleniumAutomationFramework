package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {},
		features = {"features/Learning.feature"},
		glue = {"stepDefinitions"},
		tags = ""
)
	    
public class TestRunner extends AbstractTestNGCucumberTests {
	    
}