//This program calculates the monthly and total payment given the load amount and 
//number of years. It then prints it out within the interest rate of 5-8 by 1/8 increments
import java.util.Scanner;
public class Q5_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//creates scanner

		//asks the user for loan amount and number of years, then stores it
		System.out.print("Loan Amount: ");
		double loanAmount = in.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = in.nextInt();
		
		//prints the header
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		//calculate the total and monthly payments with increasing interest rates
		for(double i = 5; i<=8; i += 0.125) {
			System.out.printf("%.3f", i);
			System.out.print("%           ");
			double perMonth = (loanAmount * (i / 1200) / (1 - (1 / Math.pow(1 + (i / 1200), numberOfYears * 12))));
			System.out.printf("%.2f", perMonth);
			System.out.print("             ");
			System.out.printf("%.2f\n",(perMonth * 12) * numberOfYears);
			
		}
		
	}

}
