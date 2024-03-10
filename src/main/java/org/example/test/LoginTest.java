package org.example.test;

import org.example.pages.LoginPage;
import org.example.testbase.BaseClass;

public class LoginTest {
//в тестовых классах мы ничего расширять не будем
    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BaseClass.tearDown();
    }
}
