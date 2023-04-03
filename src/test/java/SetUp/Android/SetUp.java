package SetUp.Android;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class SetUp {
    protected AndroidDriver driver;

    private final static String appiumServer = "127.0.0.1";
    private final static String appiumPort = "4723";

    private final static String nameDevice = "emulator-5554";
    private final static String versionAndroid = "11";


    @BeforeEach
    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName",nameDevice);
        capabilities.setCapability("platformVersion",versionAndroid);
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","org.wikipedia");
        capabilities.setCapability("appActivity",".main.MainActivity");
        capabilities.setCapability("app","C:\\Users\\g.zvereva\\IdeaProjects\\appiumTestWikipedia\\src\\test\\resources\\org.wikipedia.apk");
        driver = new AndroidDriver(new URL("http://"+ appiumServer +":"+ appiumPort +"/wd/hub"), capabilities);
    }
    @AfterEach
    public void finish()
    {
        driver.quit();
    }
}
