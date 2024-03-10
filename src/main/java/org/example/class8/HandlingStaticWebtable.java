package org.example.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticWebtable {

    public static String url = "https://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

       List<WebElement> rowData = driver.findElements(By.xpath("//table[@id= 'task-table']/tbody/tr"));
       System.out.println(rowData.size());

        Iterator<WebElement> it = rowData.listIterator();

        while (it.hasNext()){
            WebElement row = it.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }

        System.out.println("--------------------------------------------------");

        List<WebElement> corsData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(corsData.size());

        for (WebElement colData : corsData) {
            String coltext = colData.getText();
            System.out.println(coltext);
        }
    }
}