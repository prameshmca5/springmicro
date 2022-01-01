package com.ramesh.microservice.controllerIntegrationTest;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.ramesh.microservice.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class ControllerITest {
    /*
    //@Autowired
    //private MockMvc mockMvc;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ObjectMapper objectMapper;

    // Junit for Get All Employee Details
    @Test
    public void givenEmbObj_whenCreateEmpl_thenReturnAllEmpObj() throws Exception {

        // Given - Setup
        List<depemp> listEmployee = new ArrayList<>();
       // listEmployee.add(depemp.builder().firstName("Ramesh").lastName("Pongiannan").email("ramesh@gmail.com").build());
       // listEmployee.add(depemp.builder().firstName("Laxshana").lastName("Ramesh").email("laxsha@gmail.com").build());
      //  BDDMockito.given(employeeService.getAllEmployee()).willReturn(listEmployee);

        // When - Action
        ResultActions responds = mockMvc.perform(MockMvcRequestBuilders.get("/api/employees"));
        // Then - Verify or Output
        responds.andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());

    }

     */
}
