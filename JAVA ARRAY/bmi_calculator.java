package java_arrays;
import java.util.Scanner;
public class bmi_calculator {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of persons: ");
	        int count =input.nextInt();

	        double[] height = new double[count];
	        double[] weight = new double[count];
	        double[] bmi = new double[count];
	        String[] status = new String[count];

	        for (int i = 0; i < count; i++) {
	            System.out.println("\nEnter details for Person " + (i + 1));
	            System.out.print("Enter height (in meters): ");
	            height[i] = input.nextDouble();
	            System.out.print("Enter weight (in kilograms): ");
	            weight[i] = input.nextDouble();

	            bmi[i] = weight[i] / (height[i] * height[i]);

	            if (bmi[i] < 18.5) {
	                status[i] = "Underweight";
	            } else if (bmi[i] < 25.0) {
	                status[i] = "Normal weight";
	            } else if (bmi[i] < 30.0) {
	                status[i] = "Overweight";
	            } else {
	                status[i] = "Obese";
	            }
	        }

	        System.out.println("\nBMI Report:");
	        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
	        for (int i = 0; i < count; i++) {
	            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
	        }
	}

}