package trash;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;

import static trash.Settings.open_browser;

public abstract class TestBase {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        String url = getUrl();
        driver = open_browser(url);
    }

    abstract String getUrl();

}
