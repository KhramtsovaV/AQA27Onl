package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Step("Test of successful add item to cart")
    @Description("Test the successful add item to cart functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Success add item Test")
    private void successAddToCart() {
        Assert.assertTrue(loginStep.successfulLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        addRemoveStep.addToCart();
        addRemoveStep.cartBadgeDisplayed();
    }
}