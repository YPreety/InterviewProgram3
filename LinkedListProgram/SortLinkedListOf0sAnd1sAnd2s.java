package LinkedListProgram;

/*Time Complexity: O(n) where n is number of nodes in linked list.
Auxiliary Space: O(1)*/

public class SortLinkedListOf0sAnd1sAnd2s {

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
		SortLinkedListOf0sAnd1sAnd2s llist = new SortLinkedListOf0sAnd1sAnd2s();
		llist.push(0);
		llist.push(1);
		llist.push(0);
		llist.push(2);
		llist.push(1);
		llist.push(1);
		llist.push(2);
		llist.push(1);
		llist.push(2);

		System.out.println("Linked List before sorting");
		llist.printList();

		llist.sortList();

		System.out.println("Linked List after sorting");
		llist.printList();

	}

	public void push(int new_data) {
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

	void sortList() {
		int count[] = { 0, 0, 0 };
		Node ptr = head;
		while (ptr != null) {
			count[ptr.data]++;
			ptr = ptr.next;
		}
		int i = 0;
		ptr = head;
		while (ptr != null) {
			if (count[i] == 0)
				i++;
			else {
				ptr.data = i;
				--count[i];
				ptr = ptr.next;
			}
		}
	}
}
