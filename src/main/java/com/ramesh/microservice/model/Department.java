package com.ramesh.microservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "depid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer depid;

    @Column(name = "dep_empid")
    private Integer depEmpid;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="empid", insertable=false, updatable=false)
    private Employee employee;

    @Column(name = "dep_name")
    private String depName;

    @Column(name = "dep_email")
    private String depEmail;

    @Column(name = "dep_phone")
    private String depPhone;

    @Column(name = "dep_status")
    private String depStatus;

}
