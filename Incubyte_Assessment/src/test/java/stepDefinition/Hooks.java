package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ScreenshotUtility;
import utilities.TestBase;

public class Hooks extends TestBase {

	@Before
	public void beforeScenario() {
		// Initialize WebDriver and open the browser
		System.out.println("Opening the browser and initializing WebDriver...");
		TestBase.initialization();
	}

	@After
	public void afterScenario() {
		// Perform clean-up after scenario execution
		System.out.println("Closing the browser...");
		 TestBase.tearDown();
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			// Capture screenshot only if the scenario fails
         ScreenshotUtility.captureScreenshot(getDriver(), scenario.getName());

		}

	}
}
