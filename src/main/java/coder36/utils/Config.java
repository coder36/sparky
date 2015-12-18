package coder36.utils;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.InputStream;
import java.util.HashMap;

public class Config {

    private Mash mash;
    private static Config config;

    public Config() {
        try {
            String env = System.getProperty("env", "dev");
            InputStream is = getClass().getClassLoader().getResourceAsStream("config.json");
            mash = new Mash(new ObjectMapper().readValue(is, HashMap.class));

            mash = (Mash) mash.get(env);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String config(String path) {
        if( config == null ) config = new Config();
        return config.mash.get_s(path);
    }
}
