package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.TestBase;

public class Hooks extends TestBase{

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
}
