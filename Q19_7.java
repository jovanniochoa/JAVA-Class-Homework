//This program finishes Q9_4 and finds the key
public class Q19_7 {

	//implemented method
	public static <E extends Comparable<E>>
	int binarySearch(E[] list, E key) {
		int high = list.length - 1;
		int low = 0;
		
		//start the find
		while (high >= low) {
			int mid = (low + high / 2);
			if (key.compareTo(list[mid]) < 0) {
				high = mid - 1;
			}
			if (key.compareTo(list[mid]) == 0) {
				return mid;
			}
			else {
				low = mid + 1;
			}
		}
		return -low-1;
	}
}
