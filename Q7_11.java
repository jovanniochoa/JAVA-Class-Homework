import java.util.*;
public class Q7_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] x = new double[10];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			x[i] = in.nextDouble();
		}
		System.out.printf("The mean is %.2f", mean(x));
		System.out.printf("\nThe standard deviation is %.5f", deviation(x));
	}
	
	/** Compute the deviation of double values */
	public static double deviation(double[] x) {
		double deviation = 0;
		for (int i = 0; i < 10; i++) {
			deviation += Math.pow((x[i] - mean(x)), 2);
		}
		return Math.sqrt(deviation/9);
	}
	
	/** Compute the mean of an array of double values */
	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += x[i];
		}
		return sum/10.0;
	}

}
