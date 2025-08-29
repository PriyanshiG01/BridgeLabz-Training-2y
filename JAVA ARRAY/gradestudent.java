package java_arrays;
import java.util.Scanner;
public class gradestudent {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numberOfStudents =input.nextInt();

	        int[][] marks = new int[numberOfStudents][3];  
	        double[] percentages = new double[numberOfStudents];
	        char[] grades = new char[numberOfStudents];

	        for (int i = 0; i < numberOfStudents; i++) {
	            System.out.println("Enter marks for student " + (i + 1));

	            for (int j = 0; j < 3; j++) {
	                String subject = "";
	                if (j == 0) subject = "Physics";
	                else if (j == 1) subject = "Chemistry";
	                else if (j == 2) subject = "Maths";

	                System.out.print(subject + ": ");
	                int mark =input.nextInt();

	                if (mark < 0) {
	                    System.out.println("Invalid mark! Please enter positive values.");
	                    j--;  
	                    continue;
	                }
	                marks[i][j] = mark;
	            }
	        }

	        for (int i = 0; i < numberOfStudents; i++) {
	            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
	            percentages[i] = (totalMarks / 300.0) * 100;

	            if (percentages[i] >= 80)
	                grades[i] = 'A';
	            else if (percentages[i] >= 70)
	                grades[i] = 'B';
	            else if (percentages[i] >= 60)
	                grades[i] = 'C';
	            else if (percentages[i] >= 50)
	                grades[i] = 'D';
	            else if (percentages[i] >= 40)
	                grades[i] = 'E';
	            else
	                grades[i] = 'R';
	        }

	        System.out.println("\nResults:");
	        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
	        for (int i = 0; i < numberOfStudents; i++) {
	            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%c\n", 
	                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
	        }
	}

}
