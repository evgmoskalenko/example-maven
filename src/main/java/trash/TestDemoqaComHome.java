package trash;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDemoqaComHome extends TestBase {

    @Override
    String getUrl() {
        return "";
    }

    @Test()
    public void testValidTitle() {
        assertEquals("Demoqa | Just another WordPress site1", driver.getTitle());
    }

}