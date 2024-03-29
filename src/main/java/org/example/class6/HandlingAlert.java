package org.example.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert = driver.switchTo().alert();  // нужно использовать swithTo().alert() чтобы работать с оповещениями
                                                        // то-есть мы переключаем внимание на всплывающее окна
        Thread.sleep(1000);
        simpleAlert.accept();  // нажимаем на кнопку ок

        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        String alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();   // нажимаем на кнопку отмена

        WebElement promptAlertButton = driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("любой текст");
        promptAlert.accept();
    }
}