package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pageobjects.CartPage;
import ui.pageobjects.MainPage;
import utils.UIHelper;

public class RemoveItemTest extends TestBase {
    @Test()
    public void removeItemFromCartTest() {
        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = new CartPage(driver);

        mainPage.addToCart();

        mainPage.openCart();

        int itemsCountBefore = cartPage.getCartItems().size();

        cartPage.removeItem();

        new UIHelper().refresh();

        int itemsCountAfter = cartPage.getCartItems().size();

        Assert.assertEquals(itemsCountAfter, itemsCountBefore - 1);
    }
}
