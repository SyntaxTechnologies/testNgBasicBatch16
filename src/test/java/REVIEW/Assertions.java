package REVIEW;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

public class Assertions {
    //    whenever hard assertions have been implemented
//    a failure of one Assertion leads to dismissal of the test case
//    and it never even checks for other assertions
    @Test
    public void hardAssert(){
//        i am getting this information from the WebElement ona Website
        String actualName="moazzam";
        String actualDesignation="softwareEngineer";

        Assert.assertEquals(actualName,"moazzam");
        System.out.println("hello i am here");
        Assert.assertEquals(actualDesignation,"softwareEngineer");

    }

//    soft assertions
//    no matter if your assertion fails, it will still continue to check other assertions
    @Test
    public void softAssert(){
        //        i am getting this information from the WebElement on a Website
        String actualName="moazza";
        String actualDesignation="softwareEngineer";

// declare the isntance
        SoftAssert soft= new SoftAssert();
        soft.assertEquals(actualName,"moazzam");
        System.out.println("hello i am here");
        soft.assertEquals(actualDesignation,"softwareEngineer");
        soft.assertAll();

    }


}
