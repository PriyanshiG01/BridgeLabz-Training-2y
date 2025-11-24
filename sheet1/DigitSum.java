package priyanshi;
import java.util.Scanner;

public class DigitSum {
    public static int digitSum(long n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.println("Sum of digits: " + digitSum(n));
        sc.close();
    }
}

