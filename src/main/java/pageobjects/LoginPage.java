package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;
//    private static final By USERNAME = By.name("username");
    @FindBy(name = "username")
    private WebElement USERNAME;

//    private static final By PASSWORD = By.xpath("//input[@name='password']");
    @FindBy(xpath = "//input[@name='password']")
    private WebElement PASSWORD;
//    private static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement LOGIN_BUTTON;


    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


    public void fillUsername(String username) {
//        ldriver.findElement(USERNAME).clear();
//        ldriver.findElement(USERNAME).sendKeys(username);
        USERNAME.clear();
        ldriver.navigate().refresh();
//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {}
        USERNAME.sendKeys(username);
    }

    public void fillPassword(String password) {
//        ldriver.findElement(PASSWORD).clear();
//        ldriver.findElement(PASSWORD).sendKeys(password);
        PASSWORD.clear();
        PASSWORD.sendKeys(password);
    }

    public void clickLogin() {
//        ldriver.findElement(LOGIN_BUTTON).click();
        LOGIN_BUTTON.click();
    }

}
