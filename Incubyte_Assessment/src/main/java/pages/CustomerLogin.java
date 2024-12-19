package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestBase;

public class CustomerLogin extends TestBase{

	private By input_email = By.id("email");
	private By input_password = By.id("pass");
	private By btn_signIn = By.id("send2");
	
	public CustomerLogin() {
		super();
	}
	
	public void enterLoginEmailID(String email) {
		WebElement emailid = getDriver().findElement(input_email);
		emailid.clear();
		emailid.sendKeys(email);
	}
	
	public void enterLoginPassword(String password) {
		WebElement pass = getDriver().findElement(input_password);
		pass.clear();
		pass.sendKeys(password);
	}
	
	public void clickOnSignInbutton() {
		getDriver().findElement(btn_signIn).click();
	}
}
