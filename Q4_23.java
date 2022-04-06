// This program is calculates the net pay based on how many 
// hours you've worked/pay as well as the federal and state tax
import java.util.*;

public class Q4_23 {

	public static void main(String[] args) {
		
		//initializing and asking the user for data
		Scanner in = new Scanner(System.in);
		String name = " ";
		double hours = 0.0;
		double pay = 0.0;
		double federal = 0.0;
		double state = 0.0;
		System.out.printf("Enter employee's name: ");
		name = in.nextLine();
		System.out.printf("Enter number of hours worked in a week: ");
		hours = in.nextDouble();
		System.out.printf("Enter hourly pay rate: ");
		pay = in.nextDouble();
		System.out.printf("Enter federal tax withholding rate: ");
		federal = in.nextDouble();
		System.out.printf("Enter state tax withholding rate: ");
		state = in.nextDouble();
		
		
		//outputs the users information and does calculations
		System.out.println("Employee Name: " + name);
		System.out.printf("Hours Worked: " + hours);
		System.out.printf("\nPay Rate: " + pay);
		System.out.printf("\nGross Pay: " + hours*pay);
		System.out.println("\nDeductions:");
		System.out.printf("  Federal Withholding ("  );
		System.out.printf("%.2f", + federal*100.0);
		System.out.print("%): $");
		System.out.printf("%.2f", (hours*pay)*federal);
		System.out.printf("\n  State Withholding ("  );
		System.out.printf("%.2f", + state*100.0);
		System.out.print("%): $");
		System.out.printf("%.2f", (hours*pay)*state);
		System.out.print("\n  Total Deduction: $"  );
		System.out.printf("%.2f", (((hours*pay)*state)+((hours*pay)*federal)));
		System.out.printf("\nNet Pay: $");
		System.out.printf("%.2f", ((hours*pay)-((((hours*pay)*state)+((hours*pay)*federal)))) );
		
	}

}
