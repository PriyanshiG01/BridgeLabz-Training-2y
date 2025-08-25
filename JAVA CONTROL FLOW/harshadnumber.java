package java_control_flow;
import java.util.Scanner;

public class harshadnumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number =input.nextInt();

        int sum = 0;
        int originalNumber = Math.abs(number); 

        while (originalNumber != 0) {
            int digit = originalNumber % 10;   
            sum += digit;                      
            originalNumber /= 10;              
        }
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}
