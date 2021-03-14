package ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement zipCodeInput;

    @FindBy(css = ".btn_primary.cart_button")
    private WebElement contimueButton;

    @FindBy(css = ".btn_action")
    private WebElement finishButton;

    @FindBy(css = ".complete-header")
    private WebElement header;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void fillCheckOutForm(String name, String lasName, String zipCode) {
        this.firstNameInput.sendKeys(name);
        this.lastNameInput.sendKeys(lasName);
        this.zipCodeInput.sendKeys(zipCode);
        this.contimueButton.click();
        this.finishButton.click();
    }

    public String getTitle() {
        return this.header.getText();
    }
}
