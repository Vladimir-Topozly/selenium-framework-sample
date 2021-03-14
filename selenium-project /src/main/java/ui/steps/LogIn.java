package ui.steps;

import org.openqa.selenium.WebDriver;
import ui.pageobjects.DemoLogInPage;

public class LogIn {

    public void doLogin(WebDriver driver) {
        new DemoLogInPage(driver).LogIn("standard_user", "secret_sauce");
    }
}
