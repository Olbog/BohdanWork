package main.java;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoggerRunner {

    public static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);
    public static void main(String[] args) {
        LOGGER.info("LOGGER INFO");
        LOGGER.debug("LOGGER DEBUG");
        LOGGER.error("LOGGER ERROR");

    }
}
