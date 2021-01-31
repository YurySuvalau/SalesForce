package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::*[@class='slds-form-element__control']//input";
    String selectOption = "//*[contains(text(),'%s')]/ancestor::*[contains(@role,'listbox')]";

    public Search(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(String.format(selectOption, option))).click();
    }
}



