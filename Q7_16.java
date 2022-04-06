//this program compares the runtime of linear-search and binary search
// and then displays the results in terms of milliseconds.
import java.util.*;

public class Q7_16 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10000];
		for (int i = 0; i < 10000; i++) {
			numbers[i] = rand.nextInt();
		}
		
		//perform linearSearch
		int key = rand.nextInt();
		long startTime = System.currentTimeMillis();
		int isItPresent = linearSearch(numbers, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("LinearSearch time: " + executionTime);

		// Sorts array
		Arrays.sort(numbers);

		//perform binarySearch
		startTime = System.currentTimeMillis();
		isItPresent = binarySearch(numbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("BinarySearch time: " + executionTime);
	}
	
	//linear search for key
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
	
	//binary search for key
	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key < mid)
				high = mid - 1;
			else if (key > mid)
				low = mid + 1;
			else if (key == mid)
				return mid;
		}
		return -low -1;
	}
	
}
