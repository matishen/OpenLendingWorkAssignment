package PageObjectLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GooglePage {
    WebDriver driver;
    public GooglePage(WebDriver driver){
        this.driver = driver;
    }
    private By searchBox = By.xpath("//input[@title='Search']");
    private By googleSearchResults = By.xpath("//h3[@class='LC20lb DKV0Md']");
    public void searchResults(String inputText){
        driver.findElement(searchBox).sendKeys(inputText);
    }
    public WebElement findLinkedInResult(){
        WebElement found = null;
        List<WebElement> links = new ArrayList<WebElement>();
        links = driver.findElements(googleSearchResults);
        for (WebElement link: links) {
            String text = link.getText();
            if (text.contains("LinkedIn"))
                found = link;
        }
        return found;
    }
}
