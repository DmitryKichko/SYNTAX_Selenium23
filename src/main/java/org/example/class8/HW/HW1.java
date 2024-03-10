package org.example.class8.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

/*
HW1:
Перейдите на https://demoqa.com/browser-windows
- нажмите на Новая вкладка и выведите текст из Новой вкладки в консоль
- нажмите на Новое окно и выведите текст из нового окна в консоли
- нажмите на Новое окно Сообщение и распечатайте текст из нового окна в консоли
- Убедитесь, что заголовок отображается
- Распечатайте заголовок всех страниц

HW2:
- перейдите по ссылке http:// www.uitestpractice.com/Student/Contact
- нажмите на ссылку
- получить текст
- вывести в консоль
 */
public class HW1 {

    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String mainPage = driver.getWindowHandle();
        System.out.println(mainPage);

        WebElement newTab = driver.findElement(By.xpath("//button[text() = 'New Tab']"));
        WebElement newWindow = driver.findElement(By.xpath("//button[text() = 'New Window']"));
        WebElement newWindowMessage = driver.findElement(By.xpath("//button[text() = 'New Window Message']"));

        newTab.click();
        newWindow.click();
        newWindowMessage.click();

        Set<String> allWindowHandles = driver.getWindowHandles();

        System.out.println(allWindowHandles.size());

        Iterator<String> it = allWindowHandles.iterator();

        while(it.hasNext()){

            String handle = it.next();

            if (!mainPage.equals(handle)){
               driver.switchTo().window(handle);
               String tittle = driver.getTitle();
               System.out.println(tittle);
               driver.close();

            }
        }

        driver.switchTo().window(mainPage);
    }
}
