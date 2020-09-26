package sessionManager;

import deviceFactory.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {
    // the attibutes for this class
    private static Session session = null;
    private AppiumDriver driver;

    public Session() throws MalformedURLException {
        driver = FactoryDevice.make("android").create();
    }

    public static Session getInstance() throws MalformedURLException {
        if (session == null)
            session = new Session();
        return session;
    }

    public void CloseSession() {
        driver.quit();
        session = null;
    }

    public AppiumDriver getDriver(){
        return driver;
    }
}
