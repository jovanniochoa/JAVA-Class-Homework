//this program makes an array list and calculates the sum
//it then displays the data to the user
import java.util.ArrayList;
import java.util.Scanner;

public class Q11_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//makes an array list
		ArrayList<Double> list = new ArrayList<Double>();

		//gets five numbers form the user
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(in.nextDouble());
		}

		//shows the sum or array
		System.out.println("Sum: " + sumArray(list));
	}

	//method for calculating sum
	public static double sumArray(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
