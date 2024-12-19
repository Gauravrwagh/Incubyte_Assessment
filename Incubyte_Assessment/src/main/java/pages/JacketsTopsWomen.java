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
		
		List<WebElement> products = getDriver().findElements(prodectList);
		int num = products.size();
		System.out.println(num);
   //     System.out.printf("%-35s %-10s\n", "Name", "Price");

		for(int i=1;i<=num;i++) {
		WebElement name = getDriver().findElement(By.xpath("//ol[@class='products list items product-items']//li["+i+"]//strong//a"));
		WebElement price = getDriver().findElement(By.xpath("//ol[@class='products list items product-items']//li["+i+"]//div//div//span[@class='price']"));
	//	System.out.println("Name : "+ name.getText()+"         price : "+price.getText());
    //    System.out.printf("%-30s $%-10.2f\n", name.getText(), price.getText());
		System.out.println(String.format("%-35s %-10s", "Name: " + name.getText(), "Price: " + price.getText()));

		
	}
}
	
	
}
