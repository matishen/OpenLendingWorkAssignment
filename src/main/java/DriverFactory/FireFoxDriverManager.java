package DriverFactory;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager extends DriverManager {


    @Override
    protected void createWebDriver() {
        this.driver = new FirefoxDriver();
    }
}
