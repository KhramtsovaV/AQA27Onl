package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {

    @Test
    public void successOrder() {
        loginStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        orderSteps.beginningOfOrdering();
        orderSteps.correctCustomerInformation();
        orderSteps.checkoutOverview();
        orderSteps.orderEnds();
    }
}
