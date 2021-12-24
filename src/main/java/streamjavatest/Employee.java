package streamjavatest;

public class Employee {

    private int empId;

    private String empName;

    private String department;

    private int salay;

    private int joinYear;

    private int age;

    private String status;

    private String gender;

    public Employee(int empId, String empName, String department, int salay, int joinYear, int age, String status, String gender) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salay = salay;
        this.joinYear = joinYear;
        this.age = age;
        this.status = status;
        this.gender = gender;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalay() {
        return salay;
    }

    public void setSalay(int salay) {
        this.salay = salay;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
