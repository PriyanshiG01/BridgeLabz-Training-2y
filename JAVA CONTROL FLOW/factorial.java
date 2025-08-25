package java_control_flow;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1; 
        int counter = 1;

        while (counter <= number) {
            factorial *= counter;
            counter++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

