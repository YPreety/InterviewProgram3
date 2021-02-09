package LinkedListProgram;

import java.util.LinkedList;

//get the position of last occurrence of a given element in a LinkedList?
public class Get_position_of_last_occurrence {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("AAA");
		linkedList.add("BBB");
		linkedList.add("CCC");
		linkedList.add("BBB");
		linkedList.add("FFF");
		linkedList.add("BBB");

		System.out.println(linkedList); // Output : [AAA, BBB, CCC, BBB, FFF, BBB]

		// Getting the position of last occurrence of "BBB"
		System.out.println(linkedList.lastIndexOf("BBB")); // Output : 5
	}
}
