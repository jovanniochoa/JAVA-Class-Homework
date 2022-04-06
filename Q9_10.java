import java.util.*;
//This program gets the user's input of a, b, and c, and
//calculated the discriminant, as well as, determines
//how many roots (if any) there are and displays them
/*            QuadraticEquation
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 -a: double
 -b: double
 -c: double
 +QuadradticEquation(a: double, b: double, c: double)
 +getA(): double
 +getB(): double
 +getC(): double
 +getDiscriminant(): double
 +getRoot1(): double
 +getRoot2(): double
*/
public class Q9_10 {

	public static void main(String[] args) {
		//creates a scanner
		Scanner in = new Scanner(System.in);

		//gets input for a, b, and c
		System.out.print("Enter a, b, c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		//makes a QuadraticEquation
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

		//calculates real roots
		if (quadraticEquation.getDiscriminant() < 0) {
			System.out.println("The equation has no roots");
		}
		else if (quadraticEquation.getDiscriminant() > 0) {
			System.out.println("roots: " + quadraticEquation.getRoot1() + ", " + quadraticEquation.getRoot2());
		}
		else {
			if (quadraticEquation.getRoot1() > 0) {
				System.out.println("root: " + quadraticEquation.getRoot1());
			}
			else {
				System.out.println("root: " + quadraticEquation.getRoot2());
			}
		}
	}
}

class QuadraticEquation {
	//creates data field
	private double a;
	private double b;
	private double c;

	//sets a, b , and c
	QuadraticEquation(double tempA, double tempB, double tempC) {
		a = tempA;
		b = tempB;
		c = tempC;
	}

	//gets a
	public double getA() {
		return a;
	}

	//gets B
	public double getB() {
		return b;
	}

	//gets c
	public double getC() {
		return c;
	}

	// gets discriminant
	public double getDiscriminant() {
		return Math.pow(b, 2) - (4*a*c);
	}

	//gets positive root
	public double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		else {
			return ((-b) + Math.sqrt((b*b) - 4*a*c)) / (2*a);
		}
	}

	//gets negative root
	public double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		else {
			return ((-b) - Math.sqrt((b*b) - 4*a*c)) / (2*a);
		}
	}
}