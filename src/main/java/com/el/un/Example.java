package com.el.un;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2016/9/7.
 */

@SpringBootApplication
//@EnableScheduling
@ComponentScan(basePackages = { "*" })
public class Example {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}
