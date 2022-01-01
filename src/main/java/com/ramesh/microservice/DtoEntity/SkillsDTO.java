package com.ramesh.microservice.DtoEntity;

public class SkillsDTO {
    private Integer skid;
    private Integer skEmpid;
    private String skName;
    private String skStatus;

    public Integer getSkid() {
        return this.skid;
    }

    public void setSkid(Integer skid) {
        this.skid = skid;
    }

    public Integer getSkEmpid() {
        return this.skEmpid;
    }

    public void setSkEmpid(Integer skEmpid) {
        this.skEmpid = skEmpid;
    }

    public String getSkName() {
        return this.skName;
    }

    public void setSkName(String skName) {
        this.skName = skName;
    }

    public String getSkStatus() {
        return this.skStatus;
    }

    public void setSkStatus(String skStatus) {
        this.skStatus = skStatus;
    }
}
