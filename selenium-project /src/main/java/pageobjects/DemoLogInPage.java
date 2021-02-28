package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoLogInPage extends PageBase {
    @FindBy(id = "user-name")
    private WebElement userNameTextBox;

    @FindBy(css = "#password")
    private WebElement userPasswordTextBox;

    @FindBy(css = "#login-button")
    private WebElement logInButton;

    public DemoLogInPage(WebDriver driver) {
        super(driver);
    }

    public void LogIn(String name, String pass) {
        this.userNameTextBox.sendKeys(name);
        this.userPasswordTextBox.sendKeys(pass);
        this.logInButton.click();
    }


}
