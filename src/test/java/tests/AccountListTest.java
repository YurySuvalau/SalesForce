package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountListTest extends BaseTest {

    @Test
    public void createAccount() {
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);
        homePage.waitForPageOpened();
        homePage.openAccountPage();
        accountListPage.waitForPageOpened();
        accountListPage.clickNewButton();
        newAccountModal.waitForPageOpened();
        newAccountModal.create(account);
        newAccountModal.clickOnCopyToShippingCheckbox();
        newAccountModal.clickSaveButton();
        accountListPage.waitForPageOpened();
        Assert.assertTrue(accountListPage.isAccountNameDisplayed());
    }
}

