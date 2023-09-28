package tests;

import org.testng.annotations.*;

public class Hooks2 {

    // Before hooks

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method!");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class!");
    }




    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }


    // After hooks
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method!");
    }


    @AfterClass
    public void afterClass() {
        System.out.println("After Class!");
    }
}
