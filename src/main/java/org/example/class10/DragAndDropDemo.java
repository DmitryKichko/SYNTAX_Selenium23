package org.example.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDropDemo {

    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
      //  action.dragAndDrop(draggable, droppable).perform();   // первый способ

        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();  // второй способ
    }
}