package tests;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadTest {

    @Test
    public void configReadandSet() {
        Properties properties = new Properties();

        System.out.println(properties.getProperty("url"));
        properties.setProperty("url", "https://google.com/");
        System.out.println(properties.getProperty("url"));

    }

    @Test
    public void configFromFile() throws IOException {


        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");


        Properties properties = new Properties();
        properties.load(fis);

        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("username.admin"));
        System.out.println(properties.getProperty("password.admin"));
        System.out.println(properties.getProperty("password.user"));
        properties.setProperty("password.user", "user@123");
        System.out.println(properties.getProperty("password.user"));

    }
}
