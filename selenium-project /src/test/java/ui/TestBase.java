package ui;

import application_manager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    static ApplicationManager app =
            new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        app.start();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        app.cleanUp();
        app.stop();
    }
}
