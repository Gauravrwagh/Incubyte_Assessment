package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Feature/CreateAccount_and_SignIn.feature",
		glue = "stepDefination",
		dryRun = false)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
