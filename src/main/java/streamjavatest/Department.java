package streamjavatest;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {

    private int depId;

    private int empId;

    private String depName;

    private  String depAddress;

    private String depEmail;
}
