package ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ui.UIHelper;

import java.io.BufferedReader;
import java.util.Properties;

public class TestBase {

    UIHelper uiHelper = new UIHelper();
//    BufferedReader reader = new BufferedReader(Read)
    // TODO: Read file with BufferReader and only then get the property
//        String baseUrl = new Properties().getProperty("baseUrl");
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
