package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends PageBase {
    @FindBy(css = ".cart_list")
    public WebElement cartList;

    @FindBy(css = "div.cart_item")
    private WebElement cartItem;

    @FindBy(css = ".btn_secondary.cart_button")
    private WebElement removeCartItemButton;

    @FindBy(css = ".btn_action.checkout_button")
    private WebElement checkoutButton;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getCartItems() {
        List<WebElement> cartItems = new ArrayList<>();
        cartItems.add(this.cartItem);

        return cartItems;
    }

    public void removeItem() {
        this.removeCartItemButton.click();
    }

    public void checkout() {
        this.checkoutButton.click();
    }
}
