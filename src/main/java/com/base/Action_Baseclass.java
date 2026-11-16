package com.base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static com.base.Base_class.driver;

public class Action_Baseclass {
    public static WebDriver driver;
    public static Actions actions;
    //  Actions actions = new Actions(driver);

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
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {
            Assert.fail("Error: OCCURE DURING BROWSER LAUNCH");
        }
        return driver;
    }

     protected static void launchUrl(String url) {
         try {
             driver.get(url);
             actions = new Actions(driver);
         } catch (Exception e) {
         }
     }
   // Actions actions = new Actions(driver);

    // mouse hover
    public void mouseHover(WebElement element) {
        actions.moveToElement(element).perform();
    }

    // right click
    public void rightclick(WebElement element) {
        try {
            actions.contextClick(element).perform();
        } catch (Exception e) {
            Assert.fail("Error: OCCURE DURING BROWSER LAUNCH");
        }
    }

    // double click
    public void doubleclick(WebElement element) {
        try {
            actions.doubleClick(element).perform();
        } catch (Exception e) {
            Assert.fail("Error: OCCURE DURING BROWSER LAUNCH");
        }
    }

    // right click
    public void clickandhold(WebElement element) {
        actions.clickAndHold(element).perform();
    }

    // release
    public void release(WebElement element) {
        actions.release(element).perform();
    }

    //drag and drop
    public void draganddrop(WebElement source, WebElement target) {
        try {
            actions.dragAndDrop(source, target).perform();
        } catch (Exception e) {
            Assert.fail("Error: OCCURE DURING BROWSER LAUNCH");
        }
    }
    // send keys
    public void sendKeys(WebElement element,String value){
        actions.moveToElement(element).click().sendKeys(value).perform();
    }

    // browser close
    public void browserclose(){
        driver.quit();
    }
}

