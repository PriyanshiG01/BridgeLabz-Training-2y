package java_arrays;
import java.util.Scanner;
public class meanheight {
	public class MeanHeightCalculator {
	    public static void main(String[] args) {
	        double[] heights = new double[11]; 
	        double sum = 0.0;                  

	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter the heights (in cm or meters) of 11 football players:");

	        for (int i = 0; i < heights.length; i++) {
	            System.out.print("Enter height of player " + (i + 1) + ": ");
	            heights[i] = input.nextDouble();
	            sum += heights[i]; 
	        }

	        double mean = sum / heights.length;

	        System.out.printf("\nThe mean height of the football team is: %.2f\n", mean);

	    }
	}

}
