package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.Utils;


public class LoginScreenObject{
    private WebDriver driver;

    @FindBy(id = "captcha_button")
    WebElement getTextAfterLogin;

    @FindBy(xpath = "estimate_button")
    WebElement getTextSettings;

    public LoginScreenObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String loginValidate(){
        Utils.waitForElementToBeVisible(driver, getTextAfterLogin, 10);
        if(driver.getPageSource().contains("Remember this code for requesting a Taxi")){
            System.out.println("Login successful");
        }else {
            System.out.println("Login unsuccessful");
        }
        return getTextAfterLogin.getText();
    }

    public String settingsValidate(){
        Utils.waitForElementToBeVisible(driver, getTextSettings, 10);
        if(driver.getPageSource().contains("Selet your origin and destination:")){
            System.out.println("Settings trip successful");
        }else {
            System.out.println("Settings trip unsuccessful");
        }
        return getTextSettings.getText();
    }

}
