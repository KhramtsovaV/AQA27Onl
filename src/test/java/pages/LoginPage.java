package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final By USERNAME_INPUT_LOCATOR = By.id("user-name");
    private final By PASSWORD_INPUT_LOCATOR = By.id("password");
    private final By LOGIN_BUTTON_LOCATOR = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return USERNAME_INPUT_LOCATOR;
    }

    public WebElement getUsernameInput() {
        return driver.findElement(USERNAME_INPUT_LOCATOR);
    }
    public WebElement getPasswordInput() {
        return driver.findElement(PASSWORD_INPUT_LOCATOR);
    }
    public WebElement getLoginButton() {
        return driver.findElement(LOGIN_BUTTON_LOCATOR);
    }

    public void setUsernameValue(String value) {
        getUsernameInput().sendKeys(value);
    }
    public void setPasswordValue(String value) {
        getPasswordInput().sendKeys(value);
    }
    public void buttonClick() {
        getLoginButton().click();
    }
}
