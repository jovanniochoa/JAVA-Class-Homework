//This program asks prompts the user for a month and a year to determine
//how many days were on that given month on that given year
import java.util.*;

public class Q4_17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//asks the user to enter a year and a month and stores it
		int year = 0;
		String month = " ";
		System.out.print("Enter a year: ");
		year = in.nextInt();
		System.out.print("Enter a month: ");
		month = in.next();

		//checks if it's a leap year
		boolean isLeapYear = ((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0);
		
		//prints out depending on the month
		System.out.print(month + " " + year + " has ");
		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") ||
			month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
			System.out.println(31 + " days");
		else if (month.equals("Sep") || month.equals("Apr") || month.equals("Jun") || month.equals("Nov"))
			System.out.println(30 + " days");
		else // February 29 on leap and 28 on common years
			if (isLeapYear) {
				System.out.println(29 + " days");
			}
			else {
				System.out.println(28 + " days");
			}
	}

}
