package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtility {

	public static void captureScreenshot(WebDriver driver, String scenarioName) {
        // Get the timestamp for uniqueness
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Cast WebDriver to TakesScreenshot
        TakesScreenshot screenshotTaker = (TakesScreenshot) driver;

        // Define the location and filename for the screenshot inside target/screenshot
        String screenshotPath = System.getProperty("user.dir") + "/target/screenshots/" + scenarioName + "_" + timestamp + ".png";

        // Create the screenshot folder if it doesn't exist
        File screenshotFolder = new File(System.getProperty("user.dir") + "/target/screenshots/");
        if (!screenshotFolder.exists()) {
            screenshotFolder.mkdirs();
        }

        // Capture the screenshot
        File screenshot = screenshotTaker.getScreenshotAs(OutputType.FILE);

        // Copy the screenshot to the desired location
        try {
            FileUtils.copyFile(screenshot, new File(screenshotPath));
            System.out.println("Screenshot saved at: " + screenshotPath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}
