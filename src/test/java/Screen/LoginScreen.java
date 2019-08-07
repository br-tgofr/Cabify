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
    WebElement user;

    @FindBy(id="password_edit_text")
    WebElement password;

    @FindBy(id="login_button")
    WebElement btnLogin;

    @FindBy(id = "captcha_button")
    WebElement btnNext;

    @FindBy(id = "pick_up_point")
    WebElement pickUp;

    @FindBy(id = "drop_off_point")
    WebElement dropOff;

    @FindBy(id = "liteCheckBox")
    WebElement liteBox;

    @FindBy(id = "executiveCheckBox")
    WebElement execBox;

    @FindBy(id = "captcha_text")
    WebElement textCaptcha;

    @FindBy(id = "estimate_button")
    WebElement btnEstimate;

    public LoginScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public void setPickUp(){
        pickUp.click();
        List<WebElement> elements = driver.findElements(By.id("pick_up_point"));
        for (WebElement element : elements) {
            if (element.getAttribute("text") == "AMI") {
                element.click();
            }
        }
    }

    public void setDropOff(){
        dropOff.click();
    }

    public void setLiteBox(){
        liteBox.click();
    }

    public void setExecBox(){
        execBox.click();
    }

    public void setTextCaptcha(String strCodRequest){
        textCaptcha.sendKeys(strCodRequest);
    }

    public void clickBtnEstimate(){
        btnEstimate.click();
    }

    public void loginCabify(String strUserField,String strPasswordField, String strCodRequest){
        this.setUserField(strUserField);
        this.setPasswordField(strPasswordField);
        this.clickBtnLogin();
        this.clickBtnNext();
        this.setPickUp();
        this.setDropOff();
        this.setExecBox();
        this.setTextCaptcha(strCodRequest);
        this.clickBtnEstimate();
    }
}
