//this program makes an array list and asks the user to input 10
//integers. It then removes the duplicate integers form the method.
import java.util.ArrayList;
import java.util.Scanner;

public class Q11_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//makes array list
		ArrayList<Integer> list = new ArrayList<Integer>();

		//asks the user to input 10 integers
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(in.nextInt());
		}

		// Invoke removeDuplicate method
		removeDuplicate(list);

		//shows integers
		System.out.print("The distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	//removes duplicate
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}
}
