package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.TestBase;
import utilities.WebDriverWaitUtility;

public class Homepage extends TestBase {


	private By link_CreateAccount = By.xpath("//div[@class='panel header']//ul//a[text()='Create an Account']");
	private By link_Sign = By.xpath("//div[@class='panel header']//ul//li[2]");
	private By menu_WomenSection = By.xpath("//span[text()='Women']/ancestor::a");
	private By subMenuTops = By.xpath("//span[text()='Women']//following::span[text()='Tops'][1]");
    private By opt_Jackets = By.xpath("//span[text()='Jackets']");
    private By opt_BrasandTanks = By.xpath("//span[text()='Bras & Tanks']");
    private By opt_Tees = By.xpath("//span[text()='Tees']");
    private By opt_HoodiesAndSweatshirts = By.xpath("//span[text()='Hoodies & Sweatshirts']");
    
	private By subMenuBottoms = By.xpath("//span[text()='Men']//following::span[text()='Bottoms']");
    private By opt_Pants = By.xpath("//span[text()='Men']//following::span[text()='Pants'][1]");
    private By opt_Shorts = By.xpath("//span[text()='Shorts']");


	private By menu_MenSection = By.xpath("//span[text()='Men']/ancestor::a");
	

	public Homepage() {
		//this.driver = driver;
		super();
		
	}
	
	

	Actions act = new Actions(getDriver());
	
	public void clickOnCreateAnAccountLink() {
		WebElement createAccount = WebDriverWaitUtility.waitForElementToBeClickable(getDriver(), link_CreateAccount);
//		WebElement createAccount = driver.findElement(link_CreateAccount);
		createAccount.click();
	}
	
	
	public void clickOnSignInLink() {
		getDriver().findElement(link_Sign).click();
	}
	
	public void selectJackets() {
	//	Actions act = new Actions(driver);
		
		WebElement womensMenu = WebDriverWaitUtility.waitForElementToBeVisible(getDriver(), menu_WomenSection);
		WebElement tops = getDriver().findElement(subMenuTops);
		WebElement jackets = getDriver().findElement(opt_Jackets);
		
		act.moveToElement(womensMenu).perform();
	//	System.out.println(womensMenu.isEnabled());

		act.moveToElement(tops).perform();
	//	System.out.println(tops.isEnabled());
	//	System.out.println(jackets.isEnabled());

		act.moveToElement(jackets).click().perform();
		
	}
	
	public void selectPants() {
	//	Actions act = new Actions(driver);

		WebElement mensMenu = WebDriverWaitUtility.waitForElementToBeVisible(getDriver(), menu_MenSection);
		WebElement bottoms = getDriver().findElement(subMenuBottoms);
		WebElement pants = getDriver().findElement(opt_Pants);
		
		act.moveToElement(mensMenu).perform();
	//	System.out.println(mensMenu.isEnabled());
		act.moveToElement(bottoms).perform();
	//	System.out.println(bottoms.isEnabled());
	//	System.out.println(pants.isEnabled());

		act.moveToElement(pants).click().perform();
	}
	
	
	 	
	
}
