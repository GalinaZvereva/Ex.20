
import SetUp.iOS.iOSTestCase;
import Tests.iOS.Ex10;
import Tests.iOS.Ex11;
import org.junit.jupiter.api.Test;


public class RunIOSTests extends iOSTestCase {
    @Test
    public void start (){
        Ex10 ex10 = new Ex10(driver);
        ex10.clickNextButton();
        ex10.clickGetStarted();
    }
    @Test
    public void startSearchPageObject(){
        String resultOne = "Water";
        String resultTwo = "Java";
        Ex11 ex11 = new Ex11(driver);
        ex11.skipScreen();
        ex11.clickOnSearchLine();
        ex11.writeTextInSearchLine(resultOne);
        ex11.chooseResult(resultOne);
        ex11.saveArticle();
        ex11.backInSearch();
        ex11.clearText();
        ex11.writeTextInSearchLine(resultTwo);
        ex11.chooseResult(resultTwo);
        ex11.saveArticle();
        ex11.pressW();
        ex11.openSaved();
        ex11.closeWindow();
        ex11.longTouchTitle(resultOne);
        ex11.deleteThisArticle();
        ex11.checkValue(resultTwo);
    }
}
