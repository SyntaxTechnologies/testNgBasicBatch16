package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNgExample {

    //    ----Test1---
//    goto syntax Hrms
//    enter the username and password , verify that u logged in
//    close the browser

    //    /    ----Test2---
//    goto syntax Hrms
//    verify the  password is there
//    close the browser
    public static WebDriver driver;

    @BeforeMethod
    public void OpenAndLaunchBrowser() {
//    webdriver    /
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    public void closeBroswer() {
        driver.close();
    }

//    ----Test1---
//    goto syntax Hrms
//    enter the username and password , verify that u logged in
//    close the browser

    @Test
    public void verifyThatUserCanLogin() {
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();
    }


    @Test
    public  void verifyPasswordBoxIsThere() {
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println(password.isDisplayed());
    }

}


