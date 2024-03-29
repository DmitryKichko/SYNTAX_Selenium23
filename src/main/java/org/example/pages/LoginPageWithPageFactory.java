package org.example.pages;

import org.example.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement password;

    @FindBy(css = "input#btnLogin")
    public WebElement loginBtn;

    public LoginPageWithPageFactory(){

        PageFactory.initElements(driver, this);
    }

}
