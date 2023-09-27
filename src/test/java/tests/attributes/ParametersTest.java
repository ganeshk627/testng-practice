package tests.attributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test
    @Parameters({"whom"})
    public void sendMessageTest(String whom) {
        System.out.println(whom);

    }

    @Test
    @Parameters({"title"})
    public void postPictureTest(String title) {
        System.out.println(title);

    }

    @Test
    public void registerAccountTest() {
        System.out.println("Test3");
    }

    @Parameters({"whom", "title"})
    @Test
    public void loginTest(String whom, String title) {
        System.out.println(whom+" "+title);

    }


}
