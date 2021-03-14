package ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends PageBase implements IItem {
    @FindBy(css = ".bm-burger-button")
    private WebElement burgerButton;

    @FindBy(css = ".shopping_cart_link")
    public WebElement cartButton;

    @FindBy(css = "#logout_sidebar_link")
    private WebElement logoutButton;

    @FindBy(css = ".btn_primary.btn_inventory")
    private WebElement addToCartButton;

    @FindBy(css = ".inventory_list")
    private WebElement inventoryItemsList;

    @FindBy(css = ".inventory_list > div")
    private WebElement inventoryItem;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void LogOut() {
        this.burgerButton.click();
        this.logoutButton.click();
    }

    @Override
    public void addToCart() {
        this.addToCartButton.click();
    }

    public void openItem(int itemIndex) {
        if (this.inventoryItemsList.isEnabled()) {

            List<WebElement> inventoryItems = new ArrayList<>();
            inventoryItems.add(this.inventoryItem);
            inventoryItems.get(itemIndex).click();
        }
    }

    public void openCart(){
        this.cartButton.click();
    }
}
