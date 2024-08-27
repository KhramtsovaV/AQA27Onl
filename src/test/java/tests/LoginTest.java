package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Step("Test of successful login")
    @Description("Test the successful login functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Success Login Test")
    public void successLoginTest() {
        Assert.assertTrue(loginStep.successfulLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
    }

    @Step("Test of successful login with other user 1")
    @Description("Test the successful login functionality with another user")
    @Severity(SeverityLevel.NORMAL)
    @Test(description = "Success Login Test for Other User 1")
    public void successLoginTestOtherUser1() {
        Assert.assertTrue(loginStep.successfulLogin("problem_user", ReadProperties.password()).isPageOpened());
    }

    @Step("Test of successful login with other user 2")
    @Description("Test the successful login functionality with another user")
    @Severity(SeverityLevel.NORMAL)
    @Test(description = "Success Login Test for Other User 2")
    public void successLoginTestOtherUser2() {
        Assert.assertTrue(loginStep.successfulLogin("performance_glitch_user", ReadProperties.password()).isPageOpened());
    }

    @Step("Test of incorrect username")
    @Description("Test the incorrect login functionality with invalid username")
    @Severity(SeverityLevel.MINOR)
    @Test(description = "Incorrect Username Test")
    public void incorrectUsername() {
        Assert.assertTrue(loginStep.incorrectLogin("gfkjhf", ReadProperties.password()).isPageOpened());
    }

    @Step("Test of incorrect password")
    @Description("Test the incorrect login functionality with invalid password")
    @Severity(SeverityLevel.MINOR)
    @Test(description = "Incorrect Password Test")
    public void incorrectPassword() {
        Assert.assertTrue(loginStep.incorrectLogin(ReadProperties.username(), "password123").isPageOpened());
    }

    @Step("Test of login without password")
    @Description("Test the incorrect login functionality without entering a password")
    @Severity(SeverityLevel.MINOR)
    @Test(description = "Login Without Password Test")
    public void withoutPassword() {
        Assert.assertTrue(loginStep.incorrectLogin(ReadProperties.username(), "").isPageOpened());
    }

    @Step("Test of login without username")
    @Description("Test the incorrect login functionality without entering a username")
    @Severity(SeverityLevel.MINOR)
    @Test(description = "Login Without Username Test")
    public void withoutUsername() {
        Assert.assertTrue(loginStep.incorrectLogin("", ReadProperties.password()).isPageOpened());
    }

    @Step("Test of login with no data")
    @Description("Test the incorrect login functionality without entering any data")
    @Severity(SeverityLevel.MINOR)
    @Test(description = "Login Without Data Test")
    public void noData() throws InterruptedException {
        Assert.assertTrue(loginStep.incorrectLogin("", "").isPageOpened());
    }

    @Description("Test for screenshot")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void screenshot() {
        Assert.assertTrue(loginStep.successfulLogin("", "").isPageOpened());
    }
}








