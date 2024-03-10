package org.example.class8;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) // создаем FluentWait
                .withTimeout(Duration.ofSeconds(20))  // указываем время сколько ожидать
                .pollingEvery(Duration.ofSeconds(5))  // указываем период (то есть будет ожидать каждые 5 секунд до 20 секунд)
                .ignoring(NoSuchFrameException.class); // указываем условие какое исключение должно быть проигнорированно


    }
}
