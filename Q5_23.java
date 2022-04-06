//This program finds the difference between cancellation error summations
//It displays the difference to compare what gets left out in large number
//additon manipulation
public class Q5_23 {

	public static void main(String[] args) {
		
		//initialize variables
		double leftToRight = 0.0;
		double rightToLeft = 0.0;
		
		//calculates the sum of left to right and right to left
		for (double i = 1.0; i <= 50000.0; i++) {
			leftToRight += 1 / i;
		}
		for (double j = 50000.0; j >= 1.0; j--) {
			rightToLeft += 1 / j;
		}

		//Shows the sum from left to right, right to left, then the difference
		System.out.println("Sum from Left to Right: " + leftToRight);
		System.out.println("Sum from Right to Left: " + rightToLeft);
		System.out.println("Difference: " + (rightToLeft - leftToRight));
		

	}

}
