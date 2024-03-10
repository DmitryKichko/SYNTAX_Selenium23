package org.example.test;

// import org.apache.commons.io.FileUtils;
import org.example.pages.DashboardPage;
import org.example.pages.LoginPageWithPageFactory;
import org.example.testbase.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {

    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory loginPageWithPageFactory = new LoginPageWithPageFactory();
        DashboardPage dashboardPage = new DashboardPage();
        loginPageWithPageFactory.username.sendKeys("Admin");
        loginPageWithPageFactory.password.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginBtn.click();

        TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

//        try {
//            FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String welcomeText = dashboardPage.welcomeAdmin.getText();
        System.out.println(welcomeText);

        BaseClass.tearDown();
    }
}
