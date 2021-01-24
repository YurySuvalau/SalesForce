package page;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;

public class NewAccountModal extends BasePage {
    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    By MODEL_PAGE_LABEL = By.xpath("//h2[contains(text(), 'New Account')]");
    By COPY_TO_SHIPPING_CHECKBOX = By.xpath("//*[contains(text(), 'Copy Billing')]/ancestor::*/input");
    By SAVE_BUTTON = By.cssSelector("[title=Save]");

    @Override
    public NewAccountModal waitForPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(MODEL_PAGE_LABEL));
        } catch (TimeoutException exception) {
            Assert.fail(String.format("Account modal page it's not loaded! Locator: '%s' was not found!", MODEL_PAGE_LABEL));
        }
        return this;
    }

    public void create(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new DropDown(driver, "Type").select(account.getType());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new DropDown(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnual_revenue());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBilling_street());
        new Input(driver, "Billing City").write(account.getBilling_city());
        new Input(driver, "Billing State/Province").write(account.getBilling_state_province());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBilling_zip_postal_code());
        new Input(driver, "Billing Country").write(account.getBilling_country());
    }

    public void clickOnCopyToShippingCheckbox() {
        driver.findElement(COPY_TO_SHIPPING_CHECKBOX).click();
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
