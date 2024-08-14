package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveFromCartTest extends BaseTest {

    @Test
    public void removeFromCart() {
        Assert.assertTrue(loginStep.successfulLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        addRemoveStep.addToCart();
        addRemoveStep.cartBadgeDisplayed();
        addRemoveStep.removeFromCart();
    }
}
