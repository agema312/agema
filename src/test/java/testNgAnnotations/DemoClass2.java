package testNgAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass2 {

    public int sum(int a, int b){
        return a+b;
    }

    @Test
    public void testSum(){
        Assert.assertEquals(sum(10,20),30);
    }
}
