package org.example.class9.HWclass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
HW1:
перейдите на https://the-internet.herokuapp.com/dynamic_controls
нажмите на флажок и нажмите на удалить
проверьте текст
нажмите на кнопку включить, чтобы убедиться, что поле включено
введите текст и нажмите отключить
проверьте, что текстовое поле отключено

создайте пакет и назовите его utils
создайте класс и назовите его CommonMethods
создайте функции (методы) для открытия и закрытия браузеров
 */
public class HW1 {

    public static String url = "https://selectorshub.com/xpath-practice-page/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> webTable = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));

        for (WebElement table : webTable) {
            String tableText = table.getText();

            if (tableText.equals("Admin")){

            }
        }
    }
}
