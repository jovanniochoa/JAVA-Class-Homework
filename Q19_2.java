//This program asks the user to input 5 strings
//and it displays the words in reverse order
import java.util.ArrayList;
import java.util.Scanner;

public class Q19_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//makes a stack
		GenericStack<String> stack = new GenericStack<>(); 

		//asks for 5 strings
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			stack.push(in.next());
		}

		//displays in reverse
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

}

class GenericStack<E> extends ArrayList<E> {
	
	private static final long serialVersionUID = 1L;

	//return on top of stack
	public E peek() {
		return get(size() - 1);
	}

	//push to stack
	public void push(E o) {
		add(o);
	}

	//removes and returns to stack
	public E pop() {
		E o = get(size() - 1);
		remove(size() - 1);
		return o;
	}

	@Override //overrides string method
	public String toString() {
		return "stack: " + super.toString();
	}
}