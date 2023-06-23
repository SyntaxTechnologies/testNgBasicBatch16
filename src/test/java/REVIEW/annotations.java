package REVIEW;

import org.testng.annotations.*;

public class annotations {

    @BeforeClass
    public void beforeClass(){
        System.out.println("i am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("i am after class");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("i am before");
    }

    @AfterMethod
    public  void afterMethod(){
        System.out.println("i am after");
    }
    @Test
    public void testA(){
        System.out.println("i am test");
    }
    @Test
    public void testB(){
        System.out.println("i am testB");
    }

}
