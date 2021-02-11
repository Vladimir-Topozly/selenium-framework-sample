package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends PageBase implements IItem{

    @FindBy(css = ".btn_primary.btn_inventory")
    private WebElement addToCartButton;

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addToCart() {
        this.addToCartButton.click();
    }
}
