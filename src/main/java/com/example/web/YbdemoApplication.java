package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class YbdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YbdemoApplication.class, args);
    }

}
