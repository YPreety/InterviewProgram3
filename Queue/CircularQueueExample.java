package Queue;

//Example of Circular Queues implementation with generics in java, insert and remove element from Circular Queues in java
/*Complexity of Circular Queues in java >

enqueue - O(1) [as we insert element at Rear in Circular Queue]
dequeue - O(1) [as we remove element from front in Circular Queue]*/

public class CircularQueueExample {

	public static void main(String[] args) {
		CircularQueue<Integer> circularQueue = new CircularQueue<Integer>(5); 														

		circularQueue.enqueue(11);
		circularQueue.enqueue(21);
		circularQueue.enqueue(31);
		circularQueue.enqueue(51);
		circularQueue.enqueue(61);

		System.out.print("Elements deQueued from circular Queue: ");
		System.out.print(circularQueue.dequeue() + " ");
		System.out.print(circularQueue.dequeue() + " ");
		System.out.print(circularQueue.dequeue() + " ");
		System.out.print(circularQueue.dequeue() + " ");
		System.out.print(circularQueue.dequeue() + " ");

	}
}

class CircularQueue<E> {

	private E[] circularQueueAr;
	private int maxSize; 

	private int rear;
	private int front; 
	private int number; 

	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		circularQueueAr = (E[]) new Object[this.maxSize];
		number = 0; 
		front = 0;
		rear = 0;
	}

	public void enqueue(E item) throws QueueFullException {
		if (isFull()) {
			throw new QueueFullException("Circular Queue is full");
		} else {
			circularQueueAr[rear] = item;
			rear = (rear + 1) % circularQueueAr.length;
			number++; 
		}
	}

	public E dequeue() throws QueueEmptyException {
		E deQueuedElement;
		if (isEmpty()) {
			throw new QueueEmptyException("Circular Queue is empty");
		} else {
			deQueuedElement = circularQueueAr[front];
			circularQueueAr[front] = null;
			front = (front + 1) % circularQueueAr.length;
			number--; 
		}
		return deQueuedElement;
	}
	public boolean isFull() {
		return (number == circularQueueAr.length);
	}
	public boolean isEmpty() {
		return (number == 0);
	}

}

class QueueFullException extends RuntimeException {

	public QueueFullException() {
		super();
	}

	public QueueFullException(String message) {
		super(message);
	}

}

class QueueEmptyException extends RuntimeException {

	public QueueEmptyException() {
		super();
	}

	public QueueEmptyException(String message) {
		super(message);
	}

}