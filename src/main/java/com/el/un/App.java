package com.el.un;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
public class App {

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }
}
