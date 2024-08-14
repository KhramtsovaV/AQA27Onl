package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private final By CHAPTER_NAME_LOCATOR = By.xpath("//*[text()='Your Cart']");
    private final By QUANTITY_LABEL_LOCATOR = By.className("cart_quantity_label");
    private final By DESCRIPTION_LABEL_LOCATOR = By.className("cart-desc-label");
    private final By ITEM_QUANTITY_LABEL_LOCATOR = By.className("cart_quantity");
    private final By ITEM_DESCRIPTION_LABEL_LOCATOR = By.className("cart_item_label");
    private final By ITEM_REMOVE_BUTTON_LOCATOR = By.xpath("//*[text()='Remove']");
    private final By CONTINUE_SHOPPING_BUTTON_LOCATOR = By.id("continue-shopping");
    private final By CHECKOUT_BUTTON_LOCATOR = By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHAPTER_NAME_LOCATOR;
    }

    public WebElement getChapterName() {
        return driver.findElement(CHAPTER_NAME_LOCATOR);
    }

    public WebElement getQuantityLabel() {
        return driver.findElement(QUANTITY_LABEL_LOCATOR);
    }

    public WebElement getDescriptionLabel() {
        return driver.findElement(DESCRIPTION_LABEL_LOCATOR);
    }

    public WebElement getItemQuantityLabel() {
        return driver.findElement(ITEM_QUANTITY_LABEL_LOCATOR);
    }

    public WebElement getItemDescription() {
        return driver.findElement(ITEM_DESCRIPTION_LABEL_LOCATOR);
    }

    public WebElement getItemRemove() {
        return driver.findElement(ITEM_REMOVE_BUTTON_LOCATOR);
    }

    public WebElement getContinueShoppingButton() {
        return driver.findElement(CONTINUE_SHOPPING_BUTTON_LOCATOR);
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(CHECKOUT_BUTTON_LOCATOR);
    }

    public void checkoutButtonClick() {
        getCheckoutButton().click();
    }
}
