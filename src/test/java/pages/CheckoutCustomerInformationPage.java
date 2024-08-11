package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCustomerInformationPage extends BasePage {

    private final By CHAPTER_NAME_LOCATOR = By.xpath("//*[text()='Checkout: Your Information']");
    private final By FIRST_NAME_INPUT_LOCATOR = By.id("first-name");
    private final By LAST_NAME_INPUT_LOCATOR = By.id("last-name");
    private final By ZIP_INPUT_LOCATOR = By.id("postal-code");
    private final By CANSEL_BUTTON_LOCATOR = By.id("cancel");
    private final By CONTINUE_BUTTON_LOCATOR = By.id("continue");

    public CheckoutCustomerInformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHAPTER_NAME_LOCATOR;
    }

    public WebElement getChapterName() {
        return driver.findElement(CHAPTER_NAME_LOCATOR);
    }
    public WebElement getFirstNameInput() {
        return driver.findElement(FIRST_NAME_INPUT_LOCATOR);
    }
    public WebElement getLastNameInput() {
        return driver.findElement(LAST_NAME_INPUT_LOCATOR);
    }
    public WebElement getZipInput() {
        return driver.findElement(ZIP_INPUT_LOCATOR);
    }
    public WebElement getCanselButton() {
        return driver.findElement(CANSEL_BUTTON_LOCATOR);
    }
    public WebElement getContinueButton() {
        return driver.findElement(CONTINUE_BUTTON_LOCATOR);
    }

    public void setFirstNameValue(String value) {
        getFirstNameInput().sendKeys(value);
    }
    public void setLastNameValue(String value) {
        getLastNameInput().sendKeys(value);
    }
    public void setZipInputValue(String value) {
        getZipInput().sendKeys(value);
    }

    public void continueButtonClick() {
        getContinueButton().click();
    }
}
