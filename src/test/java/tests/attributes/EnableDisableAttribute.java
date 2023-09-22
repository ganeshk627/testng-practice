package tests.attributes;

import org.testng.annotations.Test;

public class EnableDisableAttribute {

    @Test
    public void abc() {
        System.out.println("Test is executed!!!");
    }

    @Test
    public void def() {
        System.out.println("Test");
    }

    @Test(enabled = true) // default true
    public void xyz() {
        System.out.println("Test3");
    }

    @Test(enabled = false)
    public void hij() {
        System.out.println("Test4");
    }
}