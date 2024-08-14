package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage extends BasePage {

    private final By CHAPTER_NAME_LOCATOR = By.xpath("//*[text()='Checkout: Complete!']");
    private final By COMPLETE_HEADER_LOCATOR = By.cssSelector("[data-test='complete-header']");
    private final By COMPLETE_TEXT_LOCATOR = By.cssSelector("[data-test='complete-text']");
    private final By BACK_BUTTON_LOCATOR = By.id("back-to-products");

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHAPTER_NAME_LOCATOR;
    }

    public WebElement getBackButton() {
        return driver.findElement(BACK_BUTTON_LOCATOR);
    }

    public void backButtonClick() {
        getBackButton().click();
    }
}
