package LinkedListProgram;

/*Displaying LinkedList (first--->last): 
Node with data=92 inserted at first.
Node with data=20 inserted at first Node, beacuse newNode is smallest of existing Nodes.
Node with data=19 inserted at first Node, beacuse newNode is smallest of existing Nodes.
Node with data=29 inserted successfully in middle of LinkedList.
Node with data=99 inserted successfully at last of LinkedList.
Displaying LinkedList (first--->last): 19 20 29 92 99 */

public class SinglyLinkedListInsertNodeInBetween {

	public static void main(String[] args) {
		LinkedList2 linkedList = new LinkedList2(); 
		linkedList.displayLinkedList();
		linkedList.insertNodeInSortedLinkedList(92);
		linkedList.insertNodeInSortedLinkedList(20);
		linkedList.insertNodeInSortedLinkedList(19);
		linkedList.insertNodeInSortedLinkedList(29);
		linkedList.insertNodeInSortedLinkedList(99);
		linkedList.displayLinkedList(); 
	}
}

class LinkedList2 {
	private Node first; 
	public LinkedList2() {
		first = null;
	}
	public void insertNodeInSortedLinkedList(int data) {
		Node newNode = new Node(data);
		if (first == null) {
			first = newNode; 
			System.out.println("Node with data=" + newNode.data + " inserted at first.");
			return;
		}
		if (first.data >= newNode.data) {
			newNode.next = first;
			first = newNode; 
			System.out.println("Node with data=" + newNode.data
					+ " inserted at first Node, beacuse newNode is smallest of existing Nodes.");
			return;
		}
		Node current = first;
		Node previous = null;
		while (current != null) {
			if (current.data < newNode.data) {
				if (current.next == null) { 
					current.next = newNode;
					System.out.println(
							"Node with data=" + newNode.data + " inserted successfully at last of LinkedList.");
					return;
				}
				previous = current;
				current = current.next; 
			} else {
				newNode.next = previous.next; 
				previous.next = newNode; 
				System.out
						.println("Node with data=" + newNode.data + " inserted successfully in middle of LinkedList.");
				return;
			}
		}
	}

	public void displayLinkedList() {
		System.out.print("Displaying LinkedList (first--->last): ");
		Node tempDisplay = first; 
		while (tempDisplay != null) { 
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; 
		}
		System.out.println();
	}
}