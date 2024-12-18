package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectUtility {

    // Method to select an option by visible text
    public static void selectByVisibleText(WebDriver driver, By dropdownLocator, String text) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    // Method to select an option by value
    public static void selectByValue(WebDriver driver, By dropdownLocator, String value) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    // Method to select an option by index
    public static void selectByIndex(WebDriver driver, By dropdownLocator, int index) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }

    // Method to get all options from the dropdown
    public static List<WebElement> getDropdownOptions(WebDriver driver, By dropdownLocator) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        return select.getOptions();
    }

    // Method to get the currently selected option
    public static String getFirstSelectedOption(WebDriver driver, By dropdownLocator) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        return select.getFirstSelectedOption().getText();
    }

    // Method to check if the dropdown allows multiple selections
    public static boolean isMultiple(WebDriver driver, By dropdownLocator) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        return select.isMultiple();
    }

    // Method to deselect all selected options in a multi-select dropdown
    public static void deselectAll(WebDriver driver, By dropdownLocator) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        select.deselectAll();
    }

    // Method to deselect an option by visible text in a multi-select dropdown
    public static void deselectByVisibleText(WebDriver driver, By dropdownLocator, String text) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        select.deselectByVisibleText(text);
    }

    // Method to deselect an option by value in a multi-select dropdown
    public static void deselectByValue(WebDriver driver, By dropdownLocator, String value) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        select.deselectByValue(value);
    }

    // Method to deselect an option by index in a multi-select dropdown
    public static void deselectByIndex(WebDriver driver, By dropdownLocator, int index) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select select = new Select(dropdown);
        select.deselectByIndex(index);
    }
}

