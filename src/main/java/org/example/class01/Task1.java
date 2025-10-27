package org.example.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /**
     * 1. запустите браузер
     * 2. перейдите на веб-сайт amazon
     * 3. выведите заголовок и url в консоль
     * 4. закройте браузер
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String title=driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title+ " "+url);
        driver.quit();
    }


}
