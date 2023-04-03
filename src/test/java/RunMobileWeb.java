import SetUp.mobile_web.SetUpForSelenium;
import Tests.mobile_web.Ex17;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RunMobileWeb extends SetUpForSelenium {

    String logIn = "g.zverevaTest";
    String password = "12345678Q";
    String resultOne = "Java";
    String resultTwo = "Water";

    @Test
    @Features(value = {@Feature(value = "Search"), @Feature(value = "Article")})
    @DisplayName("Test on save two articles and delete one from watchlist")
    @Description("Searching articles and save it in WatchList")
    @Severity(value = SeverityLevel.BLOCKER)
    public void start() throws InterruptedException {
        Ex17 ex17 = new Ex17(driver);
        ex17.clickOnBurgerMenu();
        ex17.clickOnLogin();
        ex17.fillTextInLogIn(logIn);
        ex17.fillTextInPass(password);
        ex17.pressLogInButton();
        ex17.ClickOnSearchIcon();
        ex17.fillTextInSearch(resultOne);
        ex17.clickOnResult(resultOne);
        ex17.addArticleInWatchList();
        ex17.ClickOnSearchIcon();
        ex17.fillTextInSearch(resultTwo);
        ex17.clickOnResult(resultTwo);
        ex17.addArticleInWatchList();
        ex17.clickOnBurgerMenu();
        ex17.clickWatchList();
        ex17.deleteArticleFromWatchList(resultTwo);
        ex17.refreshWatchPage();
        ex17.checkVisible(resultOne);
    }
}
