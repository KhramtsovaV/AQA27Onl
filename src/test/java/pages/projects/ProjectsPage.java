package pages.projects;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectsPage extends BasePage {

    private final By PROJECTS_PAGE_LOCATOR = By.cssSelector("[data-testid='testCaseContentHeaderTitle']");
    public ProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return PROJECTS_PAGE_LOCATOR;
    }

    public boolean isProjectCreated(){
        return driver.findElement(By.cssSelector("[class='message message-success']")).isDisplayed();
    }
}