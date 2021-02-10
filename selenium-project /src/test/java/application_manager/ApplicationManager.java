package application_manager;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    String baseUrl = "https://x.gloat.com/careers/";

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navigateTo(baseUrl);
    }

    private void navigateTo(String url) {
        driver.get(url);
    }

    String getURL() {
        return driver.getCurrentUrl();
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}

