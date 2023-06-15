package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftAssertions {
//    percondition

//    login into the syntax HRMS APP
//    verify that the Welcome message is displayed
//    verify that the message is  "Welcome Admin"
public static WebDriver driver;
    @BeforeMethod
    public void OpenBrowserAndNavigate(){
        driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    //    post conditions
    @AfterMethod
    public void closeBrowser(){
//        driver.quit();
    }

    @Test
    public void verifyTheWelcomeMessage(){
//        /        send username
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
//       send password
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

//        click login
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

//        get the mesaage
        WebElement welcomeMsg = driver.findElement(By.id("welcome"));


//        verify is displayed
        boolean isDisplayed = welcomeMsg.isDisplayed();
        SoftAssert soft= new SoftAssert();
        soft.assertTrue(isDisplayed);

//        verify the message is welcome admin
        String actualWelcomeText = welcomeMsg.getText();
        String expectedWelcomeText="Welcome Admin";
        soft.assertEquals(actualWelcomeText,expectedWelcomeText);
        //  assert all the assertions that have been made
        soft.assertAll();

    }
}
