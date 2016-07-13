package pageObject2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WaitRe extends DriverHandler implements Wait {

    public void waitElementVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
