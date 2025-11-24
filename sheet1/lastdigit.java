package priyanshi;
public class lastdigit {
    public static int lastDigit(int n) {
        return Math.abs(n % 10);  
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(1234));
        System.out.println(lastDigit(-567)); 
    }
}