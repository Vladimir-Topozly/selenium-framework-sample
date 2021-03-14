package manager;

class DriverManagerFactory {

    static WebDriverManager getDriverManager(DriverType type) {
        WebDriverManager webDriverManager = null;

        switch (type) {
            case IE:
                webDriverManager = new IEDriverManager();
                break;
            case FIREFOX:
                webDriverManager = new FirefoxDriverManager();
                break;
            case CHROME:
                webDriverManager = new ChromeDriverManager();
                break;
        }

        return webDriverManager;
    }
}
