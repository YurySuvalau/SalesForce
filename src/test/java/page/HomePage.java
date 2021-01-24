package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import javax.swing.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By ACCOUNT_BUTTON = By.xpath("//*[contains(text(),'Accounts')]/ancestor::a[contains(@title,'Accounts')]//span");
    By CONTACTS_BUTTON = By.xpath("//*[contains(text(),'Contacts')]/ancestor::a[contains(@title,'Contacts')]//span");

    @Override
    public HomePage waitForPageOpened() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(ACCOUNT_BUTTON));
        } catch (TimeoutException exception) {
            Assert.fail(String.format("Home page it's not loaded! Locator: '%s' was not found!", ACCOUNT_BUTTON));
        }
        return this;
    }

    public void openPage() {
        openPage(URL_LOGIN + URL_HOME_PAGE);
    }

    public void openAccountPage() {
        wait.until(ExpectedConditions.elementToBeClickable(ACCOUNT_BUTTON));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(ACCOUNT_BUTTON));
    }

    public void openContactsPage() {
        wait.until(ExpectedConditions.elementToBeClickable(CONTACTS_BUTTON));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(CONTACTS_BUTTON));
    }
}
