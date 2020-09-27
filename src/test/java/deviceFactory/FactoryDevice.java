package deviceFactory;

public class FactoryDevice {

    public static IDevice make(String type) {
        IDevice device;
        switch (type) {
            case "android":
                device = new Android();
                break;
            case "ios":
                device = new IOS();
                break;
            case "windowsPhone":
                device = new WindowsPhone();
                break;
            case "browserStack":
                device = new BrowserStack();
                break;

            default:
                device = new Android();
                break;
        }

        return device;
    }
}
