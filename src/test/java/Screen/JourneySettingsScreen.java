package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JourneySettingsScreen {
    private WebDriver driver;

    public JourneySettingsScreen(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void journeySettingsExec(){

    }
}
