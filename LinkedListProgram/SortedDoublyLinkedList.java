package LinkedListProgram;

/*Node with data=11 inserted at first.
Node with data=21 inserted successfully at last of LinkedList.
Node with data=59 inserted successfully at last of LinkedList.
Node with data=14 inserted successfully in middle of LinkedList.
Node with data=39 inserted successfully in middle of LinkedList.
Node with data=66 inserted successfully at last of LinkedList.
Node with data=33 inserted successfully in middle of LinkedList.
Displaying in forward direction [first--->last] : 11 14 21 33 39 59 66 
Displaying in backward direction [last-->first] : 66 59 39 33 21 14 11 

Node with data=11 was found on first and has been deleted.
Node with data=21 has been deleted.
Node with data=29 wasn't found for deletion.
Node with data=59 has been deleted.
Displaying in forward direction [first--->last] : 14 33 39 66 
Displaying in backward direction [last-->first] : 66 39 33 14*/

public class SortedDoublyLinkedList {

	public static void main(String[] args) {
		LinkedList5 linkedList = new LinkedList5();
		linkedList.insertSorted(11);
		linkedList.insertSorted(21);
		linkedList.insertSorted(59);
		linkedList.insertSorted(14);
		linkedList.insertSorted(39);
		linkedList.insertSorted(66);
		linkedList.insertSorted(33);
		linkedList.displayFrwd(); 
		linkedList.displayBckwrd();
		System.out.println();
		linkedList.deleteSpecificNode(11); 
		linkedList.deleteSpecificNode(21); 
		linkedList.deleteSpecificNode(29); 
		linkedList.deleteSpecificNode(59); 
		linkedList.displayFrwd(); 
		linkedList.displayBckwrd();
	}
}

class LinkedList5 {
	private Node4 first; 
	private Node4 last; 
	public LinkedList5() {
		first = null;
	}
	public void insertFirst(int data) { 
		Node4 newNode = new Node4(data); 
		if (first == null) 
			last = newNode; 
		else
			first.previous = newNode; 
		newNode.next = first; 
		first = newNode; 
	}
	public Node4 deleteFirst() { 
		Node4 tempNode = first;
		if (first.next == null) 
			last = null; 
		else
			first.next.previous = null; 
		first = first.next; 
		return tempNode;
	}
	public void insertSorted(int newKey) {
		Node4 newNode = new Node4(newKey);
		if (first == null) { 
			first = last = newNode;
			System.out.println("Node with data=" + newNode.data + " inserted at first.");
			return;
		}
		Node4 current = first;
		if (current.data >= newNode.data) {
			newNode.next = first;
			first.previous = newNode;
			first = newNode; 
			System.out.println("Node with data=" + newNode.data
					+ " inserted at first Node, beacuse newNode is smallest of existing Nodes.");
			return;
		}
		while (true) {
			if (newNode.data > current.data) { 
				if (current.next == null) { 
					last.next = newNode;
					newNode.previous = last;
					last = newNode;
					System.out.println(
							"Node with data=" + newNode.data + " inserted successfully at last of LinkedList.");
					return;
				}
				current = current.next; 
			} else { 
				current = current.previous; 
				newNode.next = current.next; 
				current.next.previous = newNode; 
				newNode.previous = current; 
				current.next = newNode; 
				System.out.println("Node with data=" + newNode.data + " inserted successfully in middle of LinkedList.");
				return;
			}
		}
	}
	public void deleteSpecificNode(int deleteKey) {
		if (first == null) { 
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node4 current = first;
		while (current.data != deleteKey) {
			if (current.next == null) {
				System.out.println("Node with data=" + deleteKey + " wasn't found for deletion.");
				return;
			}
			current = current.next; 
		}
		if (current == first) {
			System.out.println("Node with data=" + current.data + " was found on first and has been deleted.");
			first = first.next;
			first.previous = null;
		} else if (current == last) {
			System.out.println("Node with data=" + current.data + " was found on last has been deleted.");
			last = last.previous;
			last.next = null;
		} else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
			System.out.println("Node with data=" + current.data + " has been deleted.");
		}
	}
	public void displayFrwd() {
		System.out.print("Displaying in forward direction [first--->last] : ");
		Node4 tempDisplay = first; 
		while (tempDisplay != null) { 
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; 
		}
		System.out.println("");
	}
	public void displayBckwrd() {
		System.out.print("Displaying in backward direction [last-->first] : ");
		Node4 tempDisplay = last; 
		while (tempDisplay != null) {
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.previous; 
		}
		System.out.println("");
	}
}