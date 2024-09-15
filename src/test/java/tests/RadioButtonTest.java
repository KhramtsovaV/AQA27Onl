package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import pages.projects.AddProjectPage;

public class RadioButtonTest extends BaseTest {

    @Test
    public void radioButtonTest() throws InterruptedException {
        userStep.successfulLogin();

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl();

        addProjectPage.getProjectTypeRadioButton().selectByText("Use multiple test suites to manage cases");
        Thread.sleep(2000);
        addProjectPage.getProjectTypeRadioButton().selectByValue("3");
        Thread.sleep(2000);
        addProjectPage.getProjectTypeRadioButton().selectByIndex(2);
    }
}