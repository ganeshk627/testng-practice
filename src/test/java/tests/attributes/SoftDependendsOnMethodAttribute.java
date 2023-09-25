package tests.attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftDependendsOnMethodAttribute {

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


    @Test(dependsOnMethods = {"loginTest"}, alwaysRun = true)
    public void viewPictureTest() {
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
        WebDriver driver = new ChromeDriver();
        driver.close();
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        System.out.println("Test without dependency");
    }
}
