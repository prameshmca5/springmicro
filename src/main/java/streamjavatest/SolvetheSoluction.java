package streamjavatest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class SolvetheSoluction {

    public static void main(String[] args) {
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
        /*
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
