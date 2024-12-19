package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {

//	public static WebDriver driver;
//	private static Properties prop;
//	
//	public TestBase() {
//		try {
//			prop = new Properties();
//			InputStream input = getClass().getClassLoader().getResourceAsStream("./config.properties");
//			
//			if(input != null) {
//				prop.load(input);
//			}else {
//				throw new FileNotFoundException("config.properties file not found");
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void initialization() {
//		               
//		String browserName = prop.getProperty("browser");
//		
//		if(browserName.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}else if(browserName.equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}else {
//            System.out.println("Error: Unsupported browser - " + browserName);
//		}
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//		
//		driver.get(prop.getProperty("url"));
//		
//		
//	}
//	public static void tearDown() {
//		if (driver != null) {
//			driver.close();
//		}
//	}
	
private static Properties prop;
    
    // Using ThreadLocal to ensure each thread has its own WebDriver instance
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    
    public TestBase() {
        try {
            prop = new Properties();
            InputStream input = getClass().getClassLoader().getResourceAsStream("./config.properties");

            if (input != null) {
                prop.load(input);
            } else {
                throw new FileNotFoundException("config.properties file not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
    
    public static void initialization() {
        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
        } else if(browserName.equalsIgnoreCase("edge")){
        	WebDriverManager.edgedriver().setup();
        	driver.set(new EdgeDriver());
        }else {
            System.out.println("Error: Unsupported browser - " + browserName);
        }

        // Configuring driver settings
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        getDriver().get(prop.getProperty("url"));
    }

    public static void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();  // Clean up after the test
        }
    }
	
	 
	
}
