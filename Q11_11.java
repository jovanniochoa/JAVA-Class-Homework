//this program makes an array list and puts it into an array
//it then sorts through he array and gives the sorted array
//back to the user
import java.util.ArrayList;
import java.util.Scanner;

public class Q11_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//makes array list
		ArrayList<Integer> list = new ArrayList<Integer>();

		//gets five numbers form user
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(in.nextInt());
		}

		//sort array and displays
		sortArray(list);
		System.out.println(list.toString());
	}

	/** Sorts an ArrayList of Integers */
	public static void sortArray(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			java.util.Collections.sort(list);
		}
	}
}
