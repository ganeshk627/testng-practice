package tests.attributes;

import org.testng.annotations.Test;

public class GroupsAttribute {

    @Test(groups = {"regression"})
    public void sendMessageTest() {
        System.out.println("Test is executed!!!");

    }

    @Test(groups = {"regression"})
    public void postPictureTest() {
        System.out.println("Test");

    }

    @Test(groups = {"smoke"})
    public void registerAccountTest() {
        System.out.println("Test3");
    }

    @Test(groups = {"smoke"})
    public void loginTest() {
        System.out.println("Test4");

    }

    @Test(groups = {"smoke", "regression"})
    public void test1() {
        System.out.println("Test without dependency");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

}
