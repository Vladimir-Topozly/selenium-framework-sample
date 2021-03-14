package manager;

// TODO: Get rid of this class as following:
public class ApplicationManager {
    private DriversManager driversManager = new DriversManager();

    // TODO: initialize pages directly in the test:
//    private MainPage mainPage;
//    private CartPage cartPage;
//    private ItemPage itemPage;
//    private CheckoutPage checkoutPage;

    // TODO: create file "resources/properties" to call the baseURL
//    public String baseUrl = "https://www.saucedemo.com/";

//    public void start() {
//        driversManager = new DriversManager();
//
//        driversManager.startDriver();

//        mainPage = new MainPage(driversManager.driver);
//
//        cartPage = new CartPage(driversManager.driver);
//
//        itemPage = new ItemPage(driversManager.driver);
//
//        checkoutPage = new CheckoutPage(driversManager.driver);
//
//        navigateTo(baseUrl);
//
//        // TODO: create a class for SignIn in the ui/steps directory :
//        new DemoLogInPage(driversManager.driver).LogIn("standard_user", "secret_sauce");
//    }

    // TODO: move all the below methods to utils
//    public void stop() {
//        driversManager.stopDriver();
//    }
//
//    private void navigateTo(String url) {
//        driversManager.driver.get(url);
//    }
//
//    public void refresh() {
//        driversManager.driver.navigate().refresh();
//    }
//
//    public void cleanUp() {
//        driversManager.driver.manage().deleteAllCookies();
//    }


    // TODO: move all the below methods to Pages and Tests
    //  (create 2 constructors: one default and one for initializing the page)
//    public CartPage openCart() {
//        mainPage.cartButton.click();
//        return new CartPage(this.driversManager.driver);
//    }

//    public String getURL() {
//        return driversManager.driver.getCurrentUrl();
//    }

//    public MainPage getMainPage() {
//        return mainPage;
//    }
//
//    public CartPage getCartPage() {
//        return cartPage;
//    }
//
//    public ItemPage getItemPage() {
//        return itemPage;
//    }
//
//    public CheckoutPage getCheckoutPage() {
//        return checkoutPage;
//    }
}

