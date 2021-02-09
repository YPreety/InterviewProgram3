package LinkedListProgram;

import java.util.LinkedList;

public class AddElementAtSpecificPosition {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list); // Output : [10, 20, 30, 40]

		// Adding an element at index 2
		list.add(2, 9999);

		// Printing the elements of list
		System.out.println(list); // Output : [10, 20, 9999, 30, 40]

		// Creating another LinkedList with elements to add

		LinkedList<Integer> list1 = new LinkedList<Integer>();

		list1.addFirst(111);
		list1.addFirst(222);
		list1.addFirst(333);

		// Printing the elements of list1
		System.out.println(list1); // Output : [333, 222, 111]

		// Adding all elements of list1 at index 3 of list
		list.addAll(3, list1);

		// Printing the elements of list
		System.out.println(list); // Output : [10, 20, 9999, 333, 222, 111, 30, 40]
	}
}
