package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.JacketsTopsWomen;
import utilities.TestBase;

public class TC002_WomensSectionShopping extends TestBase{

	Homepage homepage;
	JacketsTopsWomen jtw;
	
	@When("user click on jackets")
	public void user_click_on_jackets() throws InterruptedException {
		homepage = new Homepage();
		jtw = new JacketsTopsWomen();
		homepage.selectJackets();
		
	}

	@Then("options for jackets shows")
	public void options_for_jackets_shows() {
	   Assert.assertEquals(getDriver().getTitle(), "Jackets - Tops - Women");
	   
		System.out.println(getDriver().getTitle());
	}
	
	@Then("user fetch available item name and price")
	public void user_fetch_available_item_name_and_price() {
		jtw.getProductPriceAndName();
	}

}
