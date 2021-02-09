package LinkedListProgram;

/*Displaying LinkedList [first--->last]: 11 22 33 44 55 66   LinkedList is NOT CIRCULAR
LinkedList has been succesfully converted into CircularLinkedList
Displaying LinkedList [first--->last]: 11 22 33 44 55 66 33 44 55 66 33 44   LinkedList is CIRCULAR*/

public class SinglyLinkedListCircularOrNot {

	public static void main(String[] args) {
		LinkedList7 linkedList = new LinkedList7();
		linkedList.insert(66);
		linkedList.insert(55);
		linkedList.insert(44);
		linkedList.insert(33);
		linkedList.insert(22);
		linkedList.insert(11);
		linkedList.displayLinkedList();
		linkedList.findCircularOrNot();
		System.out.println();
		linkedList.makeLinkedListCircular();
		linkedList.displayLinkedList();
		linkedList.findCircularOrNot();
	}
}

class LinkedList7 {
	Node first = null;
	Node circularPoint1; 
	Node circularPoint2;
	Node slowPointer; 
	Node fastPointer; 
	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = first;
		first = newNode;
		if (data == 33)
			circularPoint1 = newNode;
		if (data == 66)
			circularPoint2 = newNode;
	}
	public void makeLinkedListCircular() {
		circularPoint2.next = circularPoint1;
		System.out.println("LinkedList has been succesfully converted into CircularLinkedList");
	}
	public void findCircularOrNot() {
		slowPointer = first;
		fastPointer = first;
		while ((slowPointer != fastPointer || slowPointer == first) 
				&& fastPointer.next != null 
				&& fastPointer.next.next != null) {
			slowPointer = slowPointer.next; 
			fastPointer = fastPointer.next.next; 
		}
		if (slowPointer == fastPointer)
			System.out.println("LinkedList is CIRCULAR");
		else
			System.out.println("LinkedList is NOT CIRCULAR");
	}
	public void displayLinkedList() {
		Node tempDisplay = first;
		int displayLimiterCtr = 0; 
		System.out.print("Displaying LinkedList [first--->last]: ");
		while (tempDisplay != null) {
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next;
			if (++displayLimiterCtr >= 12) 
				break;
		}
		System.out.println();
	}
}