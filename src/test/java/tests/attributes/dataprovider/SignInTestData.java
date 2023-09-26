package tests.attributes.dataprovider;

import org.testng.annotations.DataProvider;

public class SignInTestData {

    @DataProvider(name = "signin-data")
    Object[][] loginData() {
        Object[][] data = {
                {"admin", "admin123"},
                {"ganeshk", "gane123"},
                {"krithik", "krith321"},
        };


        return data;
    }
}
