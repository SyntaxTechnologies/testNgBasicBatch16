package REVIEW;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

//    your test case is going to be same
//    but the data that u will be using for testing is going to be changing

    @DataProvider(name="myData")
    public Object [] [] data(){

        Object[][] randomData = {
                {"A", "B", "C"},
                {"1", " 2", "3"},
                {"0", "0", "100"},
                {"343", "1e3", "34"}
        };
        return randomData;
    }
//    col1 inputA
//    col2 InputB
//    col3 InputC

    @Test(dataProvider = "myData")
    public void randomTest(String inputA,String inputB, String inputC){

        System.out.println(inputA);
        System.out.println(inputB);
        System.out.println(inputC);

        System.out.println("--------------------------------");
    }

}
