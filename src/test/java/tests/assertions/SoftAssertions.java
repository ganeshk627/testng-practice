package tests.assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import java.time.Duration;

public class SoftAssertions {




    @Test
    public void hardAssert() {
        System.out.println("hi, ");
        Assert.assertTrue(false, "failure!!!");
        System.out.println("testers!");
    }

    @Test
    public void softAssert() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("hi, ");
        softAssert.assertTrue(false, "failure 1");
        System.out.println("testers!");
        softAssert.assertFalse(false, "failure 2");
        softAssert.assertEquals("mani","kani", "failure 3");

        softAssert.assertAll();

    }




}
