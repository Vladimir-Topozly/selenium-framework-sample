package application_manager;

class DriverManagerFactory {
    public static WebDriverManager getDriverManager(DriverType type) {
        WebDriverManager driverManager;

        switch (type) {
            case IE:
                driverManager = new IEDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }

        return driverManager;
    }
}
