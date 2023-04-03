package Tests.mobile_web;

import SetUp.mobile_web.BaseTestSelenium;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Ex17 extends BaseTestSelenium {
    public Ex17(WebDriver driver) {
        super(driver);
    }

    @Step("Click on menu")
    public void clickOnBurgerMenu(){
        screen(this.takeScreenShot("screen"));
        WaitAndClickElement(By.xpath("//label[@for='main-menu-input']"));
    }
    @Step("Click on login")
    public void clickOnLogin(){
        screen(this.takeScreenShot("screen"));
        WaitAndClickElement(By.xpath("//span[@class='mw-ui-icon-minerva-logIn mw-ui-icon']"));
    }
    @Step("Fill login")
    public void fillTextInLogIn(String logIn){
        screen(this.takeScreenShot("screen"));
        WaitAndWriteTextInElement(By.id("wpName1"),logIn);
    }
    @Step("Fill password")
    public void fillTextInPass(String pass){
        screen(this.takeScreenShot("screen"));
        WaitAndWriteTextInElement(By.id("wpPassword1"), pass);
    }
    @Step("Press login button")
    public void pressLogInButton(){
        screen(this.takeScreenShot("screen"));
        WaitAndClickElement(By.id("wpLoginAttempt"));
    }
    @Step("Click on search icon")
    public void ClickOnSearchIcon(){
        screen(this.takeScreenShot("screen"));
        WaitAndClickElement(By.id("searchIcon"));
    }
    @Step("Fill text in search line")
    public void fillTextInSearch(String text){
        screen(this.takeScreenShot("screen"));
        WaitAndWriteTextInElement(By.xpath("//input[@class='search mw-ui-background-icon-search']"),text);
    }
    @Step("Click on result")
    public void clickOnResult(String result){
        screen(this.takeScreenShot("screen"));
        WaitAndClickElement(By.xpath("//li[@title='"+result+"']"));
    }
    @Step("Add article in watching list")
    public void addArticleInWatchList() throws InterruptedException {
        aWaiting();
        screen(this.takeScreenShot("screen"));
        WaitAndClickElement(By.id("ca-watch"));
    }
    @Step("Click on watching list")
    public void clickWatchList(){
        screen(this.takeScreenShot("screen"));
        WaitAndClickElement(By.xpath("//span[@class='mw-ui-icon-minerva-watchlist mw-ui-icon']"));
    }
    @Step("Delete one from watchlist article")
    public void deleteArticleFromWatchList(String article){
        screen(this.takeScreenShot("screen"));
        WaitAndClickElement(By.xpath("//li[@title='"+article+"']//a[@aria-controls='mw-watchlink-notification']"));
    }
    @Step("Refresh page")
    public void refreshWatchPage() throws InterruptedException {
        refreshPage();
        screen(this.takeScreenShot("screen"));
    }
    @Step("Check visible article")
    public void checkVisible(String result){
        checkThisValue(result);
        screen(this.takeScreenShot("screen"));
    }

}
