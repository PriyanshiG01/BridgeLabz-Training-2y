package java_arrays;
import java.util.Scanner;
public class youngest_and_tallest {
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        String[] names = {"Amar", "Akbar", "Anthony"};
	        int[] ages = new int[3];
	        double[] heights = new double[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter age and height of " + names[i]);
	            System.out.print("Age: ");
	            ages[i] = input.nextInt();
	            System.out.print("Height: ");
	            heights[i] =input.nextDouble();
	        }

	        int youngestIndex = 0;
	        int tallestIndex = 0;

	        for (int i = 1; i < 3; i++) {
	            if (ages[i] < ages[youngestIndex]) {
	                youngestIndex = i;
	            }
	            if (heights[i] > heights[tallestIndex]) {
	                tallestIndex = i;
	            }
	        }

	        System.out.println("\nThe youngest friend is: " + names[youngestIndex]);
	        System.out.println("The tallest friend is: " + names[tallestIndex]);

	}

}