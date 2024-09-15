package steps;

import baseEntities.BaseStep;
import configuration.ReadProperties;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.AddTestCasePage;
import pages.TestCasePage;
import pages.projects.EditProjectPage;

public class UserStep extends BaseStep {

    public UserStep(WebDriver driver) {
        super(driver);
    }

    @Step
    public DashboardPage successfulLogin(String username, String password) {
        login(username, password);

        return dashboardPage;
    }

    public DashboardPage successfulLogin() {
        loginFull();

        return dashboardPage;
    }

    @Step
    public LoginPage incorrectLogin(String username, String password) {
        login(username, password);

        return loginPage;
    }

    private void login(String username, String password) {
        loginPage.setEmailValue(username);
        loginPage.setPasswordValue(password);
        loginPage.clickLogin();
    }

    private void loginFull() {
        loginPage.setEmailValue(ReadProperties.username());
        loginPage.setPasswordValue(ReadProperties.password());
        loginPage.clickLogin();
    }

    private void openEditProject() {
        dashboardPage.clickEdit();
    }

    public EditProjectPage openEditProjectPage() {
        openEditProject();

        return editProjectPage;
    }

    public void clickCheckBox() {
        editProjectPage.clickCheckBox();
    }

    public void removeCheckBox() {
        editProjectPage.removeCheckBox();
    }

    public TestCasePage transitionInTestCasePage () {
        openTestCases();
        return testCasePage;
    }

    private void openTestCases() {
        dashboardPage.clickTestCases();
    }

    public AddTestCasePage addTestCase() {
        testCasePage.clickAddTestCase();
        return addTestCasePage;
    }

    public void selectTypeDropDownByIndex(int index) {
        addTestCasePage.getTypeDropDown().selectByIndex(index);
    }

    public void selectTypeDropDownByText(String text) {
        addTestCasePage.getTypeDropDown().selectByText(text);
    }


}