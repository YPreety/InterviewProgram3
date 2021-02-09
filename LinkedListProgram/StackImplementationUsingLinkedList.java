package LinkedListProgram;

public class StackImplementationUsingLinkedList {

	public static void main(String[] args) {
		StackLinkedList stackLinkedList = new StackLinkedList();
		System.out.println("INSERTING AT FIRST (TOP) IN STACK IMPLEMENTED USING LINKED LIST ");
		stackLinkedList.push(39);
		stackLinkedList.displayStack(); 
		stackLinkedList.push(71); 
		stackLinkedList.displayStack(); 
		stackLinkedList.push(11); 
		stackLinkedList.displayStack(); 
		stackLinkedList.push(76); 
		stackLinkedList.displayStack(); 
		System.out.println("\nDELETING FROM FIRST (TOP) FROM STACK IMPLEMENTED USING LINKED LIST ");
		stackLinkedList.pop(); 
		stackLinkedList.displayStack(); 
		stackLinkedList.pop(); 
		stackLinkedList.displayStack(); 
		stackLinkedList.pop(); 
		stackLinkedList.displayStack(); 
		stackLinkedList.pop(); 
		stackLinkedList.displayStack(); 
	}
}

class StackLinkedList {
	LinkedList12 linkedList = new LinkedList12(); 
	public void push(int value) {
		linkedList.insertFirst(value);
	}
	public void pop() throws StackEmptyException {
		try {
			linkedList.deleteFirst();
		} catch (LinkedListEmptyException llee) {
			throw new StackEmptyException();
		}
	}
	public void displayStack() {
		System.out.print("Displaying Stack >  Top to Bottom : ");
		linkedList.displayLinkedList();
	}

}

class LinkedList12 {
	private Node first; 
	public LinkedList12() {
		first = null;
	}
	public void insertFirst(int data) {
		Node newNode = new Node(data); 
		newNode.next = first; 
		first = newNode; 
	}
	public Node deleteFirst() {
		if (first == null) { 
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node tempNode = first; 
		first = first.next; 
		return tempNode; 
	}
	public void displayLinkedList() {
		Node tempDisplay = first; 
		while (tempDisplay != null) { 
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; 
		}
		System.out.println();
	}
}

/*
 * INSERTING AT FIRST (TOP) IN STACK IMPLEMENTED USING LINKED LIST Displaying
 * Stack > Top to Bottom : 39 Displaying Stack > Top to Bottom : 71 39
 * Displaying Stack > Top to Bottom : 11 71 39 Displaying Stack > Top to Bottom
 * : 76 11 71 39
 * 
 * DELETING FROM FIRST (TOP) FROM STACK IMPLEMENTED USING LINKED LIST Displaying
 * Stack > Top to Bottom : 11 71 39 Displaying Stack > Top to Bottom : 71 39
 * Displaying Stack > Top to Bottom : 39 Displaying Stack > Top to Bottom :
 */