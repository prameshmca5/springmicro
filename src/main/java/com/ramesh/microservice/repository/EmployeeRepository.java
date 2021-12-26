package com.ramesh.microservice.repository;

import com.ramesh.microservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    Optional<Employee> findByEmail(String Email);

    // Direct Query annotations
    @Query("select e from  Employee  e where e.firstName= ?1 and e.lastName= ?2")
    Employee findJpql(String firstName, String lastName);

    // Pass value to Named Params
    @Query("Select e from Employee e where e.firstName=:firstName and e.lastName=:lastName")
    Employee findJpqlParams(@Param("firstName") String firstName, @Param("lastName") String lastName);

    // Write Query from Native into JPQL to Native Querys
    @Query(value = "select * from employess e where e.first_name=?1 and e.last_name=?2", nativeQuery = true)
    Employee findQueryJpqlNative(String firstName, String lastName);

    // Write Query from Native into JPQL to Native Querys with Params
    @Query(value = "select * from employess e where e.first_name=:firstName and e.last_name=:lastName", nativeQuery = true)
    Employee findQueryJpqlNativeWithParams(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
