package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecutionExample {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Create a ChromeDriver instance
        WebDriver driver1 = new ChromeDriver();
        RemoteWebDriver driver2 = new ChromeDriver();
        ChromeDriver driver3 = new ChromeDriver();
        ChromiumDriver driver4 = new ChromeDriver();

        // Now you can use the JavascriptExecutor methods directly
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver1;
        PrintsPage printsPage = (PrintsPage) driver1;
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver1;
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver3;

        // jsExecutor.executeScript("console.log('Hello from JavaScript');");
        driver2.executeScript("console.log('Hello from JS RemoteWebDriver')");
        // Don't forget to close the WebDriver instance when you're done
        // driver.quit();
    }
}