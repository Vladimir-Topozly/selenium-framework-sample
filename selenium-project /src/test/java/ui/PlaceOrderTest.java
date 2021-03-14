package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pageobjects.CartPage;
import ui.pageobjects.CheckoutPage;
import ui.pageobjects.MainPage;

public class PlaceOrderTest extends TestBase {
    @Test()
    public void paceOrderTest() {
        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        mainPage.addToCart();

        mainPage.openCart();

        cartPage.checkout();

        checkoutPage.fillCheckOutForm("Name",
                "LastName", "zip");

        String title = checkoutPage.getTitle();

        Assert.assertEquals(title, "THANK YOU FOR YOUR ORDER");
    }
}
