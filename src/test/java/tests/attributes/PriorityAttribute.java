package tests.attributes;

import org.testng.annotations.Test;

public class PriorityAttribute {

    @Test(priority = 2)
    public void abc() {
        System.out.println("Test is executed!!!");
    }

    @Test(priority = 3)
    public void def() {
        System.out.println("Test");
    }

    @Test(priority = -3)
    public void neg() {
        System.out.println("Test");
    }

    @Test
//    @Test(priority = 0) // default priority 0
    public void xyz() {
        System.out.println("Test3");
    }

    @Test(priority = 1)
    public void hij() {
        System.out.println("Test4");
    }
}
