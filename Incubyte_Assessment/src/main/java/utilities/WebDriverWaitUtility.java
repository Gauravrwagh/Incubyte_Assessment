package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class WebDriverWaitUtility extends TestBase{

    private static final int DEFAULT_WAIT_TIME = 30; // Default wait time in seconds

    // Helper method to wait for an element to be visible
    public static WebElement waitForElementToBeVisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Helper method to wait for an element to be clickable
    public static WebElement waitForElementToBeClickable(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Helper method to wait for the presence of an element in the DOM (not necessarily visible)
    public static WebElement waitForElementPresence(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Helper method to wait for the visibility of all elements matching a locator
    public static List<WebElement> waitForAllElementsToBeVisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    // Helper method to wait for an element's text to be present
    public static boolean waitForElementTextToBe(WebDriver driver, By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.textToBe(locator, text));
    }

    // Helper method to wait for an alert to be present
    public static void waitForAlertToBePresent(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    // Helper method to wait for the element's attribute to contain specific value
    public static boolean waitForElementAttributeToContain(WebDriver driver, By locator, String attribute, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.attributeContains(locator, attribute, value));
    }

    // Helper method to wait until the URL contains a specified string
    public static boolean waitForUrlToContain(WebDriver driver, String url) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.urlContains(url));
    }

    // Helper method to wait for the title of the page to be specific
    public static boolean waitForTitleToBe(WebDriver driver, String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.titleIs(title));
    }

    // Helper method to wait for the title to contain a specific text
    public static boolean waitForTitleContains(WebDriver driver, String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
        return wait.until(ExpectedConditions.titleContains(title));
    }
}

