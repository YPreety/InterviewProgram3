package LinkedListProgram;

/*Displaying LinkedList [first--->last]: 29 19 20 92 
Node with data=29 was found on first and has been deleted.
Node with data=11 wasn't found for deletion.
Displaying LinkedList [first--->last]: 19 20 92 */

public class SinglyLinkedListDeleteSpecificNode {

	public static void main(String[] args) {
		LinkedList3 linkedList = new LinkedList3(); 
		linkedList.insertFirst(92);
		linkedList.insertFirst(20);
		linkedList.insertFirst(19);
		linkedList.insertFirst(29);
		linkedList.displayLinkedList(); 
		linkedList.deleteSpecificNode(29);
		linkedList.deleteSpecificNode(11);
		linkedList.displayLinkedList(); 
	}
}

class LinkedList3 {
	private Node first; 
	public LinkedList3() {
		first = null;
	}
	public void insertFirst(int data) {
		Node newNode = new Node(data); 
		newNode.next = first; 
		first = newNode; 
	}
	public Node deleteSpecificNode(int deleteKey) {
		if (first == null) { 
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		if (first.data == deleteKey) { 
			Node tempNode = first; 
			first = first.next;
			System.out.println("Node with data=" + tempNode.data + " was found on first and has been deleted.");
			return tempNode; 
		}
		Node previous = null;
		Node current = first;
		while (current != null) {
			if (current.data == deleteKey) {
				System.out.println("Node with data=" + current.data + " has been deleted.");
				previous.next = current.next; 
				return current; 
			} else {
				if (current.next == null) { 
					System.out.println("Node with data=" + deleteKey + " wasn't found for deletion.");
					return null;
				}
				previous = current;
				current = current.next; 
			}
		}
		return null;
	}
	public void displayLinkedList() {
		System.out.print("Displaying LinkedList [first--->last]: ");
		Node tempDisplay = first; 
		while (tempDisplay != null) { 
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next;
		}
		System.out.println();
	}
}