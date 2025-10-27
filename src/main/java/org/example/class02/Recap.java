package org.example.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://vk.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        if(title.equals("Добро пожаловать | ВКонтакте")) {  // смотреть и писать в заголовке нового окна
            System.out.println("Title is Correct");
        } else {
            System.out.println("Title is Wring");
        }
        driver.quit();
    }
}
