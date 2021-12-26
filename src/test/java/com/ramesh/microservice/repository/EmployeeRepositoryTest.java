package com.ramesh.microservice.repository;

import com.ramesh.microservice.model.Employee;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class EmployeeRepositoryTest {


    @Autowired
    public EmployeeRepository employeeRepository;

    // BDD Model Test -> Behavioral Data Driven
    // Given - When - Then

    @DisplayName("Junit test for Employee Model")
    @Test
    public void givenEmployeeObj_whenSave_thenReturnSavedEmployee() {
        // Given - Setup
        Employee employee = Employee.builder()
                .firstName("Ramesh")
                .lastName("Pongiannan")
                .email("ramesh@gmail.com")
                .build();

        // When - action
        Employee saveEmployee = employeeRepository.save(employee);
        // Then - verify the output
        assertThat(saveEmployee).isNotNull();
        assertThat(saveEmployee.getId()).isGreaterThanOrEqualTo(0);
    }

   // Junit for get All Employee details
   @DisplayName("Get All Employee Details")
   @Test
   public void givenEmployeeList_whenFindAll_thenEmployeeList(){

       // Given - Setup
       Employee employee1 = Employee.builder()
               .firstName("Ramesh")
               .lastName("Pongiannan")
               .email("ramesh@gmail.com")
               .build();

       Employee employee2 = Employee.builder()
               .firstName("Ramesh2")
               .lastName("Pongiannan2")
               .email("ramesh2@gmail.com")
               .build();
       employeeRepository.save(employee1);
       employeeRepository.save(employee2);

       // When - Action
       List<Employee> employeeList = employeeRepository.findAll();

       // Then - Verify or Output
       assertThat(employeeList).isNotNull();
       assertThat(employeeList.size()).isEqualTo(2);
   }

   // Junit for Get Employee by Id
  @DisplayName("Get Employee by Id")
  @Test
  public void givenEmployee_whenFindbyId_thenEmloyeeDetails(){

      // Given - Setup
      Employee employee3 = Employee.builder()
              .firstName("Ramesh")
              .lastName("Pongiannan")
              .email("ramesh@gmail.com")
              .build();
      employeeRepository.save(employee3);
      // When - Action
      Employee emp = employeeRepository.findById(employee3.getId()).get();
      // Then - Verify or Output
      assertThat(emp).isNotNull();
      assertThat(emp).isEqualTo(1);
  }

  // Junit for
    @DisplayName("EmpolyeeDetailsgettingEmail")
  @Test
  public void givenEmployee_whenFindbyEmail_thenEmployeeDetails() {

      // Given - Setup
      Employee employee4 = Employee.builder()
              .firstName("Ramesh")
              .lastName("Pongiannan")
              .email("ramesh@gmail.com")
              .build();
      employeeRepository.save(employee4);
      // When - Action
      Employee emp = employeeRepository.findByEmail(employee4.getEmail()).get();
      // Then - Verify or Output
      assertThat(emp).isNotNull();
      assertThat(emp).isEqualTo(1);
  }
}
