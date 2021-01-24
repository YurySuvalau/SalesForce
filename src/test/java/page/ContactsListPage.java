package page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static tests_data.TestData.account;
import static tests_data.TestData.contacts;

public class ContactsListPage extends BasePage {

    public ContactsListPage(WebDriver driver) {
        super(driver);
    }

    By NEW_CONTACT_BUTTON = By.cssSelector("[title=New]");
    String NAME_CONTACT = contacts.getFirstName().split(" ")[0];
    By TITLE_NAME = By.cssSelector("[title~="+NAME_CONTACT+"]");

    @Override
    public ContactsListPage waitForPageOpened() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(NEW_CONTACT_BUTTON));
        } catch (TimeoutException exception) {
            Assert.fail(String.format("Home page it's not loaded! Locator: '%s' was not found!", NEW_CONTACT_BUTTON));
        }
        return this;
    }

    public void openPage() {
        openPage(URL_LOGIN+URL_CONTACTS_PAGE);
    }

    public void clickOnNewContactButton() {
        driver.findElement(NEW_CONTACT_BUTTON).click();
    }

    public boolean isContactNameDisplayed() {
        String label = driver.findElement(TITLE_NAME).getText();
        if (label.contains(NAME_CONTACT)) {
            return true;
        }
        return false;
    }
}
