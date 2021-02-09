package LinkedListProgram;

import java.util.LinkedList;
//remove the elements of a LinkedList from both the ends?
public class RemoveElements {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		list.add("FIVE");
		list.add("SIX");
		list.add("SEVEN");

		System.out.println(list); // Output : [ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN]

		// Removing the elements from the head of the LinkedList
		list.poll();
		list.pollFirst();
		list.remove();
		list.removeFirst();
		// Printing the elements of list
		System.out.println(list); // Output : [FIVE, SIX, SEVEN]

		// Removing elements from the end of the LinkedList
		list.pollLast();
		list.removeLast();
		// Printing the elements of list

		System.out.println(list); // Output : [FIVE]
	}
}
