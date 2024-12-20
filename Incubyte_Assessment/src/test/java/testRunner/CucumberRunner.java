package testRunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Feature",
		glue = "stepDefinition",
		dryRun = false,
		tags = "@smokeTest", // Optional: Use tags to filter tests

		plugin = {
		        "pretty",
		        "html:target/cucumber-reports/cucumber.html",
		        "json:target/cucumber-reports/cucumber.json"}

		        )

@Test
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
	// Overriding the DataProvider to enable parallel execution
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios(); // Provide scenarios to be executed in parallel
    } 
}

