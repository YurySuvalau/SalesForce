package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.*;
import tests_data.TestData;

import java.util.concurrent.TimeUnit;

public class BaseTest implements TestData {
    WebDriver driver;
    LoginPage loginPage;
    AccountListPage accountListPage;
    NewAccountModal newAccountModal;
    HomePage homePage;
    ContactsListPage contactsListPagePage;
    NewContactsModal newContactsModal;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        pageInit();
    }

    public void pageInit() {
        loginPage = new LoginPage(driver);
        accountListPage = new AccountListPage(driver);
        newAccountModal = new NewAccountModal(driver);
        homePage = new HomePage(driver);
        newContactsModal = new NewContactsModal(driver);
        contactsListPagePage = new ContactsListPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void driverQuit() {
        driver.quit();
    }
}

