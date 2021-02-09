package LinkedListProgram;

public class SinglyLinkedListatLast {

	public static void main(String[] args) {
		LinkedList1 linkedList = new LinkedList1(); // creation of Linked List

		linkedList.insertLast(11);
		linkedList.insertLast(21);
		linkedList.insertLast(59);
		linkedList.insertLast(14);
		linkedList.insertLast(39);

		linkedList.displayLinkedList(); // display LinkedList

		System.out.print("Deleted Nodes: ");
		Node1 deletedNode = linkedList.deleteLast(); // delete Node
		deletedNode.displayNode(); // display deleted Node.
		deletedNode = linkedList.deleteLast(); // delete Node
		deletedNode.displayNode(); // display deleted Node.

		System.out.println();// sysout used to format output
		linkedList.displayLinkedList(); // Again display LinkedList

	}

}

class LinkedList1 {
	private Node1 first; // ref to first link on list

	/**  LinkedList constructor */
	public LinkedList1() {
		first = null;
	}

	/**  Inserts new Node at last of Singly LinkedList. */
	public void insertLast(int data) {
		Node1 newNode = new Node1(data); // Creation of New Node.

		if (first == null) { // means LinkedList is empty, make first point to
								// new Node.
			first = newNode; // first ---> newNode
			return;
		}

		Node1 tempNode = first; // save reference to first Node in tempNode- so
								// that we could return saved reference.
		while (tempNode.next != null) { // Executes until we don't find last
										// Node of LinkedList.
										// If next of some Node is pointing to
										// null, that means it's a last Node.
			tempNode = tempNode.next; // move to next Node.
		}
		tempNode.next = newNode; // make last's Node next point to new Node
	}

	/**  Deletes last Node from Singly LinkedList */
	public Node1 deleteLast() {

		// Case1: when there is no element in LinkedList
		if (first == null) { // means LinkedList in empty, throw exception.
			throw new LinkedListEmptyException1("LinkedList doesn't contain any Nodes.");
		}

		// Case2: when there is only one element in LinkedList
		if (first.next == null) { // means LinkedList consists of only one
									// element, delete that.
			Node1 tempNode = first; // save reference to first Node in tempNode-
									// so that we could return saved reference.
			first = first.next; // delete firstNode (make first point to
								// secondNode)
			return tempNode; // return deleted Node.
		}

		// Case3: when there are atLeast two elements in LinkedList
		Node1 previous = null;
		Node1 current = first;

		while (current.next != null) {// Executes until we don't find last Node
										// of LinkedList.
										// If next of some Node is pointing to
										// null, that means it's a last Node.
			previous = current;
			current = current.next; // move to next node.
		}

		previous.next = null; // Now, previous is pointing to second last Node
								// of LinkiedList,
								// make it point to null [it byPasses current
								// Node(last Node of LinkedList) which was in
								// between]
		return current;
	}

	/**  Display LinkedList  */
	public void displayLinkedList() {
		System.out.print("Displaying LinkedList [first--->last]: ");
		Node1 tempDisplay = first; // start at the beginning of linkedList
		while (tempDisplay != null) { // Executes until we don't find end of
										// list.
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; // move to next Node
		}
		System.out.println();

	}

}

class Node1 {
	public int data; // data in Node.
	public Node1 next; // points to next Node in list.

	/**
	 * Constructor
	 */
	public Node1(int data) {
		this.data = data;
	}

	/**
	 * Display Node's data
	 */
	public void displayNode() {
		System.out.print(data + " ");
	}
}

class LinkedListEmptyException1 extends RuntimeException {
	public LinkedListEmptyException1() {
		super();
	}

	public LinkedListEmptyException1(String message) {
		super(message);
	}
}

/*Displaying LinkedList [first--->last]: 11 21 59 14 39 
Deleted Nodes: 39 14 
Displaying LinkedList [first--->last]: 11 21 59 */