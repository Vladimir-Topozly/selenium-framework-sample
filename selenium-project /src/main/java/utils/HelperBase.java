package utils;

import manager.DriversManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import ui.steps.LogIn;

public class HelperBase {

    public DriversManager driversManager = new DriversManager();

//    public HelperBase(WebDriver driver) {
//        driver = driversManager.driver;
//    }

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

    public void stop() {
        driversManager.stopDriver();
    }

    public void start(String url) {
        driversManager.startDriver();
        navigateTo(url);
        new LogIn().doLogin(driversManager.driver);
    }

    void navigateTo(String url) {
        driversManager.driver.get(url);
    }

    public void refresh() {
        driversManager.driver.navigate().refresh();
    }

    public void cleanUp() {
        driversManager.driver.manage().deleteAllCookies();
    }

    public String getURL() {
        return driversManager.driver.getCurrentUrl();
    }
}


