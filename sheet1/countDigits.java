package priyanshi;
	import java.util.Scanner;

	public class countDigits {
	    public static int countDigits(long n) {
	        return String.valueOf(Math.abs(n)).length();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        long n = sc.nextLong();
	        System.out.println("Number of digits: " + countDigits(n));
	        sc.close();
	    }
	}


