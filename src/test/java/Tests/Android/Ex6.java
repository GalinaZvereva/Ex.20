package Tests.Android;

import SetUp.Android.Methods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Ex6 extends Methods {
    public Ex6(AndroidDriver driver) {
        super(driver);
    }

    public void clickOnSearchLine(){
        waitAndClickElement(By.id("org.wikipedia:id/search_container"));
    }
    public void fillTextInSearchLine(String text){
        waitAndFillText(By.id("org.wikipedia:id/search_src_text"),text);
    }
    public void clickOnFoundedArticle(String text){
        waitAndClickElement(By.xpath("//android.widget.TextView[@text='"+ text +"']"));
    }
    public void assertTitles(){
        assertTitle("Element not found");
    }
}
