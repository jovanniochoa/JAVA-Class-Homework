//This program checks if the user has duplicate numbers
//If the user does, it does not store those numbers
// it then outputs numbers without another duplicate
import java.util.Scanner;

public class Q7_15 {

	// prompts the user to input numbers and stores them
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] x = new int[10];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			x[i] = in.nextInt();
		}
		int[] y = eliminateDuplicates(x);
		
		//prints out the distinct numbers
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < 10 ; i++) {
			if (y[i] != -3141592)
				System.out.print(y[i] + " ");
		}
	}
	
	//checks to find if there are duplicates of a number
	public static int[] eliminateDuplicates(int[] list) {
		int[] y = new int[10];
		int counting = 1;
		for (int i = 0; i < 10; i++) {
			y[i] = -3141592;
		}
		y[0] = list[0]; // replaces the first number of the new array
		// places in new array if not found to be a duplicate
		for (int i = 0; i < 10; i++) {
			boolean canAdd = true;
			for (int j = 0; j < counting; j++) {
				if (y[j] == list[i]) {
					canAdd = false;
				}
			}
			if (canAdd) {
				y[counting] = list[i];
				counting++;
			}
		}
		return y;
	}

}
