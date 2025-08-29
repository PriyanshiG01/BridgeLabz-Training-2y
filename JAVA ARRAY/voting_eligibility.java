package java_arrays;
import java.util.Scanner;
public class voting_eligibility {
	    public static void main(String[] args) {
	        int[] ages = new int[10]; 
	        Scanner input = new Scanner(System.in);

	        for (int i = 0; i < ages.length; i++) {
	            System.out.print("Enter age of student " + (i + 1) + ": ");
	            ages[i] =input.nextInt();
	        }

	        System.out.println(); 

	        for (int i = 0; i < ages.length; i++) {
	            int age = ages[i];

	            if (age < 0) {
	                System.out.println("Invalid age entered for student " + (i + 1));
	            } else if (age >= 18) {
	                System.out.println("The student with the age " + age + " can vote.");
	            } else {
	                System.out.println("The student with the age " + age + " cannot vote.");
	            }
	        }

	       
	}


}
