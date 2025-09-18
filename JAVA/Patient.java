package priyanshi;
class Patient {
    int patientId;
    String name;
    int age;

    Patient(int id, String n, int a) {
        patientId = id;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Patient p = new Patient(501, "Suman", 45);
        p.display();
    }
}
