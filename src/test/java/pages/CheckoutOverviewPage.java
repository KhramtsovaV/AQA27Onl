package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage extends BasePage {

    private final By CHAPTER_NAME_LOCATOR = By.xpath("//*[text()='Checkout: Overview']");
    private final By ITEM_QUANTITY_LABEL_LOCATOR = By.className("cart_quantity");
    private final By ITEM_DESCRIPTION_LABEL_LOCATOR = By.className("cart_item_label");
    private final By PAYMENT_INFO_LOCATOR = By.cssSelector("[data-test='payment-info-label']");
    private final By PAYMENT_VALUE_LOCATOR = By.cssSelector("[data-test='payment-info-value']");
    private final By SHIPPING_INFO_LOCATOR = By.cssSelector("[data-test='shipping-info-label']");
    private final By SHIPPING_VALUE_LOCATOR = By.cssSelector("[data-test='shipping-info-value']");
    private final By TOTAL_INFO_LOCATOR = By.cssSelector("[data-test='total-info-label']");
    private final By SUBTOTAL_INFO_LOCATOR = By.cssSelector("[data-test='subtotal-label']");
    private final By TAX_INFO_LOCATOR = By.cssSelector("[data-test='tax-label']");
    private final By TOTAL_LOCATOR = By.cssSelector("[data-test='total-label']");
    private final By CANCEL_BUTTON_LOCATOR = By.id("cancel");
    private final By FINISH_BUTTON_LOCATOR = By.id("finish");



    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHAPTER_NAME_LOCATOR;
    }
    public WebElement getCanselButton() {
        return driver.findElement(CANCEL_BUTTON_LOCATOR);
    }
    public WebElement getFinishButton() {
        return driver.findElement(FINISH_BUTTON_LOCATOR);
    }


    public void clickCanselButton(){
        getCanselButton().click();
    }
    public void clickFinishButton(){
        getFinishButton().click();
    }
}
