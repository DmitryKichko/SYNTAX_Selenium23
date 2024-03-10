package org.example.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0); // используется для переключения на frame страницу по индексу
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("любой текст который мы ходим передать");

        driver.switchTo().defaultContent(); // используется для переключения на основную страницу

        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();


        driver.switchTo().frame("iframe_a");  // фрейм по имени
        textBox.clear();                         // используется для удаления текста в текстовой строке
        textBox.sendKeys("любой тест");

        driver.switchTo().defaultContent(); // используется для переключения на основную страницу

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']")); // фрейм по web-элементу
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("любой тест");

    }
}