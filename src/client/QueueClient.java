package client;

import implementation.Queue;

public class QueueClient {

	public static void main(String[] args) {

		Queue queue = new Queue();

		queue.enQueue(2);
		queue.enQueue(4);
		queue.enQueue(6);
		queue.enQueue(8);
		queue.enQueue(9);
//		queue.enQueue(1);

		queue.show();
//
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
//		System.out.println(queue.deQueue());
//		
//		System.out.println("is Queue Empty : "+ queue.isEmpty());
//		
		queue.show();
//		
//		queue.enQueue(2);
//		
//		queue.show();

	}

}
