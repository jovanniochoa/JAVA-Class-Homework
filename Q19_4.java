//This program implements the generic method for linear search
public class Q19_4 {
	
	//creates method
	public static <E extends Comparable<E>>
	int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			if (key.compareTo(list[i]) == 0) {
				return i;
			}
		}
		return -1;
	}
}
