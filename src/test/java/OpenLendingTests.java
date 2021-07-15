import DriverFactory.DriverManager;
import DriverFactory.DriverManagerFactory;
import DriverFactory.DriverType;
import PageObjectLibrary.GooglePage;
import PageObjectLibrary.LinkedInPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenLendingTests {
    DriverManager driverManager;
    WebDriver driver;
    GooglePage googlePage;
    LinkedInPage linkedInPage;
    @Before
    public void setUp(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getDriver();

    }
    @Test
    public void OpenLendingExercise1(){
        driver.get("http://www.google.com");
        Assert.assertEquals("Google",driver.getTitle());
        googlePage = new GooglePage(driver);
        googlePage.searchResults("Open Lending" + Keys.ENTER);
        WebElement linkedIn = googlePage.findLinkedInResult();
        linkedIn.click();
        linkedInPage = new LinkedInPage(driver);
        Assert.assertEquals("Open Lending | LinkedIn", driver.getTitle());
        Assert.assertEquals("Say YES to more automotive loans.", linkedInPage.getSloganText().trim());
    }
    @After
    public void tearDown(){
        driverManager.quitDriver();
    }
}
