//This program checks if a list is sorted or not
//it then outputs the if it is or isn't
import java.util.*;
public class Q7_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[in.nextInt()];
		
		// prompts the user to enter a list and stores it
		System.out.print("Enter list: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		
		//uses a boolean to determine if the list is sorted or not by
		//comparing the integer in front of it on the list
		boolean isSorted = true;
		for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers[i] > numbers[i+1] ) {
				isSorted = false;
			}
		}
		
		//displays if it's sorted or not
		if (isSorted) {
			System.out.print("The list is already sorted" );
		}
		else {
		System.out.print("The list is not sorted" );
		}
		
	}

}
