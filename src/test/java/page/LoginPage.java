package page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By LOGIN_BUTTON_CSS = By.cssSelector("[id=Login]");

    @Override
    public void waitForPageOpened() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON_CSS));
        } catch (TimeoutException exception) {
            Assert.fail(String.format("Home page it's not loaded! Locator: '%s' was not found!", LOGIN_BUTTON_CSS));
        }
    }

    public void openPage() {
        driver.get(URL_LOGIN);
    }

    public void login(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
    }
}
