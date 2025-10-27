package org.example.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static  WebDriver driver;

    /**
    Это метод для перехода к определенному URL
    @param url
     */
    public static void openWithSpecificUrl(String url){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    /**
    Этот метод завершит работу браузера --> это называется javadoc
     */
    public static void tearDown() {

        if(driver != null){
            driver.quit();
        }
    }
}
