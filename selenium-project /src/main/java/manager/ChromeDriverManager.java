package manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends WebDriverManager {
    @Override
    protected void createWebDriver() {
        this.driver = new ChromeDriver();
    }
}
