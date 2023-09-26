package tests.attributes.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest {


//    @Test
//    public void loginTest1(){
//        System.out.println("admin" + "admin123");
//    }
//
//    @Test
//    public void loginTest2(){
//        System.out.println("ganeshk" + "gan123");
//    }
//
//    @Test
//    public void loginTest3(){
//        System.out.println("krithik" + "krithik321");
//    }

    @Test(dataProvider = "login-data")
    public void loginTest(String username, String password){
        System.out.println( username + " " + password);
    }

    @Test(dataProvider = "signin-data", dataProviderClass = SignInTestData.class)
    public void signInTest(String username, String password){
        System.out.println( username + " " + password);
    }


    @DataProvider(name = "login-data")
    Object[][] loginData() {
        Object[][] data = {
                {"admin", "admin123"},
                {"ganeshk", "gane123"},
                {"krithik", "krith321"},
        };
        return data;
    }

}
