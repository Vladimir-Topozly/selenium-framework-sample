package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pageobjects.CartPage;
import ui.pageobjects.ItemPage;
import ui.pageobjects.MainPage;

public class AddItemToCartFromItemPageTest extends TestBase {
    @Test()
    public void addItemToCartFromItemPage() {
        MainPage mainPage = new MainPage(driver);
        ItemPage itemPage = new ItemPage(driver);
        CartPage cartPage = new CartPage(driver);

        mainPage.openItem(0);

        itemPage.addToCart();

        mainPage.openCart();

        int carItemsCount = cartPage.getCartItems().size();

        Assert.assertEquals(carItemsCount, 1);
    }
}
