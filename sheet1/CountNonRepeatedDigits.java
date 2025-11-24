package priyanshi;
import java.util.Scanner;

public class CountNonRepeatedDigits {
    public static int countNonRepeatedDigits(long n) {
        int[] freq = new int[10];
        String s = String.valueOf(Math.abs(n));
        for (char c : s.toCharArray()) freq[c - '0']++;
        int count = 0;
        for (int f : freq) if (f == 1) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.println("Non-repeated digits: " + countNonRepeatedDigits(n));
        sc.close();
    }
}
