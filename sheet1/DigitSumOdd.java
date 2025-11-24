package priyanshi;
import java.util.Scanner;

public class DigitSumOdd {
    public static int digitSumOdd(long n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int d = (int)(n % 10);
            if (d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.println("Sum of odd digits: " + digitSumOdd(n));
        sc.close();
    }
}
