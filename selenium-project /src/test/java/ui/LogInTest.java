package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    @Test()
    public void SuccessfulLogInTest() {

        String url = uiHelper.getURL();

        Assert.assertEquals(url,baseUrl + "inventory.html");
    }
}
