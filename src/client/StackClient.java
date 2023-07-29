package client;

import implementation.DStack;
import implementation.Stack;

public class StackClient {

	public static void main(String[] args) {

//		Stack stack = new Stack();
//
//		stack.push(4);
//		stack.push(7);
//		stack.push(9);
//		stack.push(8);
//		stack.push(5);
//
//		System.out.println("size is " + stack.size());
//
//		stack.show();
//
//		stack.push(15);
//
//		stack.show();

//		stack.push(15);
//		stack.push(13);
//		stack.show();
//
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//
//		System.out.println("size is " + stack.size());
//		
//		System.out.println(stack.pop());
		
		/////////////////////////////////////////////////
		
		
		DStack dStack = new DStack();
		
		dStack.push(4);
		dStack.push(7);
		dStack.push(9);
		dStack.push(8);
		dStack.push(5);
		
		dStack.show();
		
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		
		System.out.println(dStack.pop());

	}

}
