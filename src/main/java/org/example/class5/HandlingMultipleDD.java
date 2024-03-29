package org.example.class5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class HandlingMultipleDD {

    public static String url = "https://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement stateDD = driver.findElement(By.id("multi-select"));
        Select select = new Select(stateDD);
        boolean isMultiple = select.isMultiple(); // метод isMultiple() - позволяет проверить является ли данное поле, полем множественного выбора (возвращает boolean значение)
        System.out.println(isMultiple);
        if (isMultiple) {
            List<WebElement> options = select.getOptions();
            for (WebElement option : options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(1000);
            }
        }

        select.selectByIndex(5);
    }
}
