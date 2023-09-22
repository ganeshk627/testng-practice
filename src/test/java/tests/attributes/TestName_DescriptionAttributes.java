package tests.attributes;

import org.testng.annotations.Test;

public class TestName_DescriptionAttributes {

    @Test(testName = "Sending Message - Any Person", dependsOnMethods = {"loginTest"}, suiteName = "Auto Suite")
    public void sendMessageTest() {
        System.out.println("Test is executed!!!");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test(dependsOnMethods = {"loginTest"}, suiteName = "Test Suite")
    public void postPictureTest() {
        System.out.println("Test");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test
    public void registerAccountTest() {
        System.out.println("Test3");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test(dependsOnMethods = {"registerAccountTest"})
    public void loginTest() {
        System.out.println("Test4");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test(testName = "Simple Test Method", description = "This test will be executed without dependency!!!")
    public void test() {
        System.out.println("Test without dependency");
    }
}
