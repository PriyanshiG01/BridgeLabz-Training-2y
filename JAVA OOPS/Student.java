package java_method;
	class Student {
	    String name;
	    int rollNumber;
	    double marks;

	    public String calculateGrade() {
	        if (marks >= 90) return "A";
	        else if (marks >= 80) return "B";
	        else if (marks >= 70) return "C";
	        else if (marks >= 60) return "D";
	        else return "F";
	    }

	    public void displayStudentDetails() {
	        String grade = calculateGrade();
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + grade);
	    }

	    public static void main(String[] args) {
	        Student student = new Student();
	        student.name = "Alice";
	        student.rollNumber = 101;
	        student.marks = 85.5;

	        student.displayStudentDetails();
	    }
	}