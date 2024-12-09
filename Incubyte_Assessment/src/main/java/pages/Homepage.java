package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.TestBase;

public class Homepage extends TestBase {

	private By link_CreateAccount = By.xpath("//div[@class='panel header']//ul//a[text()='Create an Account']");
	private By link_Sign = By.xpath("//div[@class='panel header']//ul//li[2]");

	public Homepage() {
		//this.driver = driver;
		super();
		
	}

	public void clickOnCreateAnAccountLink() {
		WebElement createAccount = driver.findElement(link_CreateAccount);
		createAccount.click();
	}

	public void clickOnSignInLink() {
		driver.findElement(link_Sign).click();
	}
}
