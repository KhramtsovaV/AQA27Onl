package baseEntities;

import com.github.javafaker.Faker;
import configuration.ReadProperties;
import models.Project;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.DashboardPage;
import pages.projects.ProjectsPage;
import services.BrowsersService;
import steps.UserStep;

import java.util.Random;

public class BaseTest {

    protected WebDriver driver;
    protected UserStep userStep;
    protected ProjectsPage projectsPage;
    protected Project project;
    protected Faker faker;
    protected Random random;
    protected DashboardPage dashboardPage;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();

        userStep = new UserStep(driver);

        projectsPage = new ProjectsPage(driver);
        dashboardPage = new DashboardPage(driver);

        faker = new Faker();
        random = new Random();
        project = new Project();

        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
