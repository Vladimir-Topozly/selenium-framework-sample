package ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ui.UIHelper;

public class TestBase {

    UIHelper uiHelper = new UIHelper();
    String baseUrl = "https://www.saucedemo.com/";
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        uiHelper.start(baseUrl);
        driver = uiHelper.driversManager.driver;
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        uiHelper.cleanUp();
        uiHelper.stop();
    }
}
