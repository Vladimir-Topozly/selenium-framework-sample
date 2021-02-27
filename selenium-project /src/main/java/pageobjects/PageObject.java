package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}