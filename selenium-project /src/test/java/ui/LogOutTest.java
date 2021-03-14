package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pageobjects.MainPage;

public class LogOutTest extends TestBase {

    @Test()
    public void LogOut() {
        MainPage mainPage = new MainPage(driver);

        mainPage.LogOut();

        String url = uiHelper.getURL();

        Assert.assertEquals(url, baseUrl);
    }
}
