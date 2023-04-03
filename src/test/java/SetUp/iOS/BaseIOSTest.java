package SetUp.iOS;

import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class BaseIOSTest extends iOSTestCase {

    public BaseIOSTest(IOSDriver driver) {
        this.driver = driver;
    }
    protected void WaitForElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    protected void WaitAndClickElement(By by){
        WaitForElement(by);
        driver.findElement(by).click();
    }
    protected void WaitAndWriteTextInElement(By by, String text){
        WaitForElement(by);
        driver.findElement(by).sendKeys(text);
    }

    protected void longTouch(By by) {
        WebElement element = driver.findElement(by);
        int x = element.getRect().x + (element.getSize().width) / 2;
        double y = element.getRect().y + (element.getSize().height / 2);
        double end_y = element.getRect().y + (element.getSize().height / 2);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence longTouch = new Sequence(finger, 1);
        longTouch.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(), x,(int)y));
        longTouch.addAction(finger.createPointerDown(0));
        longTouch.addAction(finger.createPointerMove(Duration.ofMillis(800),PointerInput.Origin.viewport(), x,(int)end_y));
        driver.perform(Arrays.asList(longTouch));
    }

    protected void checkThisValue(String expectedValue){
        WebElement actual = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@value='"+expectedValue+"']"));
        String value = actual.getText();
        if (expectedValue.startsWith(expectedValue)){
        Assertions.assertEquals(expectedValue,value,"This title not found");
            System.out.println("Verification was successful");
        }else {
            Assertions.fail("Something wrong");
        }
    }
}
