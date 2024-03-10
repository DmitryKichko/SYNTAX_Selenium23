package org.example.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {

    public static String url = "https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp&hl=en";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String mainPageHandle = driver.getWindowHandle(); // используется для получения заголовка страницы

        System.out.println(mainPageHandle);

        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles(); // мы записываем в set а не в arraylist так как идентификатор окна должен быть уникальным
                                                                  // то есть он не должен повторяться

        System.out.println(allWindowHandles.size());

        Iterator<String> it = allWindowHandles.iterator(); // затем мы указываем что мы снова хоти пройтись по окнам с помощью итератора

        mainPageHandle = it.next(); // указываем главную страницу
        String childHandle = it.next();  // указываем дочернию страницу
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle); // переходим на главную страницу

        //driver.close();
        driver.quit();

    }
}