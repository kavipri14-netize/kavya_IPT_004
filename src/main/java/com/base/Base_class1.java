package com.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.fail;

public class Base_class1 {
    public static WebDriver driver;

    protected static WebDriver launchBrowser(String browserName) {

        try {
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            }
            if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
        } catch (Exception e) {
            fail("Error: OCCURE DURING BROWSER LAUNCH");
        }
        driver.manage().window().maximize();
        return driver;
    }

    protected static void launchUrl(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
    }

    public static void passInput(WebElement element, String value) {
        //try {
        element.clear();
        element.sendKeys(value);
    } //catch (Exception e) {
    //fail("ERROR WHILE TYPING TEXT->" +e.getMessage());
    //}

    protected static void elementClick(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
    }

    protected static void enterText(WebElement element, String value) {
        try {
            element.clear();
            element.sendKeys(value);
        } catch (Exception e) {
            fail("ERROR:  OCCURE DURING  URL LAUNCH");
        }
    }

    // get text
    protected static String getText(WebElement element) {
        try {
            return element.getText();
        } catch (Exception e) {
            fail("ERROR: OCCURE DURING URL LAUNCH");
        }
        return null;
    }

    public static void waitForElementClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    // wait for alert
    public static void waitForAlert(){
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.alertIsPresent());
    }
    // accept alert click OK
    public static void acceptAlert(){
        Alert alert= driver.switchTo().alert();
        alert.accept();
    }
// get alert message
    public static String getAlertMessage() {
        waitForAlert();
        Alert alert = driver.switchTo().alert();
       return alert.getText();
    }

        public static  void browserTermination() {
            try {
                driver.quit();
            } catch (Exception e) {
                fail("ERROR:  OCCURE DURING  URL LAUNCH ");
            }
        }
        }






