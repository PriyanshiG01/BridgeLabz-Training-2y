package java_arrays;
import java.util.Scanner;

public class number_analysis {
    public static void main(String[] args) {
        int[] numbers = new int[5]; 
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println(); 

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
             
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is positive and even.");
                } else {
                    System.out.println("Number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
               
                System.out.println("Number " + num + " is negative.");
            } else {
               
                System.out.println("Number " + num + " is zero.");
            }
        }

        System.out.println(); 

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

    }
}
