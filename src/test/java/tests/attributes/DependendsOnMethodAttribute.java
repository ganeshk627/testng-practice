package tests.attributes;

import org.testng.annotations.Test;

public class DependendsOnMethodAttribute {

    @Test(dependsOnMethods = {"loginTest"})
    public void sendMessageTest() {
        System.out.println("Test is executed!!!");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test(dependsOnMethods = {"loginTest"})
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

    @Test
    public void test() {
        System.out.println("Test without dependency");
    }
}
