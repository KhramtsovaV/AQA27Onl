package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePage;
import pages.CheckoutCustomerInformationPage;
import pages.CheckoutOverviewPage;
import pages.ProductPage;

public class OrderSteps extends BaseStep {

    public OrderSteps(WebDriver driver) {
        super(driver);
    }

    public CheckoutCustomerInformationPage beginningOfOrdering() {
        productPage.addButtonBackpackClick();
        productPage.addButtonBikeClick();
        productPage.cartClick();
        cartPage.checkoutButtonClick();
        return checkoutCustomerInformationPage;
    }

    public CheckoutOverviewPage correctCustomerInformation() {
        checkoutCustomerInformationPage.setFirstNameValue("Lera");
        checkoutCustomerInformationPage.setLastNameValue("Khramtsova");
        checkoutCustomerInformationPage.setZipInputValue("123-fhgf");
        checkoutCustomerInformationPage.continueButtonClick();
        return checkoutOverviewPage;
    }

    public CheckoutCompletePage checkoutOverview() {
        checkoutOverviewPage.clickFinishButton();
        return checkoutCompletePage;
    }
    public ProductPage orderEnds() {
        checkoutCompletePage.backButtonClick();
        return productPage;
    }
}
