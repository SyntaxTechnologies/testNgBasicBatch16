package class01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled= false)
    public void Atest(){
        System.out.println("i am test A");
    }
    @Test
    public void Btest(){
        System.out.println("i am test B");
    }
    @Test
    public void Ctest(){
        System.out.println("i am test C");
    }
}

