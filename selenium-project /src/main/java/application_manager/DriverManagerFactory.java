package application_manager;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager;

        switch (type) {
            case IE:
                driverManager = new IEDriverManager();
                break;
            case FIREXOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }

        return driverManager;
    }
}
