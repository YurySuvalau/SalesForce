package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsListTest extends BaseTest {

    @Test
    public void createContacts() {
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);
        homePage.waitForPageOpened();
        homePage.openContactsPage();
        contactsListPagePage.waitForPageOpened();
        contactsListPagePage.clickOnNewContactButton();
        newContactsModal.waitForPageOpened();
        newContactsModal.create(contacts);
        newContactsModal.clickSaveButton();
        contactsListPagePage.waitForPageOpened();
        contactsListPagePage.openPage();
        contactsListPagePage.waitForPageOpened();
        Assert.assertTrue(contactsListPagePage.isContactNameDisplayed());
    }
}

