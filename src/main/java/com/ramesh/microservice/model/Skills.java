package com.ramesh.microservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@RequiredArgsConstructor
@Entity
@Table(name = "skills")
public class Skills {
    @Id
    @Column(name = "skid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer skid;

    @Column(name = "sk_empid")
    private Integer skEmpid;

    @Column(name = "sk_name")
    private String skName;

    @Column(name = "sk_status")
    private String skStatus;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="empid", insertable=false, updatable=false)
    private Employee employee;

}
