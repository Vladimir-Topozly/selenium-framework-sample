package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.CartPage;

public class UITests extends TestBase {

    @Test()
    public void SuccessfulLogInTest() {
        String url = app.getURL();

        Assert.assertEquals(url, app.baseUrl + "inventory.html");
    }

    @Test()
    public void LogOutTest() {
        app.getMainPage().LogOut();

        String url = app.getURL();

        Assert.assertEquals(url, app.baseUrl);
    }

    @Test()
    public void addItemToCartFromMainPageTest() {
        CartPage cartPage;

        app.getMainPage().addToCart();

        cartPage = app.openCart();

        int carItemsCount = cartPage.getCartItems().size();

        Assert.assertEquals(carItemsCount, 1);
    }

    @Test()
    public void addItemToCartFromItemPageTest() {
        app.getMainPage().openItem(0);

        app.getItemPage().addToCart();

        app.openCart();

        int carItemsCount = app.getCartPage().getCartItems().size();

        Assert.assertEquals(carItemsCount, 1);
    }

    @Test()
    public void removeItemFromCartTest() {
        CartPage cartPage;

        app.getMainPage().addToCart();

        cartPage = app.openCart();

        int itemsCountBefore = cartPage.getCartItems().size();

        app.getCartPage().removeItem();

        app.refresh();

        int itemsCountAfter = cartPage.getCartItems().size();

        Assert.assertEquals(itemsCountAfter, itemsCountBefore - 1);
    }

    @Test()
    public void paceOrderTest() {
        app.getMainPage().addToCart();

        app.openCart();

        app.getCartPage().checkout();

        app.getCheckoutPage().fillCheckOutForm("Name",
                "LastName", "zip");

        String title = app.getCheckoutPage().getTitle();

        Assert.assertEquals(title, "THANK YOU FOR YOUR ORDER");
    }
}
