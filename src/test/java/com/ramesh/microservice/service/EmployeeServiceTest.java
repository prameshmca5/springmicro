package com.ramesh.microservice.service;


import com.ramesh.microservice.repository.EmployeeRepository;
import com.ramesh.microservice.service.impl.EmployeeServiceImpl;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

//@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
/*
    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private depemp employee;

    @BeforeEach
    private void setup(){
        employee = depemp.builder()
               .firstName("Ramesh").lastName("Pongiannan")
               .email("rameshkp2@gmail.com")
               .build();
    }

    // Junit for SaveEmployee Method
    @DisplayName("Junit test for ServiceLayer Employee Method")
   @Test
   public void givenEmpObj_whenSaveEmployee_thenReturnEmployeeObj(){

   // Given - Setup


       BDDMockito.given(employeeRepository.findByEmail(employee.getEmail()))
               .willReturn(Optional.empty());
        BDDMockito.given(employeeRepository.save(employee)).willReturn(employee);
        System.out.println(employeeRepository);
        System.out.println(employee);
       // When - Action
    depemp savedEmployee = employeeService.saveEmployee(employee);
   // Then - Verify or Output
        System.out.println(savedEmployee);
        assertThat(savedEmployee).isNotNull();
   }

    // Junit for SaveEmployee Method
    @DisplayName("Junit test for ServiceLayer Employee Method Exception")
    @Test
    public void givenEmpObj_whenSaveEmployee_thenReturnEmployeeObjWithException(){

        // Given - Setup


        BDDMockito.given(employeeRepository.findByEmail(employee.getEmail()))
                .willReturn(Optional.of(employee));

        BDDMockito.given(employeeRepository.save(employee)).willReturn(employee);
        System.out.println(employeeRepository);
        System.out.println(employee);
        // When - Action
        depemp savedEmployee = employeeService.saveEmployee(employee);
        // Then - Verify or Output
        System.out.println(savedEmployee);
        assertThat(savedEmployee).isNotNull();
    }


    // Junit for SaveEmployee Method
    @DisplayName("Junit test for ServiceLayer Employee Method")
    @Test
    public void givenEmpObj_whenSaveEmployee_thenReturnEmployeeObjWithAllEmployee(){

        // Given - Setup
        depemp employee2 = depemp.builder()
                .firstName("Ramesh2").lastName("Pongiannan2")
                .email("rameshkp22@gmail.com")
                .build();
        employeeRepository.save(employee2);
        BDDMockito.given(employeeRepository.findAll()).willReturn(Collections.emptyList());

        // When - Action
        List<depemp> employeeList = employeeRepository.findAll();
        // Then - Verify or Output
        assertThat(employeeList).isEmpty();
        assertThat(employeeList.size()).isEqualTo(0);
    }

    // Junit for SaveEmployee Method
    @DisplayName("Junit test for ServiceLayer Employee ById")
    @Test
    public void givenEmpObj_whenSaveEmployee_thenReturnEmployeeObjWithEmployeeById(){

        // Given - Setup
        BDDMockito.given(employeeRepository.findById(employee.getId())).willReturn(Optional.of(employee));
        // When - Action
        depemp saveEmployee = employeeService.getEmployeeById(employee.getId()).get();
        // Then - Verify or Output
        assertThat(employee).isNotNull();
        //assertThat(employee.getId()).isGreaterThan(0);
    }

 */
}
