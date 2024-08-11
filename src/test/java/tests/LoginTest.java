package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() {
        Assert.assertTrue(loginStep.successfulLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
    }

    @Test
    public void successLoginTestOtherUser1() {
        Assert.assertTrue(loginStep.successfulLogin("problem_user", ReadProperties.password()).isPageOpened());
    }

    @Test
    public void successLoginTestOtherUser2() {
        Assert.assertTrue(loginStep.successfulLogin("locked_out_user", ReadProperties.password()).isPageOpened());
    }

    @Test
    public void incorrectUsername() {
        Assert.assertTrue(loginStep.incorrectLogin("gfkjhf", ReadProperties.password()).isPageOpened());
    }

    @Test
    public void incorrectPassword() {
        Assert.assertTrue(loginStep.incorrectLogin(ReadProperties.username(), "password123").isPageOpened());
    }

    @Test
    public void withoutPassword() {
        Assert.assertTrue(loginStep.incorrectLogin(ReadProperties.username(), "").isPageOpened());
    }

    @Test
    public void withoutUsername() {
        Assert.assertTrue(loginStep.incorrectLogin("", ReadProperties.password()).isPageOpened());
    }

    @Test
    public void noData() {
        Assert.assertTrue(loginStep.incorrectLogin("", "").isPageOpened());
    }
}









