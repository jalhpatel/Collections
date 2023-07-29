package implementation;

import java.util.Arrays;

public class Stack {

	int top = 0;
	int[] stack = new int[5];

	/**
	 * This Method pushes Data into the Stack
	 * 
	 * @param data
	 */
	public void push(int data) {

		if (top == 5) {
			System.out.println("Stack is full");
		} else {
			stack[top] = data;
			top++;
		}

	}

	/**
	 * This method removes last added Data element from stack
	 * 
	 * @return - Removed Element from Stack
	 */
	public int pop() {
		int data = 0;
		if (!isEmpty()) {
			top--;
			data = stack[top];
			stack[top] = 0;
		} else {
			System.out.println("Stack is empty");
		}
		return data;

	}

	public int peek() {
		int data = stack[top - 1];
		return data;
	}

	/**
	 * This method Prints the Stack.
	 */
	public void show() {

		System.out.println(Arrays.toString(stack));
//		Arrays.toString(stack);

	}

	/**
	 * This method return current size of the Stack.
	 * 
	 * @return - current size of the stack.
	 */
	public int size() {
		return top;
	}

	/**
	 * This method returns if stack is empty or not.
	 * 
	 * @return - true = Empty , false - not Empty
	 */
	public boolean isEmpty() {
		return top <= 0;
	}

	/**
	 * This method returns if the stack is full or not.
	 * 
	 * @return - true = full , false - not full
	 */
	public boolean isFull() {
		return top == 5;
	}

}
