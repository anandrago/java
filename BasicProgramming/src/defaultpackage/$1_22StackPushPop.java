package defaultpackage;

import java.util.Stack;

public class $1_22StackPushPop {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("bottom");
		printStack(stack);
		stack.push("Second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);

	}
	public static void printStack(Stack<String> s) {
		if(s.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.printf("%s TOP\n",s);
	}

}
