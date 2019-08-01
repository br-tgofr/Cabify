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

        File diretorioAplicacao = new File("C:/workspace/AutomationTestCabify/src/test/resources/apps/Cabify");
        File arquivoAplicacao = new File(diretorioAplicacao, "qabify2019.apk");
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

//package Base;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class BaseSetup {
//        private DesiredCapabilities capabilities = new DesiredCapabilities();
//        private static AndroidDriver androidDriver = null;
//
//        private String appiumPort;
//        private String serverIp;
//
//        @BeforeClass
//        public void setup() throws MalformedURLException {
//                initDriver();
//        }
//        public AndroidDriver getDriver() {
//                return androidDriver;
//        }
//
//        public void initDriver() throws MalformedURLException {
//
//        File applicationDirectory = new File("apps/qabify2019");
//        File applicationFiles = new File(applicationDirectory, "qabify2019.apk");
//                DesiredCapabilities cap = new DesiredCapabilities();
//                cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//                cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//                cap.setCapability(MobileCapabilityType.APP, applicationFiles.getAbsolutePath());
//                cap.setCapability("noReset", true);
//                String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";
//                //AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//
//                try
//                {
//                        System.out.println("Argument to driver object : " + serverUrl);
//                        androidDriver = new AndroidDriver(new URL(serverUrl), capabilities);
//
//                }
//                catch (MalformedURLException ex) {
//                        throw new RuntimeException("appium driver could not be initialised for device ");
//                }
//                System.out.println("Driver in initdriver is : "+androidDriver);
//        }
//
//        @AfterClass
//        public void tearDown(){
//                androidDriver.quit();
//        }
//
//
//}
