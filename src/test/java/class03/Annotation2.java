package class03;

import org.testng.annotations.*;

public class Annotation2 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("i am before class");
    }
    @AfterClass
    public  void afterClass(){
      System.out.println(" i am after class");
      }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("i am a before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println(" i am after method");
    }
    @Test
    public void AFirstTestCase(){
        System.out.println("i am the first test case");
    }

    @Test
    public void BSecondTestCase(){
        System.out.println("i am second test case");
    }

    @Test
    public  void ThirdTestCase(){
        System.out.println("i am third test case");
    }

}
