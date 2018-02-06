package Business.Employee;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author RIDDHI
 */
public class Employee {

    private String Name;
    private int age;
    private int EmpID;
    private static int count = 1;
    private Date DateofJoining;
    private String EmpPosition;
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");

    public Employee() {
        EmpID = count;
        count++;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public Date getDateofJoining() {
        return DateofJoining;
    }

    public void setDateofJoining(Date DateofJoining) {
        this.DateofJoining = DateofJoining;
    }

    public String getEmpPosition() {
        return EmpPosition;
    }

    public void setEmpPosition(String EmpPosition) {
        this.EmpPosition = EmpPosition;
    }
@Override 
        public String toString(){
     return Name;

} 
}

