package Object;

import Screen.LoginScreen;
import org.openqa.selenium.WebDriver;

public class LoginScreenObject{
    private WebDriver driver;
    private LoginScreen loginScreen;

    public LoginScreenObject(WebDriver driver) {
        loginScreen = new LoginScreen(driver);
    }

    public void setUsername() {
        loginScreen.userField.click();
        loginScreen.userField.sendKeys("user@qabify.com");
    }

    public void setPassword() {
        loginScreen.passwordField.click();
        loginScreen.passwordField.sendKeys("1234Abc");
    }

    public void clickBtnLogin() {
        loginScreen.btnLogin.click();
    }

    public void validateLogin(){
    }




}
