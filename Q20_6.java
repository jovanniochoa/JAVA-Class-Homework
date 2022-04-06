//This program calculates the time it takes for get the index and iterator at 
//5000000. It then displays the time it takes.
import java.util.*;

public class Q20_6 {

	public static void main(String[] args) {
		
		//storing in linked list
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 5000000; i++) {
			arrayList.add(i);
		}
		
		LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

		//time for an iterator
		long startIterator = System.currentTimeMillis();
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next();
		}
		long stopIterator = System.currentTimeMillis();

		//time for get(index)
		long startIndex = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			linkedList.get(i);
		}
		long stopIndex = System.currentTimeMillis();
		
		//display iterator and get(index) time
		System.out.println("Iterator time:" + (startIterator - stopIterator) + " millis");
		System.out.println("get(index) time:" + (startIndex - stopIndex) + " millis");
	}

}
