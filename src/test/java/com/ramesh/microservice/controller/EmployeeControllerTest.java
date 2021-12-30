package com.ramesh.microservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.ramesh.microservice.model.Employee;
import com.ramesh.microservice.service.EmployeeService;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebMvcTest
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Autowired
    private ObjectMapper objectMapper;

    // Junit for Get All Employee Details
   @Test
   public void givenEmbObj_whenCreateEmpl_thenReturnAllEmpObj() throws Exception {

       // Given - Setup
        List<Employee> listEmployee = new ArrayList<>();
       listEmployee.add(Employee.builder().firstName("Ramesh").lastName("Pongiannan").email("ramesh@gmail.com").build());
       listEmployee.add(Employee.builder().firstName("Laxshana").lastName("Ramesh").email("laxsha@gmail.com").build());
       BDDMockito.given(employeeService.getAllEmployee()).willReturn(listEmployee);

       // When - Action
       ResultActions responds = mockMvc.perform(MockMvcRequestBuilders.get("/api/employees"));
       // Then - Verify or Output
       responds.andExpect(MockMvcResultMatchers.status().isOk())
               .andDo(MockMvcResultHandlers.print());

   }

      // Junit for POSITIVE TEST
      @Test
      public void givenemployeeDetails_whenGetEmployeeIDPossitive_thenGetEmployeeIDDetails() throws Exception {
         // Given - Setup
          Long employeeId = 100L;
          Employee employee = Employee.builder().firstName("Ramesh").lastName("Pongiannan").email("ramesh@gmail.com").build();
          BDDMockito.given(employeeService.getEmployeeById(employeeId)).willReturn(Optional.of(employee));
          // When - Action
            ResultActions response =  mockMvc.perform(MockMvcRequestBuilders.get("/api/employees/{id}", employeeId));
          // Then - Verify or Output
          ResultActions resultActions = response.andExpect(MockMvcResultMatchers.status().isOk()).andDo(print());

      }

    // Junit for NEGATIVE TEST
    @Test
    public void givenemployeeDetails_whenGetEmployeeIDNegative_thenGetEmployeeIDDetails() throws Exception {
        // Given - Setup
        Long employeeId = 100L;
        Employee employee = Employee.builder().firstName("Ramesh").lastName("Pongiannan").email("ramesh@gmail.com").build();
        BDDMockito.given(employeeService.getEmployeeById(employeeId)).willReturn(Optional.empty());
        // When - Action
        ResultActions response =  mockMvc.perform(MockMvcRequestBuilders.get("/api/employees/{id}", employeeId));
        // Then - Verify or Output
        ResultActions resultActions = response.andExpect(MockMvcResultMatchers.status().isNotFound()).andDo(print());
    }

}
