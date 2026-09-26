package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestConfig {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = TestConfig.class.getClassLoader().getResourceAsStream("local.properties")) {

            if (input == null) {
                throw new IllegalStateException("properties not found");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new IllegalStateException("Failed load properties", e);
        }
    }

    public static Credentials testUser() {
        return new Credentials(getRequired("test.username"), getRequired("test.password"));
    }

    public static String baseUrl() {
        return getRequired("base.url");
    }

    public static String inventoryUrl() {
        return baseUrl() + "inventory.html";
    }

    private static String getRequired(String key) {
        String value = properties.getProperty(key);

        if (value == null || value.isBlank()) {
            throw new IllegalStateException("properties not found: " + key);
        }

        return value;
    }

    public static String dataTablesHerokuappUrl() {
        return getRequired("data.tables.herokuapp.url");
    }

    public static String dynamicLoadingUrl() {
        return getRequired("dynamic.loading.url");
    }

    public static String loginUrl() {
        return getRequired("login.url");
    }
}