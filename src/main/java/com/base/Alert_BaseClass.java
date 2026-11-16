package com.base;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


    public  abstract class Alert_BaseClass {
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
         protected  static void acceptAlert() {
             try {
                 driver.switchTo().alert().accept();
             } catch (Exception e) {
                 Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
             }
         }
             protected  static void dismissAlert () {
                 try {
                     driver.switchTo().alert().dismiss();
                 } catch (Exception e) {
                     Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
                 }
             }
             protected static String getAlertText() {
                 try {
                     String text = driver.switchTo().alert().getText();
                     System.out.println(text);
                 } catch (Exception e) {
                     Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");

                 }
                 return "text";
             }
          protected   static void sendAlertText(String message){
            try{
                Alert  alert=driver.switchTo().alert();
                alert.sendKeys(message);
            } catch (Exception e) {
                Assert.fail("ERROR:  OCCURE DURING  URL LAUNCH ");
            }
          }
         }








