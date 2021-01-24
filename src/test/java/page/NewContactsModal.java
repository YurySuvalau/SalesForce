package page;

import elements.DropDown;
import elements.Input;
import elements.Search;
import elements.TextArea;
import objects.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class NewContactsModal extends BasePage {
    public NewContactsModal(WebDriver driver) {
        super(driver);
    }

    By SELECT = By.cssSelector("[class~=select]");
    By SAVE_BUTTON = By.xpath("//*[@class='button-container-inner slds-float_right']/button[3]");

    @Override
    public NewContactsModal waitForPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SELECT));
        } catch (TimeoutException exception) {
            Assert.fail(String.format("Account modal page it's not loaded! Locator: '%s' was not found!", SELECT));
        }
        return this;
    }

    public void create(Contacts contacts) {
        new DropDown(driver, "--None--").select(contacts.getSalutation());
        new Input(driver, "First Name").write(contacts.getFirstName());
        new Input(driver, "Last Name").write(contacts.getLastName());
        new Input(driver, "Phone").write(contacts.getPhone());
        new Input(driver, "Mobile").write(contacts.getMobile());
        new Search(driver, "Account Name").select(contacts.getAccountName());
        new Input(driver, "Email").write(contacts.getEmail());
        new Input(driver, "Title").write(contacts.getTitle());
        new Input(driver, "Reports To").write(contacts.getReportsTo());
        new TextArea(driver, "Mailing Street").write(contacts.getMailingStreet());
        new TextArea(driver, "Other Street").write(contacts.getOtherStreet());
        new Input(driver, "Mailing City").write(contacts.getMailingCity());
        new Input(driver, "Mailing State/Province").write(contacts.getMailingState());
        new Input(driver, "Other City").write(contacts.getMailingOtherCity());
        new Input(driver, "Other State/Province").write(contacts.getOtherState());
        new Input(driver, "Mailing Zip/Postal Code").write(contacts.getMailingZip());
        new Input(driver, "Mailing Country").write(contacts.getMailingCountry());
        new Input(driver, "Other Zip/Postal Code").write(contacts.getOtherZip());
        new Input(driver, "Other Country").write(contacts.getOtherCountry());
        new Input(driver, "Fax").write(contacts.getFax());
        new Input(driver, "Home Phone").write(contacts.getHomePhone());
        new Input(driver, "Department").write(contacts.getDepartment());
        new DropDown(driver, "Lead Source").select(contacts.getLeadRecourse());
        new Input(driver, "Other Phone").write(contacts.getOtherPhone());
        new Input(driver, "Birthdate").write(contacts.getBirthDate());
        new Input(driver, "Asst. Phone").write(contacts.getAsstPhone());
        new Input(driver, "Assistant").write(contacts.getAssistant());
        new TextArea(driver, "Description").write(contacts.getDescriptionInf());
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }
}

