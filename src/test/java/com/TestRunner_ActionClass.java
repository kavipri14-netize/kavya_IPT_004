package com;

import com.base.Action_Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestRunner_ActionClass extends Action_Baseclass {


    public static void main(String[] args) {
        launchBrowser("chrome");
        launchUrl("https://demoqa.com/buttons");
        // double click

        WebElement element = driver.findElement(By.id("doubleClickBtn"));
       // doubleclick(doubleClickButton);


    }
}
