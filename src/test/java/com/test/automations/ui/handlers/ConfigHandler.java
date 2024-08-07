package com.test.automations.ui.handlers;

import com.test.automations.ui.exceptions.TestScenarioFailedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigHandler {

    private final Properties properties;

    public ConfigHandler() {

        BufferedReader reader;
        String filePath = "src/test/resources/config.properties";

        try {

            reader = new BufferedReader(new FileReader(filePath));
            properties = new Properties();

            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {

                throw new TestScenarioFailedException();

            }

        } catch (FileNotFoundException e) {

            throw new TestScenarioFailedException();

        }

    }

    public String getUrl() {

        return properties.getProperty("test.url");

    }

    public String getBrowser(){

        return properties.getProperty("browser");

    }

}
