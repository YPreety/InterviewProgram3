package LinkedListProgram;

import java.util.LinkedList;

// replace an element at a specific position of a LinkedList with the given element?
public class ReplaceElement {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");

		System.out.println(list); // Output : [ONE, TWO, THREE, FOUR]

		// Replacing an element at index 2 with "ZERO"
		list.set(2, "ZERO");
		System.out.println(list); // Output : [ONE, TWO, ZERO, FOUR]
	}
}
