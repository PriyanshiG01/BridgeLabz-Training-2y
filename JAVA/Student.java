package priyanshi;
class Student {
    int rollNo;
    String name;
    int marks;

    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Riya", 90);
        s.display();
    }
}
