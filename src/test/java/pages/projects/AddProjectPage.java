package pages.projects;

import elements.Button;
import elements.CheckBox;
import elements.Input;
import elements.RadioButton;
import models.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProjectPage extends BaseProjectPage {
    private final static String pagePath = "/index.php?/admin/projects/add/1";
    private final By ADD_PROJECT_BUTTON_LOCATOR = By.id("accept");
    private final By PROJECT_TYPE_RADIO_BUTTON_LOCATOR = By.cssSelector("[name='suite_mode']");
    private final By CHECKBOX_SHOW_ANNOUNCEMENT_LOCATOR = By.id("show_announcement");
    private final By CHECKBOX_ENABLE_TEST_CASE_LOCATOR = By.name("case_statuses_enabled");
    private final By NAME_FIELD_LOCATOR =By.id("name");
    private final By ANNOUNCEMENT_FIELD_LOCATOR =By.id("announcement_display");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    public Button getAddProjectButton() {
        return new Button(driver, ADD_PROJECT_BUTTON_LOCATOR);
    }

    public RadioButton getProjectTypeRadioButton() {
        return new RadioButton(driver, PROJECT_TYPE_RADIO_BUTTON_LOCATOR);
    }

    public CheckBox getShowAnnouncementCheckBox() {
        return new CheckBox(driver, CHECKBOX_SHOW_ANNOUNCEMENT_LOCATOR);
    }

    public CheckBox getEnableTestCaseCheckBox() {
        return new CheckBox(driver, CHECKBOX_ENABLE_TEST_CASE_LOCATOR);
    }

    public Input getProjectNameInput() {
        return new Input(driver, NAME_FIELD_LOCATOR);
    }

    public Input getAnnouncementInput() {
        return new Input(driver, ANNOUNCEMENT_FIELD_LOCATOR);
    }


    public AddProjectPage addProjectName(String name) {
        getProjectNameInput().write(name);
        return new AddProjectPage(driver);
    }

    public AddProjectPage addProjectAnnouncement(String text) {
        getAnnouncementInput().write(text);
        return new AddProjectPage(driver);
    }

    public AddProjectPage setShowAnnouncement(Boolean flag) {
        if(flag == true) {
            getShowAnnouncementCheckBox().setCheckBox(true);
        }
        return new AddProjectPage(driver);
    }

    public AddProjectPage setProjectType(int projectType) {
        getProjectTypeRadioButton().selectByIndex(projectType);
        return new AddProjectPage(driver);
    }

    public AddProjectPage setEnableTestCase(Boolean flag) {
        if(flag==true) {
            getEnableTestCaseCheckBox().setCheckBox(true);
        }
        return new AddProjectPage(driver);
    }
    public AddProjectPage addProject(Project project) {
        addProjectName(project.getName());
        addProjectAnnouncement(project.getAnnouncement());
        setShowAnnouncement(project.isShowAnnouncement());
        setProjectType(project.getProjectType());
        setEnableTestCase(project.isEnableTCApprovals());
        return new AddProjectPage(driver);
    }

    public void createProject() {
        getAddProjectButton().click();
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }


}
