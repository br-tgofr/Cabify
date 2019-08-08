package Test;

import Base.Driver;
import PageFactory.JourneySettingsObject;
import PageFactory.LoginScreenObject;
import Screen.LoginScreen;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class TestLogin{

    AndroidDriver driver;

    LoginScreenObject loginScreenObject;
    JourneySettingsObject jsObject;

    @BeforeEach
    public void before() throws MalformedURLException {
        Driver device = new Driver();
        device.initDriver();
        driver = device.getDriver();
    }

    @Test
    public void testLogin() {
        loginScreenObject = new LoginScreenObject(driver);
        
        loginScreenObject.loginCabify("user@qabify.com", "1234Abc", "");
        loginScreenObject.loginValidate();
        String captcha = loginScreenObject.settingsValidate();
        jsObject = new JourneySettingsObject(driver);
        jsObject.setPickUp();
    }
    
    @Test
    public void testJourneySettings() {
    	testLogin();
    	
    }
}
