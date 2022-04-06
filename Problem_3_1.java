import java.util.*;
import java.lang.*;
import java.io.*;

public class Problem_3_1 {

	public static void main(String[] args) {
		
		double A = 0.00;
		double B = 0.00;
		double C = 0.00;
		double disc = 0.00;
		double plus = 0.00;
		double minus = 0.00;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();
		
		disc = (B*B)-(4*A*C);
		
		if (disc > 0) {
			plus = (-B + (Math.pow(disc, 0.5)))/(2*A);
			plus = Double.parseDouble(String.format("%.6f", plus));
			minus = (-B - (Math.pow(disc, 0.5)))/(2*A);
			minus = Double.parseDouble(String.format("%.5f", minus));
			System.out.println("The system has two roots " + plus + " and "+ minus );
		}
		
		if (disc == 0) {
			plus = (-B + (Math.pow(disc, 0.5)))/(2*A);
			if (plus % 1 == 0) {
				int intnum = (int) Math.round(plus);
				System.out.println("The system has one root " + intnum );
			}
			else {
			plus = Double.parseDouble(String.format("%.6f", plus));
			System.out.println("The system has one root " + plus );
			}
		}
		
		if (disc < 0) {
			System.out.println("The system has no real roots");
		}

	}

}
