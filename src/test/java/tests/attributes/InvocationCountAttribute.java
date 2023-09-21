package tests.attributes;

import org.testng.annotations.Test;

public class InvocationCountAttribute {

    @Test(invocationCount = 5)
    public void abc() {
        System.out.println("Test is executed!!!");
    }

    @Test
    public void def() {
        System.out.println("Test");
    }

    @Test(invocationCount = 1)
    public void xyz() {
        System.out.println("Test3");
    }

    @Test(invocationCount = 4)
    public void hij() {
        System.out.println("Test4");
    }
}
