package com.base;


import org.jspecify.annotations.NonNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public abstract class Base_class {
 public static WebDriver driver;
    protected  static WebDriver launchBrowser(String browserName) {

        try {
            if (browserName.equalsIgnoreCase("chrome")){
                driver = new ChromeDriver();
            }
            else if(browserName.equalsIgnoreCase("firefox")){
                driver = new FirefoxDriver();
            }
            if(browserName.equalsIgnoreCase("edge")){
                driver = new EdgeDriver();
            }
        } catch (Exception e) {
            Assert.fail("Error: OCCURE DURING BROWSER LAUNCH");
        }
        driver.manage().window().maximize();
        return driver;
    }

    protected static void launchUrl(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
    }

    public static void passInput(WebElement element, String value) {
        try {
            element.sendKeys(value);
        } catch (Exception e) {
            Assert.fail("ERROR:  OCCUR DURING  URL LAUNCH ");
        }
    }

    protected static void clickOnElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
    }

    public static void browserTermination() {
        try {
            driver.quit();
        } catch (Exception e) {
            Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
    }

    protected static void windowHandles(int num) {
        try {
            List<String> allWindows = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(allWindows.get(num));
        } catch (Exception e) {
        Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
    }
}
protected static  void selectOptions(WebElement element,String type,String value) {
    Select select = new Select(element);
    try {
        if (type.equalsIgnoreCase("value")){
            select.selectByValue(value);
        }
        else if(type.equalsIgnoreCase("index")){
            select.selectByIndex(Integer.parseInt(value));
        }
        else if(type.equalsIgnoreCase("text")){
            select.selectByVisibleText(value);
        }
    } catch (Exception e) {
        Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
    }
}
protected static  void deselectOptions(WebElement element,String type,String value) {
    Select select = new Select(element);
    try {
        if (type.equalsIgnoreCase("value")){
            select.deselectByValue(value);
        }
        else if(type.equalsIgnoreCase("index")){
            select.deselectByIndex(Integer.parseInt(value));
        }
        else if(type.equalsIgnoreCase("text")){
            select.deselectByVisibleText(value);
        }
    } catch (Exception e) {
        Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
    }
}
protected static void navigateTo(String  url){
        try{
            driver.navigate().to(url);
        } catch (Exception e) {
            Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
        }
    protected  static void navigateBack() {
        try {
            driver.navigate().back();
        } catch (Exception e) {
            Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
    }
        protected static void navigateForward() {
            try {
                driver.navigate().forward();
            } catch (Exception e) {
                Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
            }
        }
            protected static void navigateRefresh(){
                try{
                    driver.navigate().refresh();
                } catch (Exception e) {
                    Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
                }
}
// get methods
    protected static String getTitle(){
        try{
            String title =driver.getTitle();
            System.out.println(title);
        } catch (Exception e) {
            Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
        return "title";
    }
        protected  static  String getCurrentUrl(){
        try{
              String currentUrl =driver.getCurrentUrl() ;
              System.out.println(currentUrl);
        } catch (Exception e) {
            Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
        }
            return "currentUrl";
        }
}
 // Alert methods
