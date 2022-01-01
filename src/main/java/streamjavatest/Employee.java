package streamjavatest;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    private int empId;

    private String empName;

  //  private List<Department> department;
    private String department;

    private int salay;

    private int joinYear;

    private int age;

    private String status;

    private String gender;

}
