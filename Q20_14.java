//This program uses a postfix expression evaluation using a stack.
//A variable is pushed to stack and then when an operator is reached,
//it's used on  the last two numbers.
import java.util.*;

public class Q20_14 {
	public static void main(String[] args) throws IllegalArgumentException {
		
		Stack<Double> postfix = new Stack<>();

        String[] tokens;
        switch (args.length) {
        	//throws error
            case 0: throw new IllegalArgumentException("Use: 1 2 + 3 *");
            //splits them apart
            case 1: tokens = args[0].split(" "); break;
            default:
                tokens = args;
        }

        for (String token : tokens) {
        	//puts on stack
            if (signs(token.charAt(0))) {
                onStack(postfix, token.charAt(0));
            } 
            //pushes on stack
            else {
                postfix.push(Double.parseDouble(token));
            }
        }
        //displays result
        System.out.println("result = " + postfix.pop());
    }

	
	//checks for operator
	private static boolean signs(char c) {
        return (c == '/' ||
                c == '+' ||
                c == '-' ||
                c == '*');
    }
	
	//puts operator on stack
	public static void onStack(Stack<Double> postfix, char op) {
			double sig1 = postfix.pop();
			double sig2 = postfix.pop();
	
			switch (op) {
				case '+': postfix.push(sig2 + sig1); break;
				case '-': postfix.push(sig2 - sig1); break;
				case '/': postfix.push(sig2 / sig1); break;
				case '*': postfix.push(sig2 * sig1);
			}
	}
}
