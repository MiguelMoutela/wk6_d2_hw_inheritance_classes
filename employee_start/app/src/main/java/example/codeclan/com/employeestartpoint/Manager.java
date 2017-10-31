package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 31/10/2017.
 */

public class Manager extends Employee {
    private String depName;

    public Manager(int id, String name, String socialSecurityNumber, double salary, String depName) {
        super(id, name, socialSecurityNumber, salary);

        this.depName = depName;
    }

    public String getDepName() {
        return this.depName;
    }


//    public Manager(String depName) {
//        this.depName = depName;
//    }
}
