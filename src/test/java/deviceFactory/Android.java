package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice {


    @Override
    public AppiumDriver create() throws MalformedURLException {
        // configuration 5 attributes for conexion to appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("appPackage","");
        capabilities.setCapability("appActivity","");
        capabilities.setCapability("platformName","Android");

        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return driver;
    }
}
