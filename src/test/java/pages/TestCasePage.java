package pages;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasePage extends BasePage {

    private final By ADD_TEST_CASE_LOCATOR =By.id("sidebar-cases-add");

    public TestCasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_TEST_CASE_LOCATOR;
    }

    public Button getAddTestCase() {
        return new Button(driver, ADD_TEST_CASE_LOCATOR);
    }

    public void clickAddTestCase(){
        getAddTestCase().click();
    }
}
