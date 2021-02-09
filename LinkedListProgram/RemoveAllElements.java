package LinkedListProgram;

import java.util.LinkedList;

//remove all elements of a LinkedList?
public class RemoveAllElements {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);

		System.out.println(linkedList); // Output : [10, 20, 30, 40, 50]

		// Removing all elements of linkedList
		linkedList.clear();
		System.out.println(linkedList); // Output : []
	}
}
