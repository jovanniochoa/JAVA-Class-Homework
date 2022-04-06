//This program splits up the elements before and after a pivot 
// it then displays the the numbers in an array corresponding
//to the pivot
import java.util.Scanner;

public class Q7_32 {

	public static void main(String[] args) {
		//asks the user for input and stores it
		System.out.print("Enter list: ");	
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[in.nextInt()];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		
		partition(numbers);//partition indexing
		   
		//displays the numbers/output
		System.out.print("After the partition, the list is ");
		for (int i = 0; i < numbers.length; i++) {
		   System.out.print(numbers[i] + " ");
		}
	}
	
	//finds the index of the partition
	public static int partition(int[] list) {
		int index = 0;
		int pivot = list[0];
		int high = list.length-1; //does less than less.length comparisons
		while(index < high) { 
			if(pivot <= list[index+1]) {  // swaps using a temporary variable
				int temp = list[high];
				list[high]=list[index+1];
				list[index+1] = temp;
				high--;
			} 
			else {
				list[index] = list[index+1];
				list[index+1] = pivot;
				index++;
			}
		} 	
		return index;  
	}	 
	
}
