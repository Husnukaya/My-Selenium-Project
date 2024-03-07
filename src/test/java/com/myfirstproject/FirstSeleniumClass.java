package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.net.MalformedURLException;
import java.net.URL;

public class FirstSeleniumClass {
    public static void main(String[] args) throws MalformedURLException {

//        String pathOfChrome =SeleniumManager.getInstance().getDriverPath("chromedriver");
//        System.out.println("pathOfChrome = " + pathOfChrome);

      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

       ChromeOptions options= new ChromeOptions();
       options.addArguments("--disable-extensions");

        WebDriver driver = new ChromeDriver(options);

//       URL url = new URL("https://www.techproeducation.com");
//
//       driver.navigate().to(url);

        driver.get("https://www.amazon.com");

        driver.quit();


    }
}
