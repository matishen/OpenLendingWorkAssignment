package DriverFactory;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        this.driver = new InternetExplorerDriver();
    }
}
