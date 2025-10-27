package org.example.class10;

// import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenshots {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.className(""));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.manage().window().maximize();
        WebElement username = driver.findElement(By.name("ctl00$MainContent$username"));
        username.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE); // скриншот сделан на этом шаге

//        try{
//            FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }
}
