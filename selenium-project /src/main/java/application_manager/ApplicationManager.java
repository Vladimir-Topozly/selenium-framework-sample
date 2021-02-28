package application_manager;

import pageobjects.*;

public class ApplicationManager {
    private DriversManager driversManager = new DriversManager();
    private MainPage mainPage;
    private CartPage cartPage;
    private ItemPage itemPage;
    private CheckoutPage checkoutPage;
    public String baseUrl = "https://www.saucedemo.com/";

    public void start() {
        driversManager = new DriversManager();

        driversManager.startDriver();

        mainPage = new MainPage(driversManager.driver);

        cartPage = new CartPage(driversManager.driver);

        itemPage = new ItemPage(driversManager.driver);

        checkoutPage = new CheckoutPage(driversManager.driver);

        navigateTo(baseUrl);

        new DemoLogInPage(driversManager.driver).LogIn("standard_user", "secret_sauce");
    }

    public void stop() {
        driversManager.stopDriver();
    }

    private void navigateTo(String url) {
        driversManager.driver.get(url);
    }

    public void refresh() {
        driversManager.driver.navigate().refresh();
    }

    public CartPage openCart() {
        mainPage.cartButton.click();
        return new CartPage(this.driversManager.driver);
    }

    public String getURL() {
        return driversManager.driver.getCurrentUrl();
    }

    public void cleanUp() {
        driversManager.driver.manage().deleteAllCookies();
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

