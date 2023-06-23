package REVIEW;

import org.testng.annotations.Test;

public class enableDisable {

    @Test(enabled = false)
    public void hello(){
        System.out.println("heloooooooooo");
    }

    @Test
    public  void funcA(){
        System.out.println( (5/1));
    }

    @Test(dependsOnMethods = "funcA")
    public void funcB(){
        System.out.println("i am dependent on A");
    }
}
