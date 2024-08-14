package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductPage;

public class LoginSteps extends BaseStep {

    public LoginSteps(WebDriver driver) {
        super(driver);
    }

    public ProductPage successfulLogin(String username, String password) {
        login(username, password);
        return productPage;
    }

    public LoginPage incorrectLogin(String username, String password) {
        login(username, password);
        return loginPage;
    }

    private void login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameValue(username);
        loginPage.setPasswordValue(password);
        loginPage.buttonClick();
    }
}
