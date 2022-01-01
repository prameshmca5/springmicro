package com.ramesh.microservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "empid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empid;

    @Column(name = "emp_firstname")
    private String firstName;

    @Column(name = "emp_lastname")
    private String lastName;

    @Column(name = "emp_email")
    private String email;

    @Column(name = "emp_salary")
    private Float salary;

    @Column(name = "emp_age")
    private Integer age;

    @Column(name = "emp_yearofjoin")
    private Integer yearofjoin;

    @Column(name = "emp_gender")
        private String gender;

    @Column(name = "emp_status")
    private String status;

    @OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "dep_empid")
    private List<Department> departmentList;

}
