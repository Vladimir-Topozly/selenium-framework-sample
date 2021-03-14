package utils.ui;

import manager.DriversManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.BrowserType;
import ui.steps.LogIn;

public class HelperBase {

    public DriversManager driversManager =
            new DriversManager(System.getProperty("browser", BrowserType.FIREFOX));

    public void start(String url) {
        driversManager.startDriver();
        openSite(url);
        new LogIn().doLogin(driversManager.driver);
    }

    public void stop() {
        driversManager.stopDriver();
    }

    private void openSite(String url) {
        driversManager.driver.get(url);
    }

    public String getURL() {
        return driversManager.driver.getCurrentUrl();
    }

    public void refresh() {
        driversManager.driver.navigate().refresh();
    }

    public void cleanUp() {
        driversManager.driver.manage().deleteAllCookies();
    }

    public void acceptAlert() {
        driversManager.driver.switchTo().alert().accept();
    }

    public boolean isElementPresent(By by) {
        try {
            driversManager.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}


