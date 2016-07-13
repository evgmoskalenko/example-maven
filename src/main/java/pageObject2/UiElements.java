package pageObject2;

import org.openqa.selenium.WebElement;

public interface UiElements {

    default void tap(WebElement element) {
        element.click();
    }

    default void typeInField(WebElement element, String text) {
        element.clear();
        element.click();
    }

}
