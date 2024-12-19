package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestBase;

public class PantsMen extends TestBase{
	
	private By prodectList = By.xpath("//ol[@class='products list items product-items']//li");

	public PantsMen() {
		super();
	}
	
public void  getProductPriceAndName() {
	
		
		List<WebElement> products = getDriver().findElements(prodectList);
		int num = products.size();
		System.out.println(num);

		for(int i=1;i<=num;i++) {
		WebElement name = getDriver().findElement(By.xpath("//ol[@class='products list items product-items']//li["+i+"]//strong//a"));
		WebElement price = getDriver().findElement(By.xpath("//ol[@class='products list items product-items']//li["+i+"]//div//div//span[@class='price']"));
		System.out.println(String.format("%-35s %-10s", "Name: " + name.getText(), "Price: " + price.getText()));

	}
}

}
