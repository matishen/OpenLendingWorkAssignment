package PageObjectLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedInPage {
    WebDriver driver;
    public LinkedInPage(WebDriver driver){
        this.driver = driver;
    }
    private By slogan = By.xpath("//h4[@class='top-card-layout__second-subline']");
    public String getSloganText(){
        return driver.findElement(slogan).getText();
    }
}
