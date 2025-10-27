package org.example.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mail.ru/");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000); // задержка на 2 секунды
        driver.navigate().refresh();
        // driver.close(); // закроет текущее окно
        driver.quit(); // закроет весь браузер
    }
}
