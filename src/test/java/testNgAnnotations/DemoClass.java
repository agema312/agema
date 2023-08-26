package testNgAnnotations;

import org.testng.annotations.*;

public class DemoClass {

    @BeforeClass
    public void demoBeforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void demoBefore(){
        System.out.println("Before Method");
    }

    @Test (groups = "groups1")
    public void demoTest1(){
        System.out.println("test1");
    }

    @Test (groups = "groups2")
    public void demoTest2(){
        System.out.println("test2");
    }

    @AfterMethod
    public void demoAfterMethod (){
        System.out.println("After Method");
    }

    @AfterClass
    public void demoAfterClass(){
        System.out.println("After Class");
    }

    @BeforeTest
    public void demoBeforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void demoAfterTest(){
        System.out.println("After Test");
    }

    @BeforeSuite
    public void demoBeforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void demoAfterSuite(){
        System.out.println("After Suite");
    }

    @BeforeGroups (groups = "groups1")
    public void demoBeforeGroups1(){
        System.out.println("Before Groups1");
    }

    @AfterGroups (groups = "groups1")
    public void demoAfterGroups1(){
        System.out.println("After Groups1");
    }

    @BeforeGroups (groups = "groups2")
    public void demoBeforeGroups2(){
        System.out.println("Before Groups2");
    }

    @AfterGroups (groups = "groups2")
    public void demoAfterGroups2(){
        System.out.println("After Groups2");
    }


}
