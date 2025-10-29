package org.example.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
1. HW
Navigate to http://syntaxprojects.com
Click on start practicing
click on simple form demo
enter any text on first text box
click on show massage
quit the browser

1. HW
Перейдите на сайт http://syntaxprojects.com
Нажмите на "Начать практиковаться
нажмите на демонстрацию простой формы
введите любой текст в первое текстовое поле
нажмите на показать письмо
выйти из браузера

 */
public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        Thread.sleep(2000);
        WebElement startPracticing = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticing.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("(//a[text()= 'Simple Form Demo'])[2]"));
        simpleFormDemo.click();
        Thread.sleep(2000);
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder ^='Please enter your Message' ]"));
        textBox.sendKeys("Money Bags");
        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick *= 'owIn']"));
        showMessageButton.click();
        driver.quit();

    }
}
