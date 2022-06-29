package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = ".//Features/Login.feature",
		           glue = "stepDefinitions", 
		           dryRun = false,
		           monochrome=true,
		           plugin = { "pretty",
				"htmi:test-output" }

)
public class TestRun {

}
