package Screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen{

    private WebDriver driver;
    public WebElement userField;
    public WebElement passwordField;
    public WebElement btnLogin;


    public LoginScreen(WebDriver driver) {
        this.driver = driver;
        userField = driver.findElement(By.id("user_name_edit_text"));
        passwordField = driver.findElement(By.id("password_edit_text"));
        btnLogin = driver.findElement(By.id("login_button"));
    }



}

//package Screen;
//
//import Base.Driver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginScreen extends Driver {
//    PageObjects loginScreen;
//
//    String userName = "";
//    String password = "";
//    String btn_login = "";
//
//    public LoginScreen() {
//        super();
//        loginScreen = new PageObjects();
//        PageFactory.initElements(driver, loginScreen);
//    }
//
//    public boolean validateLoginScreen(){
//        boolean elements = false;
//        if(loginScreen.nameField.isDisplayed()){
//            if(loginScreen.passwordField.isDisplayed()){{
//                    if(loginScreen.loginBtn.isDisplayed()){
//                        elements = true;
//                    }
//                }
//            }
//        }
//        else{
//            elements = false;
//        }
//        return elements;
////        WebElement user_name = driver.findElement(By.id("user_name_edit_text"));
////        WebElement password = driver.findElement(By.id("password_edit_text"));
////        WebElement btn_login = driver.findElement(By.id("login_button"));
//    }
//
//    public boolean testLoginWithoutCredentials() {
//        boolean loginStatus = false;
//        loginScreen.loginBtn.click();
////        if (loginScreen.inputError.getText().equalsIgnoreCase("Username is mandatory")) {
////            loginStatus = true;
////        }
//        loginScreen.nameField.sendKeys(userName);
//        loginScreen.loginBtn.click();
////        if (loginScreen.inputError.getText().equalsIgnoreCase("Password is mandatory")) {
////            loginStatus = true;
////        }
//        return loginStatus;
//    }
//
//    static class PageObjects {
//
//        @CacheLookup
//        @FindBy(id = "user_name_edit_text")
//        public WebElement nameField;
//
//        @CacheLookup
//        @FindBy(id = "password_edit_text")
//        public WebElement passwordField;
//
//        @CacheLookup
//        @FindBy(id = "login_button")
//        public WebElement loginBtn;
//
////        @CacheLookup
////        @FindBy(name = "Invalid ID or password.")
////        public WebElement inputError;
//
//
//    }
//}
