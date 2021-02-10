package pageobjects;

import application_manager.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;

public class PageObject extends TestBase {

    PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}