//This program takes an integer from the user and prints it backwards
import java.util.Scanner;

public class Q18_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//asks the user to enter a number
        System.out.print("Enter an integer: ");
        int value = in.nextInt();
        
        
        reverseDisplay(value);

    }

	//goes through displaying values backwards
    public static void reverseDisplay(int value) {

        if (value <= 0) {
            return;
        }

        System.out.print(value % 10);
        reverseDisplay(value/10);
    }

}
