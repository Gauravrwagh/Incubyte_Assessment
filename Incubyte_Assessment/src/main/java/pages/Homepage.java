package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.TestBase;
import utilities.WebDriverWaitUtility;

public class Homepage extends TestBase {

	private By link_CreateAccount = By.xpath("//div[@class='panel header']//ul//a[text()='Create an Account1']");
	private By link_Sign = By.xpath("//div[@class='panel header']//ul//li[2]");
	private By menu_WomenSection = By.xpath("//span[text()='Women']/ancestor::a");
	private By subMenuTops = By.xpath("//span[text()='Women']//following::span[text()='Tops'][1]");
    private By opt_Jackets = By.xpath("//span[text()='Jackets']");
	private By menu_MenSection = By.xpath("//span[text()='Men']/ancestor::a");
	

	public Homepage() {
		//this.driver = driver;
		super();
		
	}

	public void clickOnCreateAnAccountLink() {
		WebElement createAccount = WebDriverWaitUtility.waitForElementToBeClickable(driver, link_CreateAccount);
//		WebElement createAccount = driver.findElement(link_CreateAccount);
		createAccount.click();
	}
	
	
	public void clickOnSignInLink() {
		driver.findElement(link_Sign).click();
	}
	
	public void selectJackets() {
		Actions act = new Actions(driver);
		
		WebElement womensMenu = WebDriverWaitUtility.waitForElementToBeVisible(driver, menu_WomenSection);
		WebElement tops = driver.findElement(subMenuTops);
		WebElement jackets = driver.findElement(opt_Jackets);
		
		act.moveToElement(womensMenu).perform();
	//	System.out.println(womensMenu.isEnabled());

		act.moveToElement(tops).perform();
	//	System.out.println(tops.isEnabled());
	//	System.out.println(jackets.isEnabled());

		act.moveToElement(jackets).click().perform();
		

		
		
	}
}
