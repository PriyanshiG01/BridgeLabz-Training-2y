package java_arrays;
import java.util.Scanner;
public class storeandsum {
	    public static void main(String[] args) {
	        double[] numbers = new double[10]; 
	        double total = 0.0;               
	        int index = 0;                     

	        Scanner input= new Scanner(System.in);

	        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

	        while (true) {
	            System.out.print("Enter number " + (index + 1) + ": ");
	            double i = input.nextDouble();

	            if (i <= 0) {
	                break;
	            }

	            if (index == 10) {
	                System.out.println("Maximum of 10 numbers reached.");
	                break;
	            }

	            numbers[index] = i;
	            index++;
	        }

	        System.out.println("\nYou entered the following numbers:");
	        for (int i = 0; i < index; i++) {
	            System.out.println(numbers[i]);
	            total += numbers[i]; 
	        }

	        System.out.println("\nTotal sum of the numbers: " + total);

	}

}
