package priyanshi;
import java.util.Scanner;

public class UniqueDigits {
    public static int countUniqueDigits(long n) {
        boolean[] seen = new boolean[10];
        String s = String.valueOf(Math.abs(n));
        for (char c : s.toCharArray()) seen[c - '0'] = true;
        int count = 0;
        for (boolean b : seen) if (b) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.println("Unique digits: " + countUniqueDigits(n));
        sc.close();
    }
}
