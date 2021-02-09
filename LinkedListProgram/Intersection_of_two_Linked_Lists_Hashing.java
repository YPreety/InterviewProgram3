package LinkedListProgram;

import java.util.HashSet;

public class Intersection_of_two_Linked_Lists_Hashing {

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
		Intersection_of_two_Linked_Lists_Hashing llist1 = new Intersection_of_two_Linked_Lists_Hashing();
		Intersection_of_two_Linked_Lists_Hashing llist2 = new Intersection_of_two_Linked_Lists_Hashing();
		Intersection_of_two_Linked_Lists_Hashing intersection = new Intersection_of_two_Linked_Lists_Hashing();

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

		intersection = intersection.getIntersection(llist1.head, llist2.head);

		System.out.println("First List is");
		llist1.printList();

		System.out.println("Second List is");
		llist2.printList();

		System.out.println("Intersection List is");
		intersection.printList();
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	Intersection_of_two_Linked_Lists_Hashing getIntersection(Node head1, Node head2) {
		HashSet<Integer> hset = new HashSet<>();
		Node n1 = head1;
		Node n2 = head2;
		Intersection_of_two_Linked_Lists_Hashing result = new Intersection_of_two_Linked_Lists_Hashing();
		while (n1 != null) {
			if (hset.contains(n1.data)) {
				hset.add(n1.data);
			} else {
				hset.add(n1.data);
			}
			n1 = n1.next;
		}
		while (n2 != null) {
			if (hset.contains(n2.data)) {
				result.push(n2.data);
			}
			n2 = n2.next;
		}
		return result;
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
