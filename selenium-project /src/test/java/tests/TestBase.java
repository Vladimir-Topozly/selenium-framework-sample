package tests;

import application_manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    private static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite(alwaysRun = true)    // annotation for TestNG framework
    public void setUp() {
        app.start();

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        app.cleanUp();
        app.stop();
    }

}
