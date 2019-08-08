package Screen;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginScreen{

    private WebDriver driver;
    @FindBy(id="user_name_edit_text")
	protected
    WebElement user;

    @FindBy(id="password_edit_text")
    protected
    WebElement password;

    @FindBy(id="login_button")
    protected
    WebElement btnLogin;

    @FindBy(id = "captcha_button")
    protected
    WebElement btnNext;

    @FindBy(id = "captcha_button")
    protected
    WebElement getTextAfterLogin;

    @FindBy(id = "estimate_button")
    protected
    WebElement getTextSettings;

    public LoginScreen(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
}
