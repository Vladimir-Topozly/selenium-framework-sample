package application_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;


import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver driver;
    private String browser;

    String baseUrl = "https://www.saucedemo.com/index.html";

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void start() {
        if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equals((BrowserType.FIREFOX))) {
            driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        navigateTo(baseUrl);
    }
//
//    @BeforeMethod(alwaysRun = true)
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        navigateTo(baseUrl);
//    }

    private void navigateTo(String url) {
        driver.get(url);
    }

    public void stop() {
        driver.quit();
    }

    String getURL() {
        return driver.getCurrentUrl();
    }

    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        driver.quit();
//    }
}

