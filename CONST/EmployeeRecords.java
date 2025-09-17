package priyanshi;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("ID: " + employeeID + ", Dept: " + department +
                           ", Salary: " + getSalary() + ", Team: " + teamName);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager(1, "IT", 60000, "Development");
        m.displayManagerDetails();
    }
}
