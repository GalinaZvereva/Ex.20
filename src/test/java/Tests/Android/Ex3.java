package Tests.Android;

import SetUp.Android.Methods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class Ex3 extends Methods {
    public Ex3(AndroidDriver driver) {
        super(driver);
    }

    public Ex3 clickOnSearch(){
        waitAndClickElement(By.id("org.wikipedia:id/search_container"));
        return this;
    }
    public Ex3 fillTextInSearchLine(String text){
        waitAndFillText(By.id("org.wikipedia:id/search_src_text"), text);
        return this;
    }
    public Ex3 assertElementHasResult(){
        assertElementHasResult(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']"));
        return this;
    }
    public Ex3 clearSearchLine(){
        waitAndClickElement(By.id("org.wikipedia:id/search_close_btn"));
        return this;
    }
    public Ex3 assertSearchIsEmpty(){
        assertSearchIsEmpty(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']"));
        return this;
    }
}
