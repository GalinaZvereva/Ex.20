package SetUp.iOS;

import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class iOSTestCase {
    protected IOSDriver driver;

    private final static String AppiumServer = "127.0.0.1";
    private final static String AppiumPort = "4723";
    private final static String platformName = "iOS";
    private final static String deviceName = "iPhone 6s";
    private final static String platformVersion = "15.5";
    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", platformVersion);
        File file = new File("src/main/resources", "Wikipedia.app");
        capabilities.setCapability("app", file.getAbsolutePath());
        driver = new IOSDriver((new URL("http://" + AppiumServer + ":" + AppiumPort + "/wd/hub")), capabilities);
    }
    @AfterEach
    public void finishTest(){
        driver.quit();
    }
}
