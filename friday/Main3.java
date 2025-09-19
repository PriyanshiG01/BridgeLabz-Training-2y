package priyanshi;import java.util.*;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
}

class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();

    Department(String deptName) { this.deptName = deptName; }

    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) { this.name = name; }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void deleteCompany() {
        departments.clear(); // composition → deleting company deletes departments
        System.out.println("Company deleted along with all departments and employees.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("John"));

        comp.addDepartment(d1);
        comp.deleteCompany();
    }
}
