package functional_interface;
import java.util.Scanner;

@FunctionalInterface
interface TemperatureCheck {
 boolean test(double temperature);
}

public class temperature {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter threshold temperature: ");
     double threshold = sc.nextDouble();

     TemperatureCheck t =(temp)-> temp > threshold;

     System.out.print("Enter current temperature: ");
     double currentTemp = sc.nextDouble();
     
     if (t.test(currentTemp)) {
         System.out.println(" Alert! Temperature crossed threshold.");
     } else {
         System.out.println(" Temperature is normal.");
     }

 }
}
