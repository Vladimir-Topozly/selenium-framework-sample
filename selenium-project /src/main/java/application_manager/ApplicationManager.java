package application_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    //    DriverManager driverManager; // TODO: figure out how to make this work
    private WebDriver driver;
    private String browser;
    private MainPage mainPage;
    private CartPage cartPage;
    private ItemPage itemPage;
    private CheckoutPage checkoutPage;
        public String baseUrl = "https://www.saucedemo.com/";


    public WebDriver getDriver() {
        return driver;
    }

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void start() {

//        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
//        driver = driverManager.getDriver();

        switch (browser) {
            case BrowserType.CHROME:
                driver = new ChromeDriver();
                break;
            case (BrowserType.FIREFOX):
                driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
                break;
            case BrowserType.IE:  //TODO: add internet explorer driver to /opt/tools
                driver = new InternetExplorerDriver();
                break;
        }

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        mainPage = new MainPage(driver);

        cartPage = new CartPage(driver);

        itemPage = new ItemPage(driver);

        checkoutPage = new CheckoutPage(driver);

        navigateTo(baseUrl);

        new DemoLogInPage(driver).LogIn("standard_user", "secret_sauce");
    }

    private void navigateTo(String url) {
        driver.get(url);
    }

    public CartPage openCart() {
        mainPage.cartButton.click();
        return new CartPage(this.driver);
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public void stop() {
        driver.quit();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public CartPage getCartPage() {
        return cartPage;
    }

    public ItemPage getItemPage() {
        return itemPage;
    }

    public CheckoutPage getCheckoutPage() {
        return checkoutPage;
    }
}

