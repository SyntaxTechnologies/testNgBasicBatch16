package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {
    @Test
    public void afirstTestCase(){
        System.out.println("First test case");
    }
    @Test
    public void bSecondTestCase(){
        System.out.println("Second test case");
    }
    @Test
    public void cThirdTestCase(){
        System.out.println("Third test case");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
}

