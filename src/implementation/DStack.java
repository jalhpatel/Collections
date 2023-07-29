package implementation;

public class DStack {
	Node head;

	class Node {
		int data;
		Node next;

		Node() {
			head = null;
		}
	}

	public void push(int data) {

		Node tempNode = head; // which is null in the beginning and we keep it null
		head = new Node();
		head.data = data;
		head.next = tempNode;

	}

	public int pop() {
		if(head == null) {
			System.out.println("Stack is Empty");
		}
		int data = head.data;
		head = head.next;
		return data;
	}

	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
