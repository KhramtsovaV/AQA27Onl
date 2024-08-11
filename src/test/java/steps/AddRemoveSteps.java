package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ProductPage;

public class AddRemoveSteps extends BaseStep {

    public AddRemoveSteps(WebDriver driver) {
        super(driver);
    }

    public ProductPage addToCart() {
        toCart();
        return productPage;
    }
    public ProductPage removeFromCart() {
        fromCart();
        return productPage;
    }

    private void toCart() {
        AddRemoveSteps addRemoveStep = new AddRemoveSteps(driver);
        productPage.addButtonBackpackClick();
        productPage.addButtonBikeClick();
    }
    private void fromCart() {
        AddRemoveSteps addRemoveStep = new AddRemoveSteps(driver);
        productPage.removeButtonBikeClick();
        productPage.removeButtonBackpackClick();
    }
    public void cartBadgeDisplayed() {
        productPage.getBadgeCart().isDisplayed();
    }

}


