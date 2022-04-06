//This program gets an integer from the user
//and displays it into binary form
import java.util.Scanner;

public class Q18_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        System.out.print("Binary Form: " + dec2Bin(number));
    }

	//returns the value to a string and prints using shift right operation
    public static String dec2Bin(int value) {
    	String string;
    	if ((value & 1) == 1) {
    		string = "1";
    	}
    	else {
    		string = "0";
    	}
        if (value == 0 || value == 1)
            return string;
        else {
            return dec2Bin(value >> 1) + string;
        }
    }

}
