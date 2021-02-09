package LinkedListProgram;

import java.util.HashMap;

public class Union_of_two_Linked_Lists_Hashing {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		Union_of_two_Linked_Lists_Hashing llist1 = new Union_of_two_Linked_Lists_Hashing();
		Union_of_two_Linked_Lists_Hashing llist2 = new Union_of_two_Linked_Lists_Hashing();
		Union_of_two_Linked_Lists_Hashing union = new Union_of_two_Linked_Lists_Hashing();

		/* create a linked list 10->15->4->20 */
		llist1.push(20);
		llist1.push(4);
		llist1.push(15);
		llist1.push(10);

		/* create a linked list 8->4->2->10 */
		llist2.push(10);
		llist2.push(2);
		llist2.push(4);
		llist2.push(8);
		union = union.getUnion(llist1.head, llist2.head);

		System.out.println("First List is");
		llist1.printList();

		System.out.println("Second List is");
		llist2.printList();

		System.out.println("Union List is");
		union.printList();

	}

	Union_of_two_Linked_Lists_Hashing getUnion(Node head1, Node head2) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		Node n1 = head1;
		Node n2 = head2;
		Union_of_two_Linked_Lists_Hashing result = new Union_of_two_Linked_Lists_Hashing();
		while (n1 != null) {
			if (hmap.containsKey(n1.data)) {
				int val = hmap.get(n1.data);
				hmap.put(n1.data, val + 1);
			} else {
				hmap.put(n1.data, 1);
			}
			n1 = n1.next;
		}
		while (n2 != null) {
			if (hmap.containsKey(n2.data)) {
				int val = hmap.get(n2.data);
				hmap.put(n2.data, val + 1);
			} else {
				hmap.put(n2.data, 1);
			}
			n2 = n2.next;
		}
		for (int a : hmap.keySet()) {
			result.append(a);
		}
		return result;
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
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

	public void append(int new_data) {
		if (this.head == null) {
			Node n = new Node(new_data);
			this.head = n;
			return;
		}
		Node n1 = this.head;
		Node n2 = new Node(new_data);
		while (n1.next != null) {
			n1 = n1.next;
		}
		n1.next = n2;
		n2.next = null;
	}
}
