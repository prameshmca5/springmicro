package com.ramesh.microservice.DtoEntity;

public class DepartmentDTO {
    private Integer depid;
    private Integer depEmpid;
    private String depName;
    private String depEmail;
    private String depPhone;
    private String depStatus;

    public Integer getDepid() {
        return this.depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public Integer getDepEmpid() {
        return this.depEmpid;
    }

    public void setDepEmpid(Integer depEmpid) {
        this.depEmpid = depEmpid;
    }

    public String getDepName() {
        return this.depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepEmail() {
        return this.depEmail;
    }

    public void setDepEmail(String depEmail) {
        this.depEmail = depEmail;
    }

    public String getDepPhone() {
        return this.depPhone;
    }

    public void setDepPhone(String depPhone) {
        this.depPhone = depPhone;
    }

    public String getDepStatus() {
        return this.depStatus;
    }

    public void setDepStatus(String depStatus) {
        this.depStatus = depStatus;
    }
}
