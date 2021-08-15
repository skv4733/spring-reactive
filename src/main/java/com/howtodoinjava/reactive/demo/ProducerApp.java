package com.howtodoinjava.reactive.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ProducerApp {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProducerApp.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "3000"));
        app.run(args);
    }
} 
