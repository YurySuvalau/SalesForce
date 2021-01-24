package page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static tests_data.TestData.account;

public class AccountListPage extends BasePage {
    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    By NEW_BUTTON = By.cssSelector("[title=New]");
    String NAME_ACCOUNT = account.getAccountName().split(" ")[0];
    By TITLE_NAME = By.cssSelector("[title~=" + NAME_ACCOUNT + "]");

    @Override
    public AccountListPage waitForPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
        } catch (TimeoutException exception) {
            Assert.fail(String.format("Cart Page page it's not loaded! Locator: '%s' was not found!", NEW_BUTTON));
        }
        return this;
    }

    public void openPage() {
        openPage(URL_LOGIN + URL_ACCOUNT_LIST);
    }

    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }

    public boolean isAccountNameDisplayed() {
        String label = driver.findElement(TITLE_NAME).getText();
        if (label.contains(NAME_ACCOUNT)) {
            return true;
        }
        return false;
    }
}
