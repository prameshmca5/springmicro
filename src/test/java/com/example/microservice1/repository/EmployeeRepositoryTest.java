package com.example.microservice1.repository;

import com.example.microservice1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeRepositoryTest {


    @Autowired
    private EmployeeRepository employeeRepository;

    // BDD Model Test -> Behavioral Data Driven
    // Given - When - Then

    public void givenEmployeeObj_whenSave_thenReturnSavedEmployee() {
        // Given - Setup
        Employee employee = Employee.builder()
                .firstName("Ramesh")
                .lastName("Pongiannan")
                .email("ramesh@gmail.com")
                .build();

        // When - action
        Employee saveEmployee =  employeeRepository.save();
    }

}
