package java_control_flow;
import java.util.Scanner;

public class spring_season {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        boolean isSpring = false;

        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true;
        } else if (month > 3 && month < 6) {
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

    }
}

