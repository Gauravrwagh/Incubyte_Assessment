package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateNewCustomerAccount;
import pages.CustomerLogin;
import pages.Homepage;
import pages.MyAccount;
import utilities.Generate_RandomEmail;
import utilities.TestBase;

public class TC001_CreateAccountAndSignIn extends TestBase{

	Homepage homepage;
	CreateNewCustomerAccount createnewcustomeraccount;
	MyAccount myaccount;
	CustomerLogin customerlogin;
	String randomEmail;
	
	
	@Given("user launches the browser and navigates to the Magento homepage")
	public void user_launches_the_browser_and_navigates_to_the_magento_homepage() {
		homepage = new Homepage();
		createnewcustomeraccount = new CreateNewCustomerAccount();
		myaccount = new MyAccount();
		customerlogin = new CustomerLogin();
		
		
	}

	@When("user clicks the create account link")
	public void user_clicks_the_create_account_link() {
		homepage.clickOnCreateAnAccountLink();
	}

	@Then("user navigates to the account creation page")
	public void user_navigates_to_the_account_creation_page() {
		Assert.assertEquals(driver.getTitle(), "Create New Customer Account");
	}

	@When("user enters firstname {string}")
	public void user_enters_firstname(String firstname) {
		createnewcustomeraccount.enterFirstName(firstname);
	}

	@When("user enters lastname {string}")
	public void user_enters_lastname(String lastname) {
		createnewcustomeraccount.enterLastname(lastname);
	}

	@When("user enters email {string}")
	public void user_enters_email(String email) {
		
		if (email.equals("<randomEmail>")) {
            randomEmail = Generate_RandomEmail.generateRandomEmail();
            email = randomEmail; 
        }
		createnewcustomeraccount.enterEmailAddress(email);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		createnewcustomeraccount.enterPassword(password);
	}

	@When("user confirms password {string}")
	public void user_confirms_password(String password) {
		createnewcustomeraccount.enterConfirmPassword(password);
	}

	@When("user submits the details")
	public void user_submits_the_details() {
		createnewcustomeraccount.clickCreateAccountButton();
	}

	@Then("user navigates to the My Account Dashboard and verifies the welcome message")
	public void user_navigates_to_the_my_account_dashboard_and_verifies_the_welcome_message() {
	    Assert.assertEquals(driver.getTitle(), "My Account");
	    myaccount.isWelcomeMessageDisplayed();
	}

	@Then("user clicks on the customer menu toggle")
	public void user_clicks_on_the_customer_menu_toggle() {
		myaccount.clickOnCustomerMenu();
	}

	@Then("user selects the sign out option")
	public void user_selects_the_sign_out_option() {
		myaccount.selectSignoutOption();
	}


	@Then("user should get sign out and navigates to the home page")
	public void user_should_get_sign_out_and_navigates_to_the_home_page() {

		homepage.clickOnSignInLink();
		
	}

	@Then("user enters login email {string}")
	public void user_enters_login_email(String email) {
		if (email.equals("<randomEmail>")) {
            email = randomEmail;  
        }
		customerlogin.enterLoginEmailID(email);
	}

	@Then("user enters login password {string}")
	public void user_enters_login_password(String password) {
		customerlogin.enterLoginPassword(password);
	}

	@Then("user clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() {
		customerlogin.clickOnSignInbutton();
	}

	@Then("user is signed in successfully")
	public void user_is_signed_in_successfully() {
	   Assert.assertEquals(driver.getTitle(), "My Account", "Login Successful");
	   
	}
}
