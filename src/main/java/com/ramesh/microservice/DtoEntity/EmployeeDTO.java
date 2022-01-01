package com.ramesh.microservice.DtoEntity;

public class EmployeeDTO {
    private Integer empid;
    private String empFirstname;
    private String empLastname;
    private String empEmail;
    private Float empSalary;
    private Integer empAge;
    private Integer empYearofjoin;
    private String empGender;
    private String empStatus;

    public Integer getEmpid() {
        return this.empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpFirstname() {
        return this.empFirstname;
    }

    public void setEmpFirstname(String empFirstname) {
        this.empFirstname = empFirstname;
    }

    public String getEmpLastname() {
        return this.empLastname;
    }

    public void setEmpLastname(String empLastname) {
        this.empLastname = empLastname;
    }

    public String getEmpEmail() {
        return this.empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Float getEmpSalary() {
        return this.empSalary;
    }

    public void setEmpSalary(Float empSalary) {
        this.empSalary = empSalary;
    }

    public Integer getEmpAge() {
        return this.empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Integer getEmpYearofjoin() {
        return this.empYearofjoin;
    }

    public void setEmpYearofjoin(Integer empYearofjoin) {
        this.empYearofjoin = empYearofjoin;
    }

    public String getEmpGender() {
        return this.empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpStatus() {
        return this.empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }
}
