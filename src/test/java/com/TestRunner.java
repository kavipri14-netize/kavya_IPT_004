package com;

import com.base.Base_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestRunner extends Base_class {


    public static  void main(String[] args){
        launchBrowser("chrome");
        launchUrl("https://www.google.com");
        navigateTo("https://www.facebook.com");
        navigateForward();
        navigateRefresh();
        navigateBack();
        getTitle();
        getCurrentUrl();
        browserTermination();
        WebElement element =driver.findElement(By.name("q"));
        passInput(element,"selenium");
        windowHandles(1);
        selectOptions(element,"index", "1");
        browserTermination();
    }
}
