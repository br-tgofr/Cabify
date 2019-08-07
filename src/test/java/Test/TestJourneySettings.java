package Test;

import Base.Driver;
import PageFactory.JourneySettingsObject;
import PageFactory.LoginScreenObject;
import Screen.JourneySettingsScreen;
import Screen.LoginScreen;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class TestJourneySettings {
    AndroidDriver driver;

    LoginScreen loginScreen;
    LoginScreenObject loginScreenObject;
    JourneySettingsScreen journeysettingsScreen;
    JourneySettingsObject journeySettingsObject;

    @BeforeEach
    public void before() throws MalformedURLException {
        Driver device = new Driver();
        device.initDriver();
        driver = device.getDriver();
    }

    @Test
    public void ChooseJourneySettings(){
    }
}
