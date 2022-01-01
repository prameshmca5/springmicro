package streamjavatest;

import com.ramesh.microservice.repository.EmployeeRepository;
import com.ramesh.microservice.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class SolvetheSoluction {


    public static void main(String[] args) {

      //  List<Integer> inn = Arrays.asList(1,23,34,4,4,4,4,4,5,,5,4,55,5,5,5);
     //   List<Integer> intList = Arrays.asList(1,2,3,4,45,4,5,55,5);
        // Get List of employee name based on department passing
        List<Employee> lstEmp = new EmployeeData().getEmployeeList();
        String department = "DEVOPS";
      //  getEmployeeNameBasedOnDepartment(lstEmp, department);

        // GetSorting by Comparator
       // getEmployeeSortByName(lstEmp);

        //GetSortig by Department
        getEmployeeSortByDepartment(lstEmp);

        // getEmployeeDetails
     //  List<com.ramesh.microservice.model.Employee> employeeLst = employeeService.getAllEmployee();
     //  getEmployeeDetailsFromMysqlDatabawse(employeeLst);

     //  Runnable r = ()->performOperarion();
     //  r.run();
    }

    private static void performOperarion() {
        System.out.println("Welcome this is runnable methods");
    }

    public static void getEmployeeNameBasedOnDepartment(List<Employee> empList, String depName) {
        List<String> kklist = empList.stream()
                .filter(em-> em.getDepartment().contains(depName))
                .map(emp->emp.getEmpName())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(kklist);
    }

    public static void getEmployeeSortByName(List<Employee> empList) {
       Collections.sort(empList,EmployeeComparable.byNameAlbhabetical);
       for (Employee ep : empList){
           System.out.print(ep.getEmpName());
       }
    }

    public static void getEmployeeSortByDepartment(List<Employee> empList) {
        Collections.sort(empList,EmployeeComparable.byDeparmentAlbha);
        for (Employee ep : empList){
           // System.out.println(ep.getDepartment());
        }

        List<Employee> emp =   empList.stream().sorted(EmployeeComparable.byDeparmentAlbha).collect(Collectors.toList());
        for (Employee ep : emp){
            System.out.println(ep.getDepartment());
        }
    }


    public static void getEmployeeDetailsFromMysqlDatabawse(List<com.ramesh.microservice.model.Employee> emplList) {
        System.out.println("Welecome this is getting sample Output");
        System.out.println(emplList);
    }

    public static void getsample() {
        /*
        List<Employee> lstEmp = new EmployeeData().getEmployeeList();

        Map<String, Optional<Employee>> getDepSal = lstEmp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalay))))
                );
        getDepSal.forEach((key, val)->System.out.println(key + "-"+val.get().getSalay()));

        System.out.println("---------------------------------------------------------------");
        Map<String, Optional<Employee>> empSalDep = lstEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getSalay))));

        empSalDep.forEach((key, val)->System.out.println(key + "-"+val.get().getSalay()));

        // MaxSalary to get All Department
        Map<String, Double> getemptot = lstEmp.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingInt(Employee::getAge)
                        )
                );

        //getemptot.forEach((key, val)->System.out.println(key+"=>"+val));

        Map<String, Optional<Employee>> getempage = lstEmp.stream()
                .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.reducing(
                                        BinaryOperator.maxBy(
                                                Comparator.comparing(Employee::getAge)
                                        )
                                )
                        )
                );

        //getempage.forEach((key, val)->System.out.println(key+"=>"+val.get().getAge()));

        Map<String, Long> empGenderCount = lstEmp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        empGenderCount.forEach((key, val)->System.out.println(key+"-"+val));

        Map<String, Long> empStatusCount = lstEmp.stream().collect(Collectors.groupingBy(Employee::getStatus, Collectors.counting()));
        empStatusCount.forEach((key, val)->System.out.println(key+"-"+val));

       // List<Employee> lstOps = lstEmp.stream().sorted(Comparator.comparing(Employee::getSalay).reversed()).collect(Collectors.toList());
      //  System.out.println("Test => "+lstOps.get(0).getSalay());


        // Max salary per department
         Map<String, Optional<Employee>> getCountperDepSalary = lstEmp.stream()
                 .collect(
                         Collectors.groupingBy(Employee::getDepartment,
                                 Collectors.maxBy(Comparator.comparing(Employee::getSalay))
                                 )
                 );

        getCountperDepSalary.forEach((key, val)->System.out.println(key+"-"+val.get().getSalay()));

        System.out.println("=====================================================");
        // 2nd scenario
        Map<String, Long> getCountSal = lstEmp.stream()
                                                            .collect(Collectors.groupingBy(Employee::getDepartment,
                                                                   Collectors.summingLong(Employee::getSalay)
                                                                    )
                                                            );
        getCountSal.forEach((key, val)->System.out.println(key+"-"+val));

        Long getSum = lstEmp.stream().collect(Collectors.summingLong(Employee::getSalay));

        System.out.println(getSum);

       Optional<Employee> maxval =  lstEmp.stream().collect(Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalay))));
        System.out.println(maxval.get().getSalay());
     //   System.out.println(lstEmp.toString());

         */
    }
}
