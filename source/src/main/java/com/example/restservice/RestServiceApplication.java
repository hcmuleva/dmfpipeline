package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {
    public String greet(String name){
        return "Welcome to "+name+" World!!!!";
    }
    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
