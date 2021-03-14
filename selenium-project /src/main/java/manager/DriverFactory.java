package manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

class DriverFactory {

    static WebDriverManager getDriverManager(DriverType type) {
        WebDriverManager webDriverManager = null;

        switch (type) {
            case IE:
                webDriverManager = new IEDriverManager();
                break;
            case FIREFOX:
                webDriverManager = new FirefoxDriverManager();
                break;
            case CHROME:
                webDriverManager = new ChromeDriverManager();
                break;
        }

        return webDriverManager;
    }

    public static class FirefoxDriverManager extends WebDriverManager {
        @Override
        protected void createWebDriver() {
            this.driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }
    }

    public static class IEDriverManager extends WebDriverManager {
        @Override
        protected void createWebDriver() {
            this.driver = new InternetExplorerDriver();
        }
    }

    public static class ChromeDriverManager extends WebDriverManager {
        @Override
        protected void createWebDriver() {
            this.driver = new ChromeDriver();
        }
    }

    public enum DriverType {
        CHROME, FIREFOX, IE
    }
}
