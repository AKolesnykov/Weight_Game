package com.game.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static final Properties properties = new Properties();

    static {
        try (FileInputStream in = new FileInputStream("configuration.properties")){
            properties.load(in);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Failed to load properties file");
        }
    }

    public static String getProperty(String key){ return properties.getProperty(key); }
}
