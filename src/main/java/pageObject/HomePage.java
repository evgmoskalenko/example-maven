package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    WebElement searchInput = driver.findElement(By.id("search-input"));
    WebElement searchButton = driver.findElement(By.id("search-button"));

    public HomePage testSearch(String text) {
        setText(searchInput, text);
        clickAndWait(searchButton);
        return this;
    }

}
