package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertions {
//    goto HRMS
//    enter username
//    enter wrong password
//    click on login
//    verify that the error message Invalid credentials is displayed
//    also confirm that the error message is Displayed

//    i will put in pre conditions for my test case in the Before Method

    public static WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void OpenBrowserAndNavigate(){
        driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

//    post conditions
    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
//        driver.quit();
    }

//    test  case 1:
    @Test(groups = "smoke")
    public void verifyTheErrorMessage(){
//        send username
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
//       send password
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("abracadabra");

//        click login
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

//        get the error messsage
        WebElement errorMsg = driver.findElement(By.id("spanMessage"));

        String actualErrorMessage = errorMsg.getText();
        String expectedErrorMessage="Invalid credential";

//        comparing two strings , which assertion to use
        Assert.assertEquals( actualErrorMessage,expectedErrorMessage);
        System.out.println("check that assert number 2 is runing or not");
//        check if it is displayed
        boolean errorMsgIsDisplayed = errorMsg.isDisplayed();
        Assert.assertTrue(errorMsgIsDisplayed);

    }

}
