package REVIEW;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class annotation3 {

    @BeforeTest
    public void btest(){
        System.out.println("i am before TEST");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("i am after TEST");
    }
}
