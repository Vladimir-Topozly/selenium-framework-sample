package ui;

import application_manager.ApplicationManager;
import application_manager.DriverManager;
import application_manager.DriverManagerFactory;
import application_manager.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
//    public String baseUrl = "https://www.saucedemo.com/";

    static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

//    DriverManager driverManager;
//    WebDriver driver = app.getDriver();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
//        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
//        driver = driverManager.getDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        navigateTo(baseUrl);
        app.start();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        app.cleanUp();
        app.stop();
    }

//    private void navigateTo(String url) {
//        driver.get(url);
//    }

}
