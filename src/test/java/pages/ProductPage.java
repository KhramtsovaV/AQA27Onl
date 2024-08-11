package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductPage extends BasePage {
    private final By CHAPTER_NAME_LOCATOR = By.xpath("//*[text()='Products']");
    private final By ADD_TO_CART_BACKPACK_LOCATOR = By.id("add-to-cart-sauce-labs-backpack");
    private final By REMOVE_FROM_CART_BACKPACK_LOCATOR = By.id("remove-sauce-labs-backpack");
    private final By ADD_TO_CART_BIKE_LOCATOR = By.id("add-to-cart-sauce-labs-bike-light");
    private final By REMOVE_FROM_CART_BIKE_LOCATOR = By.id("remove-sauce-labs-bike-light");
    private final By CART_LOCATOR = By.className("shopping_cart_link");
    private final By CART_BADGE_LOCATOR = By.className("shopping_cart_badge");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHAPTER_NAME_LOCATOR;
    }

    public WebElement getAddButtonBackpack() {
        return driver.findElement(ADD_TO_CART_BACKPACK_LOCATOR);
    }
    public WebElement getRemoveButtonBackpack() {
        return driver.findElement(REMOVE_FROM_CART_BACKPACK_LOCATOR);
    }
    public WebElement getAddButtonBike() {
        return driver.findElement(ADD_TO_CART_BIKE_LOCATOR);
    }
    public WebElement getRemoveButtonBike() {
        return driver.findElement(REMOVE_FROM_CART_BIKE_LOCATOR);
    }
    public WebElement getCart() {
        return driver.findElement(CART_LOCATOR);
    }
    public WebElement getBadgeCart() {
        return driver.findElement(CART_BADGE_LOCATOR);
    }

    public void addButtonBackpackClick() {
        getAddButtonBackpack().click();
    }
    public void removeButtonBackpackClick() {
        getRemoveButtonBackpack().click();
    }
    public void addButtonBikeClick() {
        getAddButtonBike().click();
    }
    public void removeButtonBikeClick() {
        getRemoveButtonBike().click();
    }
    public void cartClick() {
        getCart().click();
    }
}
