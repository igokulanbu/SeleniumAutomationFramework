package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	    
@CucumberOptions(
		tags = "@input",
		features = {"features/Learning.feature"},
		glue = {"stepDefinitions"},
		plugin = {}
)
	    
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
	    
}