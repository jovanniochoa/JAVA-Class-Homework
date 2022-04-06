//This program asks the user for a Fibonacci index and 
//displays the number for that index
import java.util.Scanner;

public class Q18_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//aks the user for input
		System.out.print("Enter the Fibonacci index: ");
		int index = in.nextInt();

		//displays results
		System.out.println("The Fibonacci number is " + fib(index));

	}

	//finds Fibobacci number
	public static long fib(long index) {
		int fib = 0;
		int f0 = 0;        
		int f1 = 1;

		if (index == 0)
			return f0;
		if (index == 1)
			return f1;       
        else {
			for (int i = 1; i < index; i++) {
				fib = f0 + f1;     
				f0 = f1;                  
				f1 = fib;          
			} 
		return fib;                            
        }                       
	}
}
