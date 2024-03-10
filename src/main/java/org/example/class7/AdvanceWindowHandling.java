package org.example.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandling {

    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        WebElement instagramButton = driver.findElement(By.linkText("Follow On Instagram")); // если мы ищем по тексту ссылки, то пробелов в начале и в конце не должно быть
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Following Instagram & Facebook"));

        instagramButton.click();
        fbButton.click();
        igAndFbButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());

        Iterator<String> it = allWindowHandles.iterator();

        while(it.hasNext()) {                     // начать итерацию по handles, использовали для закрытия дочерних страниц, но главную страницу оставляем открытой
           String handle = it.next();             // получить следующий handle, указываем главную страницу

           if(!mainPageHandle.equals(handle)){        // задать условие, указали условие для закрытия дочерних страниц (мы исключаем главную страницу из цикла, чтобы ее не закрывать)

               driver.switchTo().window(handle); // переключиться на окно, не равное по размеру handle главной страницы
               String tittle = driver.getTitle();
               System.out.println(tittle);
               driver.close();

           }
        }
        // для того чтобы начать дальнейшие действия, нам нужно снова переключится на главную страницу
        // так как когда мы закрывали вкладки, selenium фокусируется на последней открытой странице
        // поэтому нам нужно опять сфокусироваться на главной странице и выполнять дальнейшие действия

        driver.switchTo().window(mainPageHandle); // снова сфокусировались на главной странице
        instagramButton.click();

    }
}