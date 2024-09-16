package pages;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.projects.AddProjectPage;

public class DashboardPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard";

    private final By ADD_PROJECT_BUTTON_LOCATOR = By.id("sidebar-projects-add");

    private final By TRANSITION_EXPORTS_BUTTON = By.id("navigation-data-management-exports");

    private final By TESTCASES_PAGE_LOCATOR = By.xpath("//a[@class='link' and text()='Test Cases']");

    public TopMenuPage topMenuPage;

    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public Button getEditButton() {
        return new Button(driver, ADD_PROJECT_BUTTON_LOCATOR);
    }

    public Button getExportsButton() {
        return new Button(driver, TRANSITION_EXPORTS_BUTTON);
    }

    public void clickExports() {
        getExportsButton().click();
    }

    public void clickEdit() {
        getEditButton().click();
    }

    public Button getTestCases() {
        return new Button(driver, TESTCASES_PAGE_LOCATOR);
    }

    public void clickTestCases() {
        getTestCases().click();
    }
    public AddProjectPage clickAddProjectButton() {
        getEditButton().click();
        return new AddProjectPage(driver);
    }
}
