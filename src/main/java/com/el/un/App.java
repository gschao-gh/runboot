package com.el.un;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */

public class App {
    private static Logger LOGGER = LogManager.getLogger(App.class);

    String home() {
        LOGGER.info("hello world");

        return "Hello World!";
    }
}
