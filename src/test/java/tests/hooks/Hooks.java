package tests.hooks;

import org.testng.annotations.*;

public class Hooks {

    // Before hooks - preconditions

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method!");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test!");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite!");
    }




    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }


    // After hooks - post conditions
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method!");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class!");
    }

//    @AfterTest
//    public void afterTest() {
//        System.out.println("After Test!");
//    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite!");
    }
}
