package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class Day09_Example extends TestBase {
    /*
    Given go to file:///C:/Users/husnu/OneDrive/Desktop/Html-Css%20Batch132-133/Html-Css%20Batch132-133/index.html
    Click on "Click Here For Registration Form"
    Enter username: John
    Enter password: John.123
    Fill the form
    Click Confirm
     */

    @Test
    public void test(){
//        Given go to file:///C:/Users/husnu/OneDrive/Desktop/Html-Css%20Batch132-133/Html-Css%20Batch132-133/index.html
        driver.get("///C:/Users/husnu/OneDrive/Desktop/Html-Css%20Batch132-133/Html-Css%20Batch132-133/index.html");
//        Click on "Click Here For Registration Form"
        String window1Handle= driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here For Regisration Form")).click();
        Set<String> windowHandlesSet= driver.getWindowHandles();
        for (String w: windowHandlesSet){
            if (!w.equals(window1Handle)){
                driver.switchTo().window(w);
            }


        }

//        Enter username: John
        driver.switchTo().alert().sendKeys("John");
//        Enter password: John.123
        driver.switchTo().alert().sendKeys("John.123");
//        Fill the form
//        Click Confirm



    }
}