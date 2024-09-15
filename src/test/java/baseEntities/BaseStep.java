package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.*;
import pages.projects.EditProjectPage;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected TopMenuPage topMenuPage;
    protected AddTestCasePage addTestCasePage;
    protected DashboardPage dashboardPage;
    protected TestCasePage testCasePage;
    protected EditProjectPage editProjectPage;


    public BaseStep(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        topMenuPage = new TopMenuPage(driver);
        addTestCasePage = new AddTestCasePage(driver);
        dashboardPage = new DashboardPage(driver);
        testCasePage = new TestCasePage(driver);
        editProjectPage = new EditProjectPage(driver);
    }
}
