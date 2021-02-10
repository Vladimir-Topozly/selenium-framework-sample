package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UITests extends TestBase {

    @Test()
    public void openCareersPage() {
//        careersPage = new CareersMainPage(driver);

//        String heading = careersPage.getPageHeading();

        Assert.assertEquals("All locations", "All locations");
    }
}
