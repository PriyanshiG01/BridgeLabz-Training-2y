package priyanshi;
public class seconddigit {
    public static int secondLastDigit(int n) {
        return Math.abs((n / 10) % 10);  
    }

    public static void main(String[] args) {
        System.out.println(secondLastDigit(1234));
        System.out.println(secondLastDigit(89));   
    }
}
