package SetUp.mobile_web;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class SetUpForSelenium {

    protected WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver(mobileOptions());
        driver.get("https://en.m.wikipedia.org/");
    }
    @AfterEach
    public void finish(){
        driver.quit();
    }


    private ChromeOptions mobileOptions(){
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 390);
        deviceMetrics.put("height", 844);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D)"
                + " " + "AppleWebKit/535.19 (KHTML, like Gecko)" +
                ""+" "+ "Chrome/18.0.1025.166 Mobile Safari/535.19");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=390,844");
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        return chromeOptions;
    }
}
