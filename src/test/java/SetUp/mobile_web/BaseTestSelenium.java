package SetUp.mobile_web;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BaseTestSelenium extends SetUpForSelenium {
    public BaseTestSelenium (WebDriver driver){
        this.driver = driver;
    }

    protected void setWait(By elementBy) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    protected void aWaiting() throws InterruptedException {
        Thread.sleep(1000);
    }
    protected void WaitAndClickElement(By elementBy){
        setWait(elementBy);
        driver.findElement(elementBy).click();
    }
    protected void WaitAndWriteTextInElement(By elementBy, String text){
        setWait(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
    protected void refreshPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
    protected void checkThisValue(String expectedValue){
        String value = getText(expectedValue,0);
        if (expectedValue.startsWith(expectedValue)){
            Assertions.assertEquals(expectedValue,value, "Title not visible");
            System.out.println("Verification was successful");
        }else {
            Assertions.fail("Something wrong");
        }
    }
    protected String getText(String expectedValue,int x){
        String getText = driver.findElement(By.xpath("//li[@title='"+expectedValue+"']")).getText();
        String[] splited = getText.split("\\s");
        return splited[x];
    }

    public String takeScreenShot(String name){
        TakesScreenshot ts = (TakesScreenshot)this.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/" + name + "_screenshot.jpg";
        try {
            FileUtils.copyFile(source, new File(path));
            System.out.println("The screen was taken: " + path);
        }catch (Exception e){
            e.printStackTrace();
        }
        return path;
    }
    @Attachment
    public static byte[] screen(String path){
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get(path));
        }catch (IOException e){
            e.printStackTrace();
        }
        return bytes;
    }

}
