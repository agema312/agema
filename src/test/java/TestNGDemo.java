import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {
    @Test
    public void createNewUserTest(){
        User firstUser = new User("John", 30);
        Assert.assertNotNull(firstUser);
    }

    @Test(dependsOnMethods = "createNewUserTest")  // что бы не дублировать предыдущий тест мы копируем в  dependsOnMethods название теста "createNewUserTest"
    public void loginTest(){
        Assert.assertTrue(true);
        }

    }

