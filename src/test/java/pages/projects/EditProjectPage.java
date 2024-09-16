package pages.projects;

import baseEntities.BasePage;
import elements.CheckBox;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProjectPage extends BaseProjectPage {
    private final By EDIT_PROJECT_BUTTON_LOCATOR = By.id("accept");
    private final By COMPLETE_PROJECT_CHECKBOX_LOCATOR = By.id("is_completed");
    private final By CHECKBOX_ANNOUNCEMENT_LOCATOR = By.id("show_announcement");
    private final By PROJECT_TYPE_RADIOBUTTON_LOCATOR = By.cssSelector("[name='suite_mode']");

    public EditProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHECKBOX_ANNOUNCEMENT_LOCATOR;
    }

    public CheckBox getCheckBoxButton() {
        return new CheckBox (driver,CHECKBOX_ANNOUNCEMENT_LOCATOR);
    }

    public void clickCheckBox() {
        getCheckBoxButton().setCheckBox(true);
    }

    public void removeCheckBox() {
        getCheckBoxButton().setCheckBox(false);
    }

    public RadioButton getProjectTypeRadioButton() {
        return new RadioButton(driver, PROJECT_TYPE_RADIOBUTTON_LOCATOR);
    }
}
