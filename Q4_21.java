//This program checks if a user entered a valid social security number
import java.util.*;

public class Q4_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//asks the user to enter a Social Security Number and stores it
		String ssn = " ";
		System.out.print("Enter a SSN: ");
		ssn = in.nextLine();
		
		//checks if the value is a digit at each 11 characters
		boolean isReal = ((ssn.length() == 11) && (Character.isDigit(ssn.charAt(0))) &&
			(Character.isDigit(ssn.charAt(1))) && (Character.isDigit(ssn.charAt(2))) &&
			(ssn.charAt(3) == '-') && (Character.isDigit(ssn.charAt(4))) &&
			(Character.isDigit(ssn.charAt(5))) && (Character.isDigit(ssn.charAt(7))) &&
			(ssn.charAt(6) == '-') && (Character.isDigit(ssn.charAt(8))) &&
			(Character.isDigit(ssn.charAt(9))) && (Character.isDigit(ssn.charAt(10))));
		
		//Displays output if it's valid or invalid input.
		if (isReal) {
			System.out.println(ssn + " is a valid social security number" );
		}
		else {
			System.out.println(ssn + " is an invalid social security number" );
		}
	}

}
