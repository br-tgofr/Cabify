package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetup {
    private static AndroidDriver androidDriver = null;

    public void setup() throws MalformedURLException {
        initDriver();
    }

    public AndroidDriver getDriver() {
        return androidDriver;
    }

    public void initDriver() throws MalformedURLException {

        File arquivoAplicacao = new File("src/test/resources/apps/Cabify/qabify2019.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        cap.setCapability(MobileCapabilityType.APP,arquivoAplicacao.getAbsolutePath());
        cap.setCapability("newCommandTimeout", 500);
        androidDriver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
    }

    @AfterClass
    public void tearDown() {
        androidDriver.quit();
    }
}
