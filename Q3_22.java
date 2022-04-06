//This program checks if the user's point is within a circle centered at 0,0 with radius 10
//It then outputs if the point fits within or not.
import java.util.Scanner;

public class Q3_22 {

	public static void main(String[] args) {
		
		//load integers
		double distance = 0;
		double Y = 0;
		double X = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		X = in.nextDouble();//saves second number
		Y = in.nextDouble();// saves first number
		
		
		//calculations
		distance = Math.pow(X, 2.0) + Math.pow(Y, 2.0);
		distance = Math.pow(distance, 0.5);
		
		//displays the output if the point is within the circle
		if (distance > 10) {
			System.out.print("Point (" + X + ", " + Y + ") is not in the circle");
		}
		else {
			System.out.print("Point (" + X + ", " + Y + ") is in the circle");
		}
	}

}
