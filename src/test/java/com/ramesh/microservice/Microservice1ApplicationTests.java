package com.ramesh.microservice;


import com.ramesh.microservice.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Microservice1ApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {

    }

}
