package org.example.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTask {
    /**
     * Задача:
     * - Перейдите по ссылке http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
     * - Войдите в систему
     * - Получите заголовок и проверьте его
     * - Закройте браузер
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver"); // указываем свойство и путь к драйверу
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.manage().window().maximize();
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Web Orders")) {
            System.out.println("Заголовок верный!");
        }else {
            System.out.println("Заголовок НЕПРАВИЛЬНЫЙ!");
        }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }

}
