package priyanshi;
import java.util.*;

public class Simpleinterest {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of interest (in %): ");
        double rate = input.nextDouble();
        
        System.out.print("Enter the Time (in years): ");
                double time = input.nextDouble();

                double simpleInterest = (principal * rate * time) / 100;

                System.out.println("Simple Interest = %.2f\n", simpleInterest);

         
            }
        }
