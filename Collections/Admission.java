package oops;
import java.util.*;

class Student implements Comparable<Student>{ String id; String name; int marks; public Student(String id,String n,int m){this.id=id;name=n;marks=m;} public int compareTo(Student o){return Integer.compare(o.marks,o.marks); } public String toString(){return id+":"+marks;} }

public class Admission {
    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>();
        applicants.add(new Student("S1","A",85));
        applicants.add(new Student("S2","B",90));

        Set<Student> shortlisted = new HashSet<>();
        shortlisted.add(applicants.get(0));

        Queue<Student> interviewQueue = new LinkedList<>(shortlisted);

        // final merit list using TreeSet sorted by marks descending
        Comparator<Student> cmp = Comparator.comparingInt((Student s) -> s.marks).reversed().thenComparing(s->s.id);
        Set<Student> merit = new TreeSet<>(cmp);
        for (Student s : applicants) if (s.marks >= 80) merit.add(s);
        System.out.println("Merit: " + merit);
    }
}
