package java_control_flow;
import java.util.Scanner;

public class digit_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        number = Math.abs(number);

        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
          
            while (number != 0) {
                number = number / 10;
                count++;               
            }
        }

        System.out.println("Number of digits: " + count);

    }
}
