package ui.steps;

import org.openqa.selenium.WebDriver;
import ui.pageobjects.DemoLogInPage;

import java.util.Properties;

public class LogIn {

//    Properties props = new Properties();

    public void doLogin(WebDriver driver) {
//        new DemoLogInPage(driver).LogIn(props.getProperty("username"), props.getProperty("password"));
        new DemoLogInPage(driver).LogIn("standard_user", "secret_sauce");
    }
}
