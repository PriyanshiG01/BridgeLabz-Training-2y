package priyanshi;
import java.util.*;

class Course {
    String name;
    Course(String name) { this.name = name; }
}

class Professor {
    String name;
    List<Course> courses = new ArrayList<>();

    Professor(String name) { this.name = name; }

    void assignCourse(Course c) { courses.add(c); }
}

class Student {
    String name;
    List<Course> enrolled = new ArrayList<>();

    Student(String name) { this.name = name; }

    void enrollCourse(Course c) { enrolled.add(c); }
}

public class Main5 {
    public static void main(String[] args) {
        Student s1 = new Student("Priya");
        Professor p1 = new Professor("Dr. Rao");
        Course c1 = new Course("DBMS");

        s1.enrollCourse(c1);
        p1.assignCourse(c1);

        System.out.println(s1.name + " enrolled in " + c1.name);
        System.out.println(p1.name + " teaches " + c1.name);
    }
}
