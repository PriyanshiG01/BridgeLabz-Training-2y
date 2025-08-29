package java_arrays;
import java.util.Scanner;
public class student_grades {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int number =input.nextInt();

	        double[][] marks = new double[number][3]; // [][0] = Physics, [][1] = Chemistry, [][2] = Maths
	        double[] percentage = new double[number];
	        char[] grades = new char[number];

	        for (int i = 0; i < number; i++) {
	            System.out.println("\nEnter marks for Student " + (i + 1));

	            for (int j = 0; j < 3; j++) {
	                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

	                double mark;
	                do {
	                    System.out.print("Enter marks in " + subject + " (0 - 100): ");
	                    mark = input.nextDouble();

	                    if (mark < 0 || mark > 100) {
	                        System.out.println("Invalid marks. Please enter between 0 and 100.");
	                    }
	                } while (mark < 0 || mark > 100);

	                marks[i][j] = mark;
	            }

	            double total = marks[i][0] + marks[i][1] + marks[i][2];
	            percentage[i] = (total / 300) * 100;

	            if (percentage[i] >= 90) {
	                grades[i] = 'A';
	            } else if (percentage[i] >= 80) {
	                grades[i] = 'B';
	            } else if (percentage[i] >= 70) {
	                grades[i] = 'C';
	            } else if (percentage[i] >= 60) {
	                grades[i] = 'D';
	            } else {
	                grades[i] = 'F';
	            }
	        }

	        System.out.println("\nStudent Results:");
	        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

	        for (int i = 0; i < number; i++) {
	            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%c\n",
	                    (i + 1),
	                    marks[i][0],
	                    marks[i][1],
	                    marks[i][2],
	                    percentage[i],
	                    grades[i]);
	        }
	    }
	}