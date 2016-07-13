import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.Assert.assertTrue;

@Description("This is an example test suite")
public class ExampleTestSuite {

//    @Title("Failing test")
//    @Test
//    public void failingTest() {
//        assertEquals(1, 2);
//    }

    @Title("Successful test")
    @Test
    public void successfulTest() {
        assertTrue(2 == 2);
    }
}