package org.example.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","driver/chromedriver");
                                                     // для windows добавьте расширение .exe
                                                     // вы можете использовать \\
        WebDriver driver = new ChromeDriver(); // запуск браузера
        driver.get("https://www.google.ru/"); // открывает сайт
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
