package manager;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverManager {
    protected WebDriver driver;

    protected abstract void createWebDriver();

    void quitDriver() {
        if (null != driver) {
            driver.close();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (null == driver) {
            createWebDriver();
        }
        return driver;
    }


}

