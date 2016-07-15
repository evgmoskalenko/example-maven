package trash;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Settings {

    private static String getBrowser() throws FileNotFoundException {
        File pathToFile = new File("/Users/apple/IdeaProjects/example-maven/src/main/java/trash/config.json");
        FileReader fReader = new FileReader(pathToFile);
        JsonParser jParser = new JsonParser();
        JsonObject jObject = (JsonObject) jParser.parse(fReader);
        System.out.println(jObject.get("browser").toString().replace("\"", ""));
        return jObject.get("browser").toString().replace("\"", "");
    }

    private static String getUrl() throws FileNotFoundException {
        File pathToFile = new File("/Users/apple/IdeaProjects/example-maven/src/main/java/trash/config.json");
        FileReader fReader = new FileReader(pathToFile);
        JsonParser jParser = new JsonParser();
        JsonObject jObject = (JsonObject) jParser.parse(fReader);
        return jObject.get("URL").toString().replace("\"", "");
    }

    static WebDriver open_browser(String url_index) throws FileNotFoundException {
        WebDriver driver;
        if (getBrowser().equals("Chrome")) {
            driver = new ChromeDriver();
        }
        else if (getBrowser().equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        else {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
//        if (url_index == null) {
//            driver.get(getUrl());
//        } else {
//            driver.get(getUrl() + url_index);
//        }
        driver.get(getUrl() + url_index);
        return driver;
    }
}
