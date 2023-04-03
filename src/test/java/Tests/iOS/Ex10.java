package Tests.iOS;

import SetUp.iOS.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class Ex10 extends BaseIOSTest {
    public Ex10(IOSDriver driver) {
        super(driver);
    }

    public void clickNextButton(){
        WaitForElement(By.id("The free encyclopedia"));
        WaitAndClickElement(By.xpath("//XCUIElementTypeStaticText[@name='Next']"));
        WaitForElement(By.id("New ways to explore"));
        WaitAndClickElement(By.xpath("//XCUIElementTypeStaticText[@name='Next']"));
        WaitForElement(By.id("Search in over 300 languages"));
        WaitAndClickElement(By.xpath("//XCUIElementTypeStaticText[@name='Next']"));
    }
    public void clickGetStarted(){
        WaitAndClickElement(By.xpath("//XCUIElementTypeStaticText[@name='Get started']"));
    }
}
