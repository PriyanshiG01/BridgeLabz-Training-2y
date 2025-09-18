package priyanshi;
class Employee {
    int empId;
    String name;
    double salary;

    Employee(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(201, "Amit", 35000);
        e.display();
    }
}
