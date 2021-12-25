package com.ramesh.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.*", "com.ramesh.*"})
public class Microservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservice1Application.class, args);
    }

}
