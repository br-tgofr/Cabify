package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Screen.LoginScreen;
import Utils.Utils;


public class LoginScreenObject extends LoginScreen{
    private WebDriver driver;



    public LoginScreenObject(WebDriver driver) {
    	super(driver);
        this.driver = driver;
    }

    public void setUserField(String strUserField){
        user.sendKeys(strUserField);
    }

    public void setPasswordField(String strPasswordField){
        password.sendKeys(strPasswordField);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public void clickBtnNext(){
        Utils.waitForElementToBeClickable(driver, btnNext, 10);
        btnNext.click();
    }

 

    public void loginCabify(String strUserField,String strPasswordField, String strCodRequest){
        this.setUserField(strUserField);
        this.setPasswordField(strPasswordField);
        this.clickBtnLogin();
    }
    
    public String loginValidate(){
        Utils.waitForElementToBeVisible(driver, getTextAfterLogin, 10);
        if(driver.getPageSource().contains("Remember this code for requesting a Taxi")){
            System.out.println("Login successful");
        }else {
            System.out.println("Login unsuccessful");
        }
        String captcha = getTextAfterLogin.getText();
        this.clickBtnNext();
        return captcha;
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
