package org.example.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo3 {

    public static String url = "http://www.google.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open();");
        driver.get(url);
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("ljdfmjkfdnjk");
    }
}