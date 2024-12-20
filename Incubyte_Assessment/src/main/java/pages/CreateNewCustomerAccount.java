package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import utilities.TestBase;

public class CreateNewCustomerAccount extends TestBase{

	// Element locators
    private By input_firstname = By.id("firstname");
    private By input_lastName = By.id("lastname");
    private By input_emailID = By.id("email_address");
    private By input_password = By.id("password");
    private By input_ConfirmPassword = By.id("password-confirmation");
    private By btn_createAccount = By.xpath("//button[@title='Create an Account']");
    private By msg_emailAddressError = By.id("email_address-error");
    private By msg_passwordError = By.id("password-error");
    private By msg_passwordConfirmationError = By.id("password-confirmation-error");
	
	
	public CreateNewCustomerAccount(){
		super();
	}
	
	public void enterFirstName(String firstname) {
		getDriver().findElement(input_firstname).sendKeys(firstname);
	}
	
	public void enterLastname(String lastname) {
		getDriver().findElement(input_lastName).sendKeys(lastname);
	}
	
	public void enterEmailAddress(String emailID) {
		getDriver().findElement(input_emailID).sendKeys(emailID);
	}
	
	public void enterPassword(String password) {
		getDriver().findElement(input_password).sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		getDriver().findElement(input_ConfirmPassword).sendKeys(confirmPassword);
	}
	
	public void clickCreateAccountButton() {
		getDriver().findElement(btn_createAccount).click();
	}
	
	public boolean isEmailAddresErrorDisplayed() {
		try {
			WebElement error = getDriver().findElement(msg_emailAddressError);
			return error.isDisplayed();
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean isPasswordErrorDisplayed() {
		try {
			WebElement error = getDriver().findElement(msg_passwordError);
			return error.isDisplayed();
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean isPasswordConfirmationErrorDisplayed() {
		try {
			WebElement error = getDriver().findElement(msg_passwordConfirmationError);
			return error.isDisplayed();
		}catch(NoSuchElementException e) {
			return false;
		}
	}
}
