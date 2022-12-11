package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	    
@CucumberOptions(tags = "", features = {"src/test/resources/Features/Learning.feature"}, glue = {"stepDefinitions"},
	                 plugin = {})
	    
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
	    
}