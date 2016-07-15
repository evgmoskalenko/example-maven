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

    protected String getUrl() {
        return "";
    }

//    @BeforeClass
//    public void setUp(String url) throws FileNotFoundException {
//        driver = open_browser(url);
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }


}
