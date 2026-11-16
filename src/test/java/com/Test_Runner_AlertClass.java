package com;

import com.base.Alert_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import static com.base.Action_BaseClass.sendAlertText;


public class Test_Runner_AlertClass extends Alert_BaseClass {

    public static  void main(String[] args){
        launchBrowser("chrome");
        launchUrl("https://www.selenium.dev/selenium/web/alerts.html");
        WebElement element = driver.findElement(By.xpath("//div[@id='circle']"));


        // System.out.println(getAlertText());
      //  sendAlertText("hello automation ");
        //acceptAlert();
       //browserTermination();

    }
}

