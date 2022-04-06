//This program gets the 9 ISBN integers and calculates the tenth
//if the tenth is 10, it replaces it with X
import java.util.*;

public class Q3_9 {

	public static void main(String[] args) {
		
		//load variables and stores them/ converts them as necessary
		int tenthValue = 0;
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt(); // stores the user integer as an integer
		System.out.println(number);
		int length = String.valueOf(number).length();
		int[] intArray = new int[9];
		String numberStr = Integer.toString(number);// changes the integer to string
		String numberStr1 = ("000000000" + numberStr).substring(numberStr.length()); //pads the integer
		
		//prints out the users first nine digits
		System.out.print("The ISBN-10 number is ");
		System.out.print(numberStr1);
		
		//multiplies the values then stores the values into an array
		for(int i = 0;i < 9; i++) {
			char firstChar = String.valueOf(numberStr1).charAt(i);
			tenthValue = Integer.parseInt(String.valueOf(firstChar));
			tenthValue *= i+1; //multiply before putting into array.
			intArray[i] = tenthValue;
			tenthValue = 0;
		}
		
		//resets tenth value for it's actual purpose
		tenthValue = 0;
		
		// calculates the tenth value
		for (int i = 0; i< 9; i++) {
			tenthValue += intArray[i];
		}
		tenthValue %= 11;
		
		//if the tenth value is 10, change it to X
		if (tenthValue == 10) {
			System.out.print("X");
		}
		else {
			System.out.print(tenthValue);
		}
		
	}

}
