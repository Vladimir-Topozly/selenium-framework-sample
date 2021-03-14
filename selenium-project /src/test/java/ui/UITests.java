package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pageobjects.CartPage;
import ui.pageobjects.CheckoutPage;
import ui.pageobjects.ItemPage;
import ui.pageobjects.MainPage;
import utils.UIHelper;

public class UITests extends TestBase {

//    @Test()
//    public void addItemToCartFromItemPageTest() {
//        MainPage mainPage = new MainPage(uiHelper.driver);
//        ItemPage itemPage = new ItemPage(uiHelper.driver);
//        CartPage cartPage = new CartPage(uiHelper.driver);
//
//
//        mainPage.openItem(0);
//
//        itemPage.addToCart();
//
//        mainPage.openCart();
//
//        int carItemsCount = cartPage.getCartItems().size();
//
//        Assert.assertEquals(carItemsCount, 1);
//    }

//    @Test()
//    public void removeItemFromCartTest() {
//        MainPage mainPage = new MainPage(uiHelper.driver);
//        CartPage cartPage = new CartPage(uiHelper.driver);
//
//        mainPage.addToCart();
//
//        mainPage.openCart();
//
//        int itemsCountBefore = cartPage.getCartItems().size();
//
//        cartPage.removeItem();
//
//        new UIHelper().refresh();
//
//        int itemsCountAfter = cartPage.getCartItems().size();
//
//        Assert.assertEquals(itemsCountAfter, itemsCountBefore - 1);
//    }

//    @Test()
//    public void paceOrderTest() {
//        MainPage mainPage = new MainPage(uiHelper.driver);
//        CartPage cartPage = new CartPage(uiHelper.driver);
//        CheckoutPage checkoutPage = new CheckoutPage(uiHelper.driver);
//        mainPage.addToCart();
//
//        mainPage.openCart();
//
//        cartPage.checkout();
//
//        checkoutPage.fillCheckOutForm("Name",
//                "LastName", "zip");
//
//        String title = checkoutPage.getTitle();
//
//        Assert.assertEquals(title, "THANK YOU FOR YOUR ORDER");
//    }
}
