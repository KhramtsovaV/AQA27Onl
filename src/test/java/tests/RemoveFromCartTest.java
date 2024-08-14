package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveFromCartTest extends BaseTest {

    @Step("Test of successful remove item to cart")
    @Description("Test the successful remove item to cart functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Success remove item Test")
    public void removeFromCart() {
        Assert.assertTrue(loginStep.successfulLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        addRemoveStep.addToCart();
        addRemoveStep.cartBadgeDisplayed();
        addRemoveStep.removeFromCart();
    }
}
