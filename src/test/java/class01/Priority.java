package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 4)
    public void Atest(){
        System.out.println("i am test A");
    }
    @Test(priority = 3)
    public void Btest(){
        System.out.println("i am test B");
    }
    @Test(priority = 2)
    public void Ctest(){
        System.out.println("i am test C");
    }
    @Test(priority = 1)
    public void Dtest(){
        System.out.println("i am test D");
    }
    @Test
    public void ABtest(){
        System.out.println("i am test D");
    }
//    names with no priority beside them are the highest priority
}

