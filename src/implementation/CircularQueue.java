package implementation;

public class CircularQueue {

	int[] queue = new int[5];

	int size;
	int front;
	int rear;

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("queue is full");
		} else {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size++;
		}
	}

	public int deQueue() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("queue is empty");
		} else {
			data = queue[front];
			front = (front + 1) % 5;
			size--;
		}

		return data;
	}

	public void show() {
//		System.out.println(Arrays.toString(queue));

		System.out.println("Elements in Queue");

		for (int i = 0; i < size; i++) {
			System.out.println(queue[(front + i) % 5]);
		}

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size <= 0;
	}

	public boolean isFull() {
		return size == 5;
	}

}
