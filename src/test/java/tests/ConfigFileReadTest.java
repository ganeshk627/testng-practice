package tests;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

        // reading config file
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
//        FileInputStream env = new FileInputStream("src/test/resources/env.properties");

        // loading properties to 'properties' object
        Properties properties = new Properties();
        properties.load(fis);
//        properties.load(env);

        // reading and writing property values
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("username.admin"));
        System.out.println(properties.getProperty("password.admin"));
        System.out.println(properties.getProperty("password.user"));
        properties.setProperty("username.user", "ganeshk");
        properties.setProperty("password.user", "user@123");
        System.out.println(properties.getProperty("password.user"));


        // saving all the properties to property file
        FileOutputStream fos = new FileOutputStream("src/test/resources/config1.properties");
        properties.store(fos, null);

    }
}
