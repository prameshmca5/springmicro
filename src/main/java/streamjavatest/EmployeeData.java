package streamjavatest;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public List<Employee> getEmployeeList(){
        List<Employee> empLst = new ArrayList<>();
        empLst.add(new Employee(1001, "Ramesh", "FEV", 80000, 2009, 35, "Active", "Male"));
        empLst.add(new Employee(1010, "Amutha", "DEV", 90000, 2011, 30, "Active", "Female"));
        empLst.add(new Employee(1011, "Laxshana", "Tester", 90000, 2013, 25, "Active", "Female"));
        empLst.add(new Employee(1012, "Kavin", "DEVOPS", 90000, 2014, 29, "Active", "Male"));
        empLst.add(new Employee(1013, "Santhosh", "HR", 40000, 2015, 28, "Inactive", "Male"));
        empLst.add(new Employee(1013, "Dhilip", "HR", 150000, 2014, 28, "Inactive", "Male"));
        empLst.add(new Employee(1013, "Sathis", "HR", 190000, 2014, 23, "Active", "Male"));
        empLst.add(new Employee(1013, "Naveen", "UI", 290000, 2019, 24, "Active", "Male"));
        empLst.add(new Employee(1013, "Boopathi", "UI", 490000, 2020, 26, "Inactive", "Male"));
        empLst.add(new Employee(1013, "Karthi", "BA", 95000, 2020, 27, "Active", "Male"));
        empLst.add(new Employee(1013, "Kows", "BA", 91000, 2018, 28, "Inactive", "Female"));
        empLst.add(new Employee(1013, "Nithya", "DEVOPS", 120000, 2018, 35, "Inactive", "Female"));
        empLst.add(new Employee(1013, "Raji", "DEVOPS", 193000, 2017, 40, "Active", "Female"));
        empLst.add(new Employee(1013, "Kannan", "DEVOPS", 33000, 2016, 42, "Inactive", "Male"));
        empLst.add(new Employee(1013, "Kanagaraj", "HR", 45000, 2014, 48, "Active", "Male"));
        return empLst;
    }
}
