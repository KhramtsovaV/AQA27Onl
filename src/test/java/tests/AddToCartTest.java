package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    private void successAddToCart() {
        Assert.assertTrue(loginStep.successfulLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        addRemoveStep.addToCart();
        addRemoveStep.cartBadgeDisplayed();
    }
}