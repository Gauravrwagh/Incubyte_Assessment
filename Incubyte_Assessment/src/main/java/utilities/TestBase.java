package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	private static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			InputStream input = getClass().getClassLoader().getResourceAsStream("./config.properties");
			
			if(input != null) {
				prop.load(input);
			}else {
				throw new FileNotFoundException("config.properties file not found");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		               
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
            System.out.println("Error: Unsupported browser - " + browserName);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get(prop.getProperty("url"));
		
		
	}
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
