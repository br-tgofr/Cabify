package Test;

import Base.Driver;
import Object.LoginScreenObject;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class TestLogin{

    AndroidDriver driver;

    @BeforeEach
    public void before() throws MalformedURLException {
        Driver device = new Driver();
        device.initDriver();
        driver = device.getDriver();
    }

    @Test
    public void testLogin() throws InterruptedException {
        LoginScreenObject loginScreenObject = new LoginScreenObject(driver);
        loginScreenObject.setUsername();
        loginScreenObject.setPassword();
        loginScreenObject.clickBtnLogin();
    }

}
