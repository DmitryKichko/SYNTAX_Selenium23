package org.example.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://passport.yandex.ru/");
        // driver.findElement(By.id("passp-field-login")).sendKeys("+7(922)071-49-59");
        // driver.findElement(By.id("passp:sign-in")).click();
        Thread.sleep(2000);
       // driver.findElement(By.className("Link Link_pseudo Link_view_default Link_weight_medium")).click();
        driver.findElement(By.partialLinkText("Не помню")).click();
        driver.quit();
    }
}
