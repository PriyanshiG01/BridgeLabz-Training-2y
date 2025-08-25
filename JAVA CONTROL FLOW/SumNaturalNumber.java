package java_control_flow;
import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
          
            return;
        }

        int sumWhile = 0;
        int count = 1;
        while (count <= n) {
            sumWhile += count;
            count++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumWhile == sumFormula) {
            System.out.println("Both computations are correct and match!");
        } else {
            System.out.println("There is a discrepancy in the computations.");
        }

    }
}
