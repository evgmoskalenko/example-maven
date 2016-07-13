package pageObject;

import org.junit.Test;

public class SomeTest extends BaseTest {

    @Test
    public void search() {
        getHomePage().testSearch("google");
        // asserts
    }

}
