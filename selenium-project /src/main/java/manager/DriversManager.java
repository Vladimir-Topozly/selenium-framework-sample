package manager;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriversManager {
    public WebDriver driver;
    private WebDriverManager driverManager;
    private String browser;

    public DriversManager(String browser) {
        this.browser = browser;
    }

    //TODO: create a task for Local Run on different browsers types
    // also make possible running it via CMD and setting Browser as a System property

    public void startDriver() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void stopDriver() {
        driverManager.quitDriver();
    }
}
