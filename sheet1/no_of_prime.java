package priyanshi;
import java.util.Scanner;
public class no_of_prime {


	    public static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
	        return true;
	    }

	    public static int primeCountInRange(int start, int end) {
	        int count = 0;
	        for (int i = start; i <= end; i++) if (isPrime(i)) count++;
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter start: ");
	        int start = sc.nextInt();
	        System.out.print("Enter end: ");
	        int end = sc.nextInt();
	        System.out.println("Number of primes: " + primeCountInRange(start, end));
	        sc.close();
	    }
	

}
