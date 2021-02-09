package LinkedListProgram;
//retrieve but not remove the elements of a LinkedList from both the ends?
import java.util.LinkedList;

public class Retrieve_But_Not_Remove {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("FIRST");
		list.add("SECOND");
		list.add("THIRD");
		list.add("FOURTH");
		list.add("FIFTH");

		System.out.println(list); // Output : [FIRST, SECOND, THIRD, FOURTH, FIFTH]

		// Retrieving the elements from the head

		System.out.println(list.element()); // Output : FIRST
		System.out.println(list.getFirst()); // Output : FIRST
		System.out.println(list.peek()); // Output : FIRST
		System.out.println(list.peekFirst()); // Output : FIRST

		// Retrieving the elements from the tail

		System.out.println(list.peekLast()); // Output : FIFTH
		System.out.println(list.getLast()); // Output : FIFTH
	}
}
