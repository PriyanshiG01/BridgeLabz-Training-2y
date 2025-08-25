package java_control_flow;
	import java.util.Scanner;

	public class Factor{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int number = input.nextInt();

	        if (number > 0) {
	            System.out.println("Factors of " + number + " are:");
	            
	            for (int i = 1; i <= number; i++) {
	                if (number % i == 0) {
	                    System.out.println(i);
	                }
	            }
	        } else {
	            System.out.println("Please enter a positive integer.");
	        }

	    }
	}
