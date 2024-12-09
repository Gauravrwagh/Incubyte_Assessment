package testRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Feature/CreateAccount_And_SignIn.feature",
		glue = "stepDefination",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber-reports.html", 
		        		"json:target/cucumber.json"
		        
			}
		)
@Test
public class TestRunner extends AbstractTestNGCucumberTests{

}
