package streamjavatest;

import streamjavatest.Employee;

import java.util.Comparator;

public class EmployeeComparable {

    public static final Comparator<Employee> byNameAlbhabetical = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmpName().compareTo(o2.getEmpName());
        }

    };

    public static final  Comparator<Employee> byDeparmentAlbha = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getDepartment().compareTo(o2.getDepartment());
        }
    };
}
