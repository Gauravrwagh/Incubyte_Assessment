package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestBase;

public class JacketsTopsWomen extends TestBase{

	private By prodectList = By.xpath("//ol[@class='products list items product-items']//li");
	public JacketsTopsWomen() {
		super();
	}
	
	public void  getProductPriceAndName() {
		
		List<WebElement> products = driver.findElements(prodectList);
		int num = products.size();
		System.out.println(num);
		for(int i=1;i<=num;i++) {
		WebElement name = driver.findElement(By.xpath("//ol[@class='products list items product-items']//li["+i+"]//strong//a"));
		WebElement price = driver.findElement(By.xpath("//ol[@class='products list items product-items']//li["+i+"]//div//div//span[@class='price']"));
		System.out.println("Name : "+ name.getText()+"         price : "+price.getText());
		
	}
}
}
