package stepDefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

//	Homepage homepage;
//	CreateNewCustomerAccount createnewcustomeraccount;
//	MyAccount myaccount;
//	CustomerLogin customerlogin;
//	String randomEmail;
//	
//	
//	@Given("user launches the browser and navigates to the Magento homepage")
//	public void user_launches_the_browser_and_navigates_to_the_magento_homepage() {
//		homepage = new Homepage();
//		createnewcustomeraccount = new CreateNewCustomerAccount();
//		myaccount = new MyAccount();
//		customerlogin = new CustomerLogin();
//		
//		
//	}
//
//	@When("user clicks the create account link")
//	public void user_clicks_the_create_account_link() {
//		homepage.clickOnCreateAnAccountLink();
//	}
//
//	@Then("user navigates to the account creation page")
//	public void user_navigates_to_the_account_creation_page() {
//		Assert.assertEquals(getDriver().getTitle(), "Create New Customer Account");
//	}
//
//	@When("user enters firstname {string}")
//	public void user_enters_firstname(String firstname) {
//		createnewcustomeraccount.enterFirstName(firstname);
//	}
//
//	@When("user enters lastname {string}")
//	public void user_enters_lastname(String lastname) {
//		createnewcustomeraccount.enterLastname(lastname);
//	}
//
//	@When("user enters email {string}")
//	public void user_enters_email(String email) {
//		
//		if (email.equals("<randomEmail>")) {
//            randomEmail = Generate_RandomEmail.generateRandomEmail();
//            email = randomEmail; 
//        }
//		createnewcustomeraccount.enterEmailAddress(email);
//	}
//
//	@When("user enters password {string}")
//	public void user_enters_password(String password) {
//		createnewcustomeraccount.enterPassword(password);
//	}
//
//	@When("user confirms password {string}")
//	public void user_confirms_password(String password) {
//		createnewcustomeraccount.enterConfirmPassword(password);
//	}
//
//	@When("user submits the details")
//	public void user_submits_the_details() {
//		createnewcustomeraccount.clickCreateAccountButton();
//	}
//
//	@Then("user navigates to the My Account Dashboard and verifies the welcome message")
//	public void user_navigates_to_the_my_account_dashboard_and_verifies_the_welcome_message() {
//	    Assert.assertEquals(getDriver().getTitle(), "My Account");
//	    myaccount.isWelcomeMessageDisplayed();
//	}
//
//	@Then("user clicks on the customer menu toggle")
//	public void user_clicks_on_the_customer_menu_toggle() {
//		myaccount.clickOnCustomerMenu();
//	}
//
//	@Then("user selects the sign out option")
//	public void user_selects_the_sign_out_option() {
//		myaccount.selectSignoutOption();
//	}
//
//
//	@Then("user should get sign out and navigates to the home page")
//	public void user_should_get_sign_out_and_navigates_to_the_home_page() {
//
//		homepage.clickOnSignInLink();
//		
//	}
//
//	@Then("user enters login email {string}")
//	public void user_enters_login_email(String email) {
//		if (email.equals("<randomEmail>")) {
//            email = randomEmail;  
//        }
//		customerlogin.enterLoginEmailID(email);
//	}
//
//	@Then("user enters login password {string}")
//	public void user_enters_login_password(String password) {
//		customerlogin.enterLoginPassword(password);
//	}
//
//	@Then("user clicks on the sign in button")
//	public void user_clicks_on_the_sign_in_button() {
//		customerlogin.clickOnSignInbutton();
//	}
//
//	@Then("user is signed in successfully")
//	public void user_is_signed_in_successfully() {
//	   Assert.assertEquals(getDriver().getTitle(), "My Account", "Login Successful");
//	   
//	}
	
	private static final Logger logger = LoggerFactory.getLogger(TC001_CreateAccountAndSignIn.class);

    Homepage homepage;
    CreateNewCustomerAccount createnewcustomeraccount;
    MyAccount myaccount;
    CustomerLogin customerlogin;
    String randomEmail;

    @Given("user launches the browser and navigates to the Magento homepage")
    public void user_launches_the_browser_and_navigates_to_the_magento_homepage() {
        logger.info("Initializing the homepage, account creation, and login page objects.");
        homepage = new Homepage();
        createnewcustomeraccount = new CreateNewCustomerAccount();
        myaccount = new MyAccount();
        customerlogin = new CustomerLogin();
        logger.info("Successfully initialized page objects.");
    }

    @When("user clicks the create account link")
    public void user_clicks_the_create_account_link() {
        logger.info("User clicking on 'Create Account' link.");
        homepage.clickOnCreateAnAccountLink();
        logger.info("'Create Account' link clicked successfully.");
    }

    @Then("user navigates to the account creation page")
    public void user_navigates_to_the_account_creation_page() {
        logger.info("Verifying if the user has navigated to the account creation page.");
        Assert.assertEquals(getDriver().getTitle(), "Create New Customer Account");
        logger.info("Navigated to account creation page successfully.");
    }

    @When("user enters firstname {string}")
    public void user_enters_firstname(String firstname) {
        logger.info("Entering first name: {}", firstname);
        createnewcustomeraccount.enterFirstName(firstname);
        logger.info("First name entered successfully.");
    }

    @When("user enters lastname {string}")
    public void user_enters_lastname(String lastname) {
        logger.info("Entering last name: {}", lastname);
        createnewcustomeraccount.enterLastname(lastname);
        logger.info("Last name entered successfully.");
    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        if (email.equals("<randomEmail>")) {
            randomEmail = Generate_RandomEmail.generateRandomEmail();
            email = randomEmail;
            logger.info("Generated random email: {}", randomEmail);
        }
        logger.info("Entering email: {}", email);
        createnewcustomeraccount.enterEmailAddress(email);
        logger.info("Email entered successfully.");
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        logger.info("Entering password.");
        createnewcustomeraccount.enterPassword(password);
        logger.info("Password entered successfully.");
    }

    @When("user confirms password {string}")
    public void user_confirms_password(String password) {
        logger.info("Confirming password.");
        createnewcustomeraccount.enterConfirmPassword(password);
        logger.info("Password confirmed successfully.");
    }

    @When("user submits the details")
    public void user_submits_the_details() {
        logger.info("Submitting account creation details.");
        createnewcustomeraccount.clickCreateAccountButton();
        logger.info("Account creation details submitted.");
    }

    @Then("user navigates to the My Account Dashboard and verifies the welcome message")
    public void user_navigates_to_the_my_account_dashboard_and_verifies_the_welcome_message() {
        logger.info("Verifying navigation to 'My Account' dashboard.");
        Assert.assertEquals(getDriver().getTitle(), "My Account");
        myaccount.isWelcomeMessageDisplayed();
        logger.info("Welcome message displayed and verified.");
    }

    @Then("user clicks on the customer menu toggle")
    public void user_clicks_on_the_customer_menu_toggle() {
        logger.info("Clicking on customer menu toggle.");
        myaccount.clickOnCustomerMenu();
        logger.info("Customer menu toggle clicked.");
    }

    @Then("user selects the sign out option")
    public void user_selects_the_sign_out_option() {
        logger.info("Selecting the sign-out option.");
        myaccount.selectSignoutOption();
        logger.info("Sign-out option selected.");
    }

    @Then("user should get sign out and navigates to the home page")
    public void user_should_get_sign_out_and_navigates_to_the_home_page() {
        logger.info("User is signing out and navigating to the homepage.");
        homepage.clickOnSignInLink();
        logger.info("User signed out and navigated to the homepage.");
    }

    @Then("user enters login email {string}")
    public void user_enters_login_email(String email) {
        if (email.equals("<randomEmail>")) {
            email = randomEmail;
            logger.info("Using the previously generated email: {}", email);
        }
        logger.info("Entering login email: {}", email);
        customerlogin.enterLoginEmailID(email);
        logger.info("Login email entered successfully.");
    }

    @Then("user enters login password {string}")
    public void user_enters_login_password(String password) {
        logger.info("Entering login password.");
        customerlogin.enterLoginPassword(password);
        logger.info("Login password entered successfully.");
    }

    @Then("user clicks on the sign in button")
    public void user_clicks_on_the_sign_in_button() {
        logger.info("Clicking on the sign-in button.");
        customerlogin.clickOnSignInbutton();
        logger.info("Sign-in button clicked.");
    }

    @Then("user is signed in successfully")
    public void user_is_signed_in_successfully() {
        logger.info("Verifying if user is signed in successfully.");
        Assert.assertEquals(getDriver().getTitle(), "My Account", "Login Successful");
        logger.info("User signed in successfully and navigated to My Account.");
    }
}
