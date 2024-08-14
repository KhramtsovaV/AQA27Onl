package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {

    @Step("Test of successful order")
    @Description("Test the successful order functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Success Order Test")
    public void successOrder() {
        loginStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        orderSteps.beginningOfOrdering();
        orderSteps.correctCustomerInformation();
        orderSteps.checkoutOverview();
        orderSteps.orderEnds();
    }
}
