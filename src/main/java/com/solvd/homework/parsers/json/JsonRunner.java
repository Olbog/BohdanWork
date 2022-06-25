package com.solvd.homework.parsers.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonRunner {
    private static final Logger LOGGER = LogManager.getLogger(JsonRunner.class);
    private static File file = new File(System.getProperty("user.dir") + "/src/main/resources/jackson.json");

    public static void serialize(Driver driver) {
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        try {
            List<Driver> drivers = new ArrayList<>();
            drivers.add(driver);
            objectMapper.writeValue(file, drivers);
            LOGGER.info("All right with serialization: " + file.getPath());
        } catch (JsonProcessingException e) {
            LOGGER.info("JsonProcessingException", e);
        } catch (IOException e) {
            LOGGER.info(e);
        }
        }


    public static void deserialize() {
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        JavaType type = objectMapper.getTypeFactory().constructCollectionType(List.class, Driver.class);
        try {
            List<Driver> drivers = objectMapper.readValue(file, type);
            LOGGER.info("All right with deserialized: " + file.getPath());
            LOGGER.info(drivers);
        } catch (IOException e) {
            LOGGER.info("Error", e);
        }
    }

    public static void main(String[] args) {
        Driver driver = new Driver();

        CarDriver carDriver = new CarDriver();
        carDriver.setName("Izi");
        carDriver.setSurname("Morales");
        carDriver.setBirthday("02.07.1992");
        driver.getCarDriver();
        serialize(driver);


    }
}

