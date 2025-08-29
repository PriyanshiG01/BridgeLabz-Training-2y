package java_arrays;
import java.util.Scanner;
public class bmi_calculator2 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter number of persons: ");
	        int number = input.nextInt();

	        double[][] personData = new double[number][3];
	        String[] weightStatus = new String[number];

	        for (int i = 0; i < number; i++) {
	            System.out.println("\nEnter details for Person " + (i + 1));

	            double height;
	            do {
	                System.out.print("Enter height (in meters): ");
	                height = input.nextDouble();
	                if (height <= 0) {
	                    System.out.println("Height must be a positive number.");
	                }
	            } while (height <= 0);

	            double weight;
	            do {
	                System.out.print("Enter weight (in kilograms): ");
	                weight = input.nextDouble();
	                if (weight <= 0) {
	                    System.out.println("Weight must be a positive number.");
	                }
	            } while (weight <= 0);

	            double bmi = weight / (height * height);

	            personData[i][0] = height;
	            personData[i][1] = weight;
	            personData[i][2] = bmi;

	            if (bmi < 18.5) {
	                weightStatus[i] = "Underweight";
	            } else if (bmi < 25.0) {
	                weightStatus[i] = "Normal weight";
	            } else if (bmi < 30.0) {
	                weightStatus[i] = "Overweight";
	            } else {
	                weightStatus[i] = "Obese";
	            }
	        }

	        System.out.println("\nBMI Report:");
	        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");

	        for (int i = 0; i < number; i++) {
	            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
	                    (i + 1),
	                    personData[i][0],
	                    personData[i][1],
	                    personData[i][2],
	                    weightStatus[i]);
	        }
	    }
	}