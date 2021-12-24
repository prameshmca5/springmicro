package CoreJavaTest;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class EmployeeEntity implements Serializable {
    @Id
    private int emp_id;

    @Id
    private int stud_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeEntity)) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return emp_id == that.emp_id && stud_id == that.stud_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_id, stud_id);
    }

    public EmployeeEntity() {
    }



    private int id;

    private String name;

    private String email;

    private String phone;

    private String address;


}
