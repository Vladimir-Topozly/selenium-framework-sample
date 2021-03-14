package manager;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverManager extends WebDriverManager {
    @Override
    protected void createWebDriver() {
        this.driver = new InternetExplorerDriver();
    }
}
