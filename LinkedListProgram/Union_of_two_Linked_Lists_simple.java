package LinkedListProgram;

/*Given two Linked Lists, create union and intersection lists that contain union and intersection of the elements 
present in the given lists. 

Input:
	   List1: 10->15->4->20
	   lsit2:  8->4->2->10
	Output:
	   Union List: 2->8->20->4->15->10
Time Complexity: O(mn)*/

public class Union_of_two_Linked_Lists_simple {

	Node head; // head of list
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		Union_of_two_Linked_Lists_simple llist1 = new Union_of_two_Linked_Lists_simple();
		Union_of_two_Linked_Lists_simple llist2 = new Union_of_two_Linked_Lists_simple();
		Union_of_two_Linked_Lists_simple unin = new Union_of_two_Linked_Lists_simple();

		/* create a linked lits 10->15->5->20 */
		llist1.push(20);
		llist1.push(4);
		llist1.push(15);
		llist1.push(10);

		/* create a linked lits 8->4->2->10 */
		llist2.push(10);
		llist2.push(2);
		llist2.push(4);
		llist2.push(8);

		unin.getUnion(llist1.head, llist2.head);

		System.out.println("First List is");
		llist1.printList();

		System.out.println("Second List is");
		llist2.printList();

		System.out.println("Union List is");
		unin.printList();

	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void getUnion(Node head1, Node head2) {
		Node t1 = head1, t2 = head2;
		while (t1 != null) {
			push(t1.data);
			t1 = t1.next;
		}
		while (t2 != null) {
			if (!isPresent(head, t2.data))
				push(t2.data);
			t2 = t2.next;
		}
	}

	boolean isPresent(Node head, int data) {
		Node t = head;
		while (t != null) {
			if (t.data == data)
				return true;
			t = t.next;
		}
		return false;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
