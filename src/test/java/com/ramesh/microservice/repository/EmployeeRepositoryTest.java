package com.ramesh.microservice.repository;

import com.ramesh.microservice.model.Employee;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
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

    private Employee employee;

    @BeforeEach
    public void setup(){
        employee = Employee.builder()
                .firstName("Ramesh")
                .lastName("Pongiannan")
                .email("ramesh@gmail.com")
                .build();
    }

    // BDD Model Test -> Behavioral Data Driven
    // Given - When - Then

    @DisplayName("Junit test for Employee Model")
    @Test
    public void givenEmployeeObj_whenSave_thenReturnSavedEmployee() {
        // Given - Setup
      /*  Employee employee = Employee.builder()
                .firstName("Ramesh")
                .lastName("Pongiannan")
                .email("ramesh@gmail.com")
                .build();
        */
        // When - action
        Employee saveEmployee = employeeRepository.save(employee);
        // Then - verify the output
        assertThat(saveEmployee).isNotNull();
        assertThat(saveEmployee.getId()).isGreaterThan(0);
    }

   // Junit for get All Employee details
   @DisplayName("Get All Employee Details")
   @Test
   public void givenEmployeeList_whenFindAll_thenEmployeeList(){

       // Given - Setup
      /*   Employee employee1 = Employee.builder()
               .firstName("Ramesh")
               .lastName("Pongiannan")
               .email("ramesh@gmail.com")
               .build();
*/
       Employee employee2 = Employee.builder()
               .firstName("Ramesh2")
               .lastName("Pongiannan2")
               .email("ramesh2@gmail.com")
               .build();
       employeeRepository.save(employee);
       employeeRepository.save(employee2);

       // When - Action
       List<Employee> employeeList = employeeRepository.findAll();

       // Then - Verify or Output
       assertThat(employeeList).isNotNull();
       assertThat(employeeList.size()).isGreaterThan(0);
   }

   // Junit for Get Employee by Id
  @DisplayName("Get Employee by Id")
  @Test
  public void givenEmployee_whenFindbyId_thenEmloyeeDetails(){

      // Given - Setup
    /*    Employee employee3 = Employee.builder()
              .firstName("Ramesh")
              .lastName("Pongiannan")
              .email("ramesh@gmail.com")
              .build();

     */
      employeeRepository.save(employee);
      // When - Action
      Optional<Employee> emp = employeeRepository.findById(employee.getId());
      // Then - Verify or Output
      assertThat(emp.get().getId()).isNotNull();
      assertThat(emp.get().getId()).isGreaterThan(0);
  }

  // Junit for
    @DisplayName("EmpolyeeDetailsgettingEmail")
  @Test
  public void givenEmployee_whenFindbyEmail_thenEmployeeDetails() {

      // Given - Setup
     /*   Employee employee4 = Employee.builder()
              .firstName("Ramesh")
              .lastName("Pongiannan")
              .email("ramesh44@gmail.com")
              .build();

      */
      employeeRepository.save(employee);
      // When - Action
      Optional<Employee> emp = employeeRepository.findByEmail(employee.getEmail());
      // Then - Verify or Output
      assertThat(emp.get().getEmail()).isNotNull();
      assertThat(emp.get().getEmail()).isEqualTo("ramesh@gmail.com");
  }

     // Junit for Update Employee details
    @DisplayName("UpdateEmployeeDetails")
     @Test
     public void givenEmployee_whenUpdateEmployee_thenGetEmployeeDetails(){

         // Given - Setup
     /*     Employee employee4 = Employee.builder()
                .firstName("Ramesh")
                .lastName("Pongiannan")
                .email("ramesh44@gmail.com")
                .build();

      */
        employeeRepository.save(employee);
         // When - Action
        Optional<Employee> emp = employeeRepository.findByEmail(employee.getEmail());
        emp.get().setEmail("Laxsha@gmail.com");
        employeeRepository.save(emp.get());
         // Then - Verify or Output
        assertThat(emp.get().getEmail()).isNotNull();
        assertThat(emp.get().getEmail()).isEqualTo("Laxsha@gmail.com");
     }

    // Junit for Update Employee details
    @DisplayName("DeleteEmployeeDetails")
    @Test
    public void givenEmployee_whenDeleteEmployee_thenGetEmployeeDetails(){

        // Given - Setup
       /*   Employee employee4 = Employee.builder()
                .firstName("Ramesh")
                .lastName("Pongiannan")
                .email("ramesh44@gmail.com")
                .build();

        */
        employeeRepository.save(employee);
        // When - Action
        Optional<Employee> emp = employeeRepository.findById(employee.getId());
       // emp.get().setEmail("Laxsha@gmail.com");
        employeeRepository.delete(emp.get());
        // Then - Verify or Output
        assertThat(emp).isNotNull();
       assertThat(emp.get().getId()).isGreaterThan(0);
    }

    // Junit for Get Custom Query
    @DisplayName("EmployeeDetailsGetCustomQueryforJPQL")
    @Test
    public void givenEmployee_whenGetCustomJPQL_thenGetJpqlResult(){

       // Given - Setup

       // When - Action
        employeeRepository.save(employee);
        employee.setFirstName("Ramesh");
        employee.setLastName("Pongiannan");
        employee = employeeRepository.findJpql(employee.getFirstName(), employee.getLastName());
       // Then - Verify or Output
        assertThat(employee).isNotNull();
        assertThat(employee.getId()).isGreaterThan(0);
    }
    // Junit for Get Custom Query
    @DisplayName("EmployeeDetailsGetCustomQueryforJPQLNameParams")
    @Test
    public void givenEmployee_whenGetCustomJPQLNamedParams_thenGetJpqlResult(){

        // Given - Setup

        // When - Action
        employeeRepository.save(employee);
        employee.setFirstName("Ramesh");
        employee.setLastName("Pongiannan");
        employee = employeeRepository.findJpqlParams(employee.getFirstName(), employee.getLastName());
        // Then - Verify or Output
        assertThat(employee).isNotNull();
        assertThat(employee.getId()).isGreaterThan(0);
    }

    // Junit for Get Custom Query
    @DisplayName("EmployeeDetailsGetCustomQueryforJPQLNative")
    @Test
    public void givenEmployee_whenGetCustomJPQLNative_thenGetJpqlResult(){

        // Given - Setup

        // When - Action
        employeeRepository.save(employee);
       // employee.setFirstName("Ramesh");
       // employee.setLastName("Pongiannan");
        employee = employeeRepository.findQueryJpqlNative(employee.getFirstName(), employee.getLastName());
       // employee = employeeRepository.findQueryJpqlNative("Ramesh", "Pongiannan");
        // Then - Verify or Output
        assertThat(employee).isNotNull();
        assertThat(employee.getId()).isGreaterThan(0);
    }

    // Junit for Get Custom Query
    @DisplayName("EmployeeDetailsGetCustomQueryforJPQLNativeWithParams")
    @Test
    public void givenEmployee_whenGetCustomJPQLNativeWithParams_thenGetJpqlResult(){

    // Given - Setup

    // When - Action
    employeeRepository.save(employee);
    // employee.setFirstName("Ramesh");
    // employee.setLastName("Pongiannan");
    employee = employeeRepository.findQueryJpqlNativeWithParams(employee.getFirstName(), employee.getLastName());
    // employee = employeeRepository.findQueryJpqlNative("Ramesh", "Pongiannan");
    // Then - Verify or Output
    assertThat(employee).isNotNull();
    assertThat(employee.getId()).isGreaterThan(0);
}
}
