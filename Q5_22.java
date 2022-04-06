//This program calculates the interest principal and balance given the loan
//amount number of years and annual interest rates based on the number of payments
import java.util.Scanner;

public class Q5_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//creates scanner

		//asks the user for loan amount and number of years, then stores it
		System.out.print("Loan Amount: ");
		double loanAmount = in.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = in.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = in.nextDouble();
		
		//calculates monthly payment
		double perMonth = (loanAmount * (annualInterestRate / 1200) / (1 - (1 / Math.pow(1 + (annualInterestRate / 1200), numberOfYears * 12))));

		//Shows monthly and total payment, as well as, prints chart header
		System.out.printf("Monthly Payment: %.2f\n", perMonth);
		System.out.printf("Total Payment: %.2f\n", (perMonth * 12) * numberOfYears);
		System.out.println("\nPayment#     Interest     Principal     Balance");
		
		//define interest principal and balance
		double interest = 0;
		double principal = 0;
		double balance = loanAmount;
		
		//calculates and displays interest, principal, and balance
		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = (annualInterestRate / 1200) * balance;
			principal = perMonth - interest;
			balance -= principal;
			System.out.printf("%-13d", i);
			System.out.printf("%5.2f", interest);
			System.out.printf("%14.2f", principal);
			System.out.printf("%15.2f\n", balance);
		}
		
		

	}

}
