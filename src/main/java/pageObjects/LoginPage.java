package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    //Elements
    @FindBy(css = "[id='user-name']")
    WebElement usernameField;

    @FindBy(css = "[id='password']")
    WebElement passwordField;

    @FindBy(css = "[id='login-button']")
    WebElement loginButton;

    @FindBy(css = "[data-test='error']")
    WebElement errorMessage;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        fillText(usernameField, username);
        fillText(passwordField, password);
        clickElement(loginButton);
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }
}
