package application_manager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends WebDriverManager {
    @Override
    protected void createWebDriver() {
        this.driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    }
}
