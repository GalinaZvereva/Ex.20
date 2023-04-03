import SetUp.Android.SetUp;
import Tests.Android.Ex3;
import Tests.Android.Ex5;
import Tests.Android.Ex6;
import org.junit.jupiter.api.Test;

public class RunAndroidTests extends SetUp {

    @Test
    public void startTestEx3(){
        Ex3 ex3 = new Ex3(driver);
        ex3.clickOnSearch();
        ex3.fillTextInSearchLine("Java");
        ex3.assertElementHasResult();
        ex3.clearSearchLine();
        ex3.assertSearchIsEmpty();
    }

    @Test
    public void startTestEx5(){
        String text = "Java";
        String text2 = "Romeo";
        Ex5 ex5 = new Ex5(driver);
        ex5.clickOnSearchLine();
        ex5.fillTextInSearchLine(text);
        ex5.clickOnFoundedArticle(text);
        ex5.clickOnMoreOptions();
        ex5.clickOnButtonAddInList();
        ex5.clickOnButtonGotIt();
        ex5.clearFillType();
        ex5.fillNameForReadingList();
        ex5.clickOkButton();
        ex5.closeArticle();
        ex5.clickOnSearchLine();
        ex5.fillTextInSearchLine(text2);
        ex5.clickOnFoundedArticle(text2);
        ex5.clickOnMoreOptions();
        ex5.clickOnButtonAddInList();
        ex5.clickOnReadingList();
        ex5.closeArticle();
        ex5.goToMyLists();
        ex5.goToCreatedList();
        ex5.longPress(text2);
        ex5.clickDeleteArticle();
        ex5.assertCountArticles();
    }
    @Test
    public void startTestEx6(){
        String text = "Romeo";
        Ex6 ex6 = new Ex6(driver);
        ex6.clickOnSearchLine();
        ex6.fillTextInSearchLine(text);
        ex6.clickOnFoundedArticle(text);
        ex6.assertTitles();
    }
}
