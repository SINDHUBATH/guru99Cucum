package TestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feat", 
glue = "StepDefs", monochrome = true, plugin = {"pretty","html:Report/Html Report"},
dryRun = false)
public class TestRunner {

}
