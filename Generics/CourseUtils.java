package oops;
import java.util.*;

abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;
    public Course(T type) { this.type = type; }
}

class CourseUtils {
    public static void printCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses)
            System.out.println(c.getClass().getSimpleName());
    }
}
