package java_control_flow;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        double heightMeters = heightCm / 100.0;

        double bmi = weight / (heightMeters * heightMeters);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

    }
}
