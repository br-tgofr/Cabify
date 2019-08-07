package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JourneySettingsObject {
    private WebDriver driver;

    public JourneySettingsObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
