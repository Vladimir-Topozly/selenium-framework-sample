package ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
    // TODO: create another constructor for the URL navigation (receives String url as a parameter)

    PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    PageBase(WebDriver driver, String url) {
        PageFactory.initElements(driver, this);

        driver.get(url);
    }
}
