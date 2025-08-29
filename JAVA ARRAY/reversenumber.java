package java_arrays;
import java.util.Scanner;
public class reversenumber {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a positive integer: ");
	        int number = input.nextInt();

	        if (number < 0) {
	            System.out.println("Invalid input. Enter a positive number.");
	            return;
	        }

	        int temp = number;
	        int count = 0;

	        while (temp != 0) {
	            temp /= 10;
	            count++;
	        }

	        int[] digits = new int[count];

	        temp = number;
	        for (int i = 0; i < count; i++) {
	            digits[i] = temp % 10;
	            temp /= 10;
	        }

	        int[] reversed = new int[count];
	        for (int i = 0; i < count; i++) {
	            reversed[i] = digits[i];
	        }

	        System.out.print("Reversed number: ");
	        for (int i = 0; i < count; i++) {
	            System.out.print(reversed[i]);
	        }

	}

}
