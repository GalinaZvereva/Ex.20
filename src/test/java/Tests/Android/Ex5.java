package Tests.Android;

import SetUp.Android.Methods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Ex5 extends Methods {
    public Ex5(AndroidDriver driver) {
        super(driver);
    }

    public void clickOnSearchLine(){
        waitAndClickElement(By.id("org.wikipedia:id/search_container"));
    }
    public void fillTextInSearchLine(String text){
        waitAndFillText(By.id("org.wikipedia:id/search_src_text"), text);
    }
    public void clickOnFoundedArticle(String text){
        waitAndClickElement(By.xpath("//android.widget.TextView[@text='"+ text +"']"));
    }
    public void clickOnMoreOptions(){
        waitAndClickElement(By.xpath("//android.widget.ImageView[@content-desc='More options']"));
    }
    public void clickOnButtonAddInList(){
        waitAndClickElement(By.xpath("//android.widget.TextView[@text='Add to reading list']"));
    }
    public void clickOnButtonGotIt(){
        waitAndClickElement(By.xpath("//android.widget.TextView[@text='GOT IT']"));
    }
    public void clearFillType(){
        waitAndClear(By.id("org.wikipedia:id/text_input"));
    }
    public void fillNameForReadingList(){
        waitAndFillText(By.id("org.wikipedia:id/text_input"), "My favourite list");
    }
    public void clickOkButton(){
        waitAndClickElement(By.id("android:id/button1"));
    }
    public void closeArticle(){
        waitAndClickElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
    }
    public void clickOnReadingList(){
        waitAndClickElement(By.xpath("//android.widget.TextView[@text='My favourite list']"));
    }
    public void goToMyLists(){
        waitAndClickElement(By.xpath("//android.widget.FrameLayout[@content-desc='My lists']/android.widget.ImageView"));
    }

    public void goToCreatedList(){
        waitAndClickElement(By.xpath("//android.widget.TextView[@text='My favourite list']"));
    }
    public void longPress(String text){
        longPressElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
    }
    public void clickDeleteArticle(){
        waitAndClickElement(By.id("org.wikipedia:id/menu_delete_selected"));
    }
    public void assertCountArticles(){
        assertCountOfArticles();
    }
}
