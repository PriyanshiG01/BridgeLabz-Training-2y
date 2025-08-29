package java_arrays;
import java.util.Scanner;
public class frequency {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        long number = input.nextLong();

	        number = Math.abs(number);

	        long temp = number;
	        int count = 0;
	        if (number == 0) {
	            count = 1; 
	        } else {
	            while (temp > 0) {
	                count++;
	                temp /= 10;
	            }
	        }
	        int[] digits = new int[count];
	        temp = number;
	        for (int i = 0; i < count; i++) {
	            digits[i] = (int)(temp % 10);
	            temp /= 10;
	        }
	        int[] frequency = new int[10];

	        for (int i = 0; i < count; i++) {
	            frequency[digits[i]]++;
	        }
	        System.out.println("Frequency of digits:");
	        for (int i = 0; i < 10; i++) {
	            if (frequency[i] > 0) {
	                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
	            }
	        }
	}

}