package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Jeremy Brua/eclipse-workspace/BDD_ValidateSearch/src/main/java/Features"
		,glue= {"C:/Users/Jeremy Brua/eclipse-workspace/BDD_ValidateSearch/src/main/java/stepDefinitions"}
		)


public class TestRunner {

}
