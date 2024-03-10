package org.example.utils;

import org.example.testbase.BaseClass;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {
    /**
     * Этот метод отправляет текст на заданный веб-элемент
     * @param element
     * @param text
     */
    public void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);

    }

    /**
     * Этот метод переключается на другой frame по индексу
     * @param index
     */
    public void switchToFrame(int index) {
        try{
            driver.switchTo().frame(index);
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }



    }

}
