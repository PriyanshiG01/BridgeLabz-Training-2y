package java_control_flow;
import java.util.Scanner;

public class power2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = input.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = input.nextInt();

        if (number > 0 && power >= 0) {
            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Please enter positive integers (power can be zero or more).");
        }

    }
}
