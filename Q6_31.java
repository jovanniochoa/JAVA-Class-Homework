//This program checks if a credit card is valid by checking it's 
//length, starting number, and Luhn check. It then outputs if it's valid 
//or not.
import java.util.*;
public class Q6_31 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a credit card number as a long integer: ");
		long number = in.nextLong();

		if (isValid(number)) {
		System.out.println(number + " is valid.");
		}
		else {
			System.out.println(number + " is invalid.");
		}
	}
	
	/**Return true if the card number is valid */
	public static boolean isValid(long number) {
		boolean isValid = (getSize(number) >= 13 && getSize(number) <= 16) &&
						  (prefixMatched(number, 4) || prefixMatched(number, 5) ||
						  prefixMatched(number, 37) || prefixMatched(number, 6)) &&
						  ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
		return isValid;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int total = 0;
		String s = String.valueOf(number);
		for (int i = getSize(number) - 2; i>=0; i -=2) {
			total += getDigit(Integer.parseInt(s.charAt(i) + "")*2);
		}
		return total;
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number) {
		if (number > 9 ) {
			return ((number%10)+(number/10));
		}
		else {
			return number;
		}
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int total = 0;
		String s = String.valueOf(number);
		for (int i = getSize(number) - 1; i>=0; i -=2) {
			total += Integer.parseInt(s.charAt(i) + "");
		}
		return total;
	 }
	
	 /** Return true if the digit d is a prefix for number */
	 public static boolean prefixMatched(long number, int d) {
		 if (getPrefix(number, getSize(d)) == d) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	
	 /** Return the number of digits in d */
	 public static int getSize(long d) {
		 String s = String.valueOf(d);
		 return s.length();
	 }
	
	 /** Return the first k number of digits from number. If the
	 * number of digits in number is less than k, return number. */
	 public static long getPrefix(long number, int k) {
		 String s = String.valueOf(number);
		 if (s.length() > k) {
			 return Long.parseLong(s.substring(0, k));
		 }
		 return number;
	 }
}

