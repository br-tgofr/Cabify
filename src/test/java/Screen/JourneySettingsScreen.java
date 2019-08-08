package Screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JourneySettingsScreen {
    private WebDriver driver;

    @FindBy(id = "pick_up_point")
    protected
    WebElement pickUp;

    @FindBy(id = "drop_off_point")
    protected
    WebElement dropOff;

    @FindBy(id = "liteCheckBox")
    protected
    WebElement liteBox;

    @FindBy(id = "executiveCheckBox")
    protected
    WebElement execBox;

    @FindBy(id = "captcha_text")
    protected
    WebElement textCaptcha;

    @FindBy(id = "estimate_button")
    protected
    WebElement btnEstimate;
    
    public JourneySettingsScreen(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
