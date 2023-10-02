package tests.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import java.time.Duration;


//@Listeners(tests.listeners.MyListener.class)
public class LoginTests {

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
        dashboardPage.verifyDashboard();
    }

    @Test
    public void loginTest2() {
        loginPage.fillUsername("ganeshk");
        loginPage.fillPassword("ganesh123");
        loginPage.clickLogin();
        dashboardPage.verifyDashboard();
    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
