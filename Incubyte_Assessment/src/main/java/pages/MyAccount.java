package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestBase;

public class MyAccount extends TestBase{

	private By msg_welcome = By.xpath("//div[text()='Thank you for registering with Main Website Store.']");
	private By btn_customerMenu = By.xpath("//ul//li[@class='customer-welcome'][1]");
	private By link_signout = By.xpath("//ul[@class='header links']//div[@data-target='dropdown']//ul//li[3]//a");
	
	
	 public MyAccount() {
		super(); 
	}
	 
	 public boolean isWelcomeMessageDisplayed() {
		 try {
			 WebElement welcomeMessage = driver.findElement(msg_welcome);
			 return welcomeMessage.isDisplayed();
		 }catch(Exception e) {
			 return false;
		 }
	 }
	 
	 public void clickOnCustomerMenu() {
		 driver.findElement(btn_customerMenu).click();
	 }
	 
	 public void selectSignoutOption() {
		 driver.findElement(link_signout).click();;
	 }
}
