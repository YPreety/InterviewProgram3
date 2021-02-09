package LinkedListProgram;
//program which implements LinkedList as a Queue (FIFO)?
import java.util.LinkedList;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();

		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);

		System.out.println(queue); // Output : [10, 20, 30, 40]
		// Removing the elements from the queue

		System.out.println(queue.poll()); // Output : 10
		System.out.println(queue.poll()); // Output : 20
	}
}
