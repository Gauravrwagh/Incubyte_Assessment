package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.PantsMen;
import utilities.TestBase;

public class TC003_MensSectionShopping extends TestBase{

	Homepage homepage;
	PantsMen pantsmen;
	
	@When("user mouse hoer to bottoms and clicks on pants")
	public void user_mouse_hoer_to_bottoms_and_clicks_on_pants() {
	    
		homepage = new Homepage();
		pantsmen = new PantsMen();
		homepage.selectPants();

	}

	@When("options for pants shows")
	public void options_for_pants_shows() {
	    
		 Assert.assertEquals(driver.getTitle(), "Pants - Bottoms - Men");
		   
			System.out.println(driver.getTitle());
	}

	@Then("user prints names and price of pants")
	public void user_prints_names_and_price_of_pants() {
	   
		pantsmen.getProductPriceAndName();
		System.out.println("*****");
	}
}
