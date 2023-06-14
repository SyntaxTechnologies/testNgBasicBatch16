package class01;

import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void Login(){

        System.out.println("I am testing login page");
    }


    @Test(dependsOnMethods = {"Login"})
    public void TestDashBoardPage(){
        System.out.println("Iam testing dashboard page");
    }
}
