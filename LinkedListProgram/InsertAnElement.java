package LinkedListProgram;

import java.util.LinkedList;

//How do you insert an element at the head and tail of a LinkedList?

public class InsertAnElement {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.addLast(20);
		list.offer(30);
		list.offerLast(40);
		// Printing the elements of list

		System.out.println(list); // Output : [10, 20, 30, 40]

		// Adding elements at the beginning of the list

		list.offerFirst(1);
		list.addFirst(2);
		// Printing the elements of list
		System.out.println(list); // Output : [2, 1, 10, 20, 30, 40]
	}
}
