package application_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        this.driver = new ChromeDriver();
    }
}
