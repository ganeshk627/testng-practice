package tests.assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import java.time.Duration;

public class HardAssertions {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }


    @Test
    public void loginTest1() {
        loginPage.fillUsername("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickLogin();
//        dashboardPage.verifyDashboard();

        try {
            Thread.sleep(5000);
        } catch (Exception e){}

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Url missmatching!");

        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",
                driver.getCurrentUrl(), "Url missmatching!!!");



    }

    @Test
    public void loginTest2() {
        loginPage.fillUsername("ganeshk");
        loginPage.fillPassword("ganesh123");
        loginPage.clickLogin();
//        dashboardPage.verifyDashboard();
        try {
            Thread.sleep(5000);
        } catch (Exception e){}

//        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Url missmatching!");

        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",
                "Url missmatching!!!");

//        Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"), "Url missmatching!");

    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
