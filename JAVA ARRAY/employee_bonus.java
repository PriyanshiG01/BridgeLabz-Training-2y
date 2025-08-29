package java_arrays;
import java.util.Scanner;
public class employee_bonus {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        double[] salary = new double[10];
	        double[] yearsOfService = new double[10];
	        double[] bonus = new double[10];
	        double[] newSalary = new double[10];

	        double totalBonus = 0;
	        double totalOldSalary = 0;
	        double totalNewSalary = 0;

	        for (int i = 0; i < 10; i++) {
	            System.out.println("Enter details for Employee " + (i + 1));
	            System.out.print("Salary: ");
	            double s = input.nextDouble();
	            System.out.print("Years of Service: ");
	            double y = input.nextDouble();

	            if (s <= 0 || y < 0) {
	                System.out.println("Invalid input. Please re-enter.");
	                i--;
	                continue;
	            }

	            salary[i] = s;
	            yearsOfService[i] = y;
	        }

	        for (int i = 0; i < 10; i++) {
	            if (yearsOfService[i] > 5) {
	                bonus[i] = salary[i] * 0.05;
	            } else {
	                bonus[i] = salary[i] * 0.02;
	            }

	            newSalary[i] = salary[i] + bonus[i];

	            totalBonus += bonus[i];
	            totalOldSalary += salary[i];
	            totalNewSalary += newSalary[i];
	        }

	        System.out.println("\nTotal Bonus to be paid: " + totalBonus);
	        System.out.println("Total Old Salary: " + totalOldSalary);
	        System.out.println("Total New Salary after Bonus: " + totalNewSalary);

	}

}
