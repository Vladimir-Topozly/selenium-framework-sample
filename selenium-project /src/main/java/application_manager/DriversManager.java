package application_manager;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

class DriversManager {
    WebDriver driver;
    private WebDriverManager driverManager;

    void startDriver() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    void stopDriver(){
        driverManager.quitDriver();
    }
}
