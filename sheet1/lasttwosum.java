package priyanshi;
public class lasttwosum {
    public static int sumOfLastDigits(int a, int b) {
        int lastA = Math.abs(a % 10);
        int lastB = Math.abs(b % 10);
        return lastA + lastB;
    }

    public static void main(String[] args) {
        System.out.println(sumOfLastDigits(123, 89)); 
    }
}