package application_manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IEDriverManager extends WebDriverManager {
    @Override
    protected void createWebDriver() {
        this.driver = new FirefoxDriver();
    }
}
