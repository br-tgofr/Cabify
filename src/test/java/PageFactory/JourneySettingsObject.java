package PageFactory;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;

import Screen.JourneySettingsScreen;

public class JourneySettingsObject extends JourneySettingsScreen{
    private WebDriver driver;

    public JourneySettingsObject(WebDriver driver) {
    	super(driver);
        this.driver = driver;
    }
    
    public void setPickUp(){
        pickUp.click();
        
        List<WebElement> elements = driver.findElements(By.id("text1"));
        int quantidade = elements.size();
        
        Random r = new Random();
        int low = 1;
        int high = quantidade-1;
        int result = r.nextInt(high-low) + low;
        
        elements.get(result).click();
//        for (WebElement element : elements) {
//            if (element.getAttribute("text") == "AMI") {
//                element.click();
//            }
//        }
//        
//        MobileElement elementoMob = (MobileElement) driver.findElement(By.id("pick_up_point"));
//        Select elemento = (Select) driver.findElement(By.id("pick_up_point"));
//        elemento.selectByIndex(2);
//        elemento.selectByIndex(1);
//        elemento.selectByIndex(0);
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
    
    public void journeySettingsExec(String strCodRequest){

        this.setPickUp();
        this.setDropOff();
        this.setExecBox();
        this.setTextCaptcha(strCodRequest);
        this.clickBtnEstimate();
    	
    }
    
    
}
