package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pageobjects.CartPage;
import ui.pageobjects.MainPage;

public class AddItemTest extends TestBase {

    @Test()
    public void addItemToCartFromMainPageTest() {
        CartPage cartPage = new CartPage(driver);

        new MainPage(driver).addToCart();

        new MainPage(driver).cartButton.click();

        int carItemsCount = cartPage.getCartItems().size();

        Assert.assertEquals(carItemsCount, 1);
    }
}
