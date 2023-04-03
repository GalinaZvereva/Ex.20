package Tests.iOS;

import SetUp.iOS.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class Ex11 extends BaseIOSTest {
    public Ex11(IOSDriver driver) {
        super(driver);
    }

    public void skipScreen(){
        WaitAndClickElement(By.xpath("//*[@name='Skip']"));
    }
    public void clickOnSearchLine(){
        WaitAndClickElement(By.id("Search Wikipedia"));
    }
    public void writeTextInSearchLine(String text){
        WaitAndWriteTextInElement(By.id("Search Wikipedia"), text);
    }
    public void chooseResult(String clickOnResult){
        WaitAndClickElement(By.xpath("//*[@name='"+clickOnResult+"']"));
    }
    public void saveArticle(){
        WaitAndClickElement(By.id("Save for later"));
    }
    public void backInSearch(){
        WaitAndClickElement(By.id("Search"));
    }
    public void clearText(){
        WaitAndClickElement(By.id("Clear text"));
    }
    public void pressW(){
        WaitAndClickElement(By.xpath("//*[@name='W']"));
    }
    public void openSaved(){
        WaitAndClickElement(By.id("Saved"));
    }
    public void closeWindow(){
        WaitAndClickElement(By.id("Close"));
    }
    public void checkValue(String result){
        checkThisValue(result);
    }

    public void longTouchTitle(String result){
        longTouch(By.id(""+result+""));
    }
    public void deleteThisArticle(){
        WaitAndClickElement(By.id("Remove from saved"));
    }
}
