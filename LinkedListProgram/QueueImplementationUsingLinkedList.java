package LinkedListProgram;

public class QueueImplementationUsingLinkedList {

	public static void main(String[] args) {
		QueueLinkedList queueLinkedList = new QueueLinkedList();

		System.out.println("INSERTING AT LAST (REAR) IN QUEUE IMPLEMENTED USING LINKED LIST ");
		queueLinkedList.insert(11); // insert node.
		queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING
										// LINKED LIST
		queueLinkedList.insert(71); // insert node.
		queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING
										// LINKED LIST
		queueLinkedList.insert(39); // insert node.
		queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING
										// LINKED LIST
		queueLinkedList.insert(31); // insert node.
		queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING
										// LINKED LIST

		System.out.println("\nDELETING FROM FIRST (FRONT) OF QUEUE IMPLEMENTED USING LINKED LIST ");

		queueLinkedList.remove(); // remove Node
		queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING
										// LINKED LIST
		queueLinkedList.remove(); // remove Node
		queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING
										// LINKED LIST
		queueLinkedList.remove(); // remove Node
		queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING
										// LINKED LIST
		queueLinkedList.remove(); // remove Node
		queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING
										// LINKED LIST

	}

}

class QueueLinkedList {

	LinkedList13 linkedList = new LinkedList13(); // creation of Linked List

	/**
	 * Insert element at rear in Queue
	 */
	public void insert(int value) {
		linkedList.insertLast(value);
	}

	/**
	 * Removes elements from front of Queue
	 */
	public void remove() throws QueueEmptyException {
		try {
			linkedList.deleteFirst();
		} catch (LinkedListEmptyException llee) {
			throw new QueueEmptyException();
		}
	}

	/**
	 * Display queue.
	 */
	public void displayStack() {
		System.out.print("Displaying Queue> Front to Rear: ");
		linkedList.displayLinkedList();
	}

}

class LinkedList13 {
	private Node first; // ref to first link on list

	/**
	 * LinkedList constructor
	 */
	public LinkedList13() {
		first = null;
	}

	/**
	 * Inserts new Node at last of LinkedList.
	 */
	public void insertLast(int data) {
		Node newNode = new Node(data); // Creation of New Node.

		if (first == null) { // means LinkedList is empty, make first point to
								// new Node.
			first = newNode; // first ---> newNode
			return;
		}

		Node tempNode = first; // save reference to first Node in tempNode- so
								// that we could return saved reference.
		while (tempNode.next != null) { // Executes until we don't find last
										// Node of LinkedList.
										// If next of some Node is pointing to
										// null, that means it's a last Node.
			tempNode = tempNode.next; // move to next Node.
		}
		tempNode.next = newNode; // make last's Node next point to new Node
	}

	/**
	 * Deletes first Node
	 */
	public Node deleteFirst() {
		if (first == null) { // means LinkedList in empty, throw exception.
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node tempNode = first; // save reference to first Node in tempNode- so
								// that we could return saved reference.
		first = first.next; // delete first Node (make first point to second
							// node)
		return tempNode; // return tempNode (i.e. deleted Node)
	}

	/**
	 * Display LinkedList
	 */
	public void displayLinkedList() {
		Node tempDisplay = first; // start at the beginning of linkedList
		while (tempDisplay != null) { // Executes until we don't find end of
										// list.
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; // move to next Node
		}
		System.out.println();

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

/*
 * OUTPUT
 * 
 * INSERTING AT LAST (REAR) IN QUEUE IMPLEMENTED USING LINKED LIST Displaying
 * Queue> Front to Rear: 11 Displaying Queue> Front to Rear: 11 71 Displaying
 * Queue> Front to Rear: 11 71 39 Displaying Queue> Front to Rear: 11 71 39 31
 * 
 * DELETING FROM FIRST (FRONT) OF QUEUE IMPLEMENTED USING LINKED LIST Displaying
 * Queue> Front to Rear: 71 39 31 Displaying Queue> Front to Rear: 39 31
 * Displaying Queue> Front to Rear: 31 Displaying Queue> Front to Rear:
 * 
 */