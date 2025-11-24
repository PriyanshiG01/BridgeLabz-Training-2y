package priyanshi;
import java.util.Scanner;

public class DigitSumOpt {
    public static int digitSumOpt(long n, boolean even) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int d = (int)(n % 10);
            if (even && d % 2 == 0) sum += d;
            if (!even && d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.print("Sum even digits? (true/false): ");
        boolean even = sc.nextBoolean();
        System.out.println("Digit sum (opt): " + digitSumOpt(n, even));
        sc.close();
    }
}
