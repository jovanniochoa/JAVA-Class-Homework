//This program determines how many roots a quadratic formula has
//The program then displays the roots if available

import java.util.*;

public class Q3_1 {

	public static void main(String[] args) {
		
		//load in variables to use
		double A = 0.00;
		double B = 0.00;
		double C = 0.00;
		double disc = 0.00;
		double plus = 0.00;	//used to add discriminant
		double minus = 0.00; //used to subtract discriminant
		
		//get the 3 digits
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();
		
		//calculations for discriminant
		disc = (B*B)-(4*A*C);
		
		//if discriminant > 0 show the two roots
		if (disc > 0) {
			plus = (-B + (Math.pow(disc, 0.5)))/(2*A); // calculates a root
			plus = Double.parseDouble(String.format("%.6f", plus)); //6 decimal places
			minus = (-B - (Math.pow(disc, 0.5)))/(2*A); 
			minus = Double.parseDouble(String.format("%.5f", minus)); //5 decimal places
			System.out.println("The system has two roots " + plus + " and "+ minus );
		}
		
		//if discriminant = 0 show one root
		if (disc == 0) {
			plus = (-B + (Math.pow(disc, 0.5)))/(2*A);
			if (plus % 1 == 0) { // convert to integer to print no decimal places
				int intnum = (int) Math.round(plus);
				System.out.println("The system has one root " + intnum );
			}
			else {
				plus = Double.parseDouble(String.format("%.6f", plus)); //6 decimal places
				System.out.println("The system has one root " + plus );
			}
		}
		
		//if discriminant < 0 print no roots
		if (disc < 0) {
			System.out.println("The system has no real roots");
		}

	}

}
