package pageObject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage implements UiElements {

    WebElement usernameField = driver.findElement(By.id("user-name"));
    WebElement passwordField = driver.findElement(By.id("password"));
    WebElement loginButton = driver.findElement(By.id("send-button"));

    public void login(String userName, String password) {
        typeInField(usernameField, "qa");
        typeInField(passwordField, "12345");
        waitElementVisibilityOf(loginButton);
        tap(loginButton);
    }

}
