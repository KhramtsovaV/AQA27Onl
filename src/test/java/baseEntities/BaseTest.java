package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import services.WaitsService;

import java.time.Duration;


public class BaseTest {

    protected WebDriver driver;
    protected Actions actions;
    protected WaitsService waitsService;


    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        actions = new Actions(driver);
        waitsService = new WaitsService(driver);
        driver.get(ReadProperties.getUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
