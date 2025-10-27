package org.example.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.manage().window().maximize(); // откроет максимальный размер окна
       // driver.manage().window().fullscreen(); // полностью еще больше откроет размер окна
    }
}
