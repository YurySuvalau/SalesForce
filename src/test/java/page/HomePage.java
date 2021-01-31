package page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By ACCOUNT_BUTTON = By.xpath("//*[contains(text(),'Accounts')]/ancestor::a[contains(@title,'Accounts')]//span");
    By CONTACTS_BUTTON = By.xpath("//*[contains(text(),'Contacts')]/ancestor::a[contains(@title,'Contacts')]//span");

    @Override
    public void waitForPageOpened() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(ACCOUNT_BUTTON));
        } catch (TimeoutException exception) {
            Assert.fail(String.format("Home page it's not loaded! Locator: '%s' was not found!", ACCOUNT_BUTTON));
        }
    }

    public void openPage() {
        driver.get(URL_LOGIN + URL_HOME_PAGE);
    }
}
