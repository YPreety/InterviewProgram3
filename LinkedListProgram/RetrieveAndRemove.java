package LinkedListProgram;

import java.util.LinkedList;

//retrieve and remove and only retrieve an element from specific position of a LinkedList?
public class RetrieveAndRemove {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("SERVLETS");
		list.add("JDBC");

		System.out.println(list); // Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

		// Retrieving and removing an element at index 2 of the list
		System.out.println(list.remove(2)); // Output : JSP
		System.out.println(list); // Output : [JAVA, J2EE, SERVLETS, JDBC]

		// Only retrieving an element at index 2 of the list
		System.out.println(list.get(2)); // Output : SERVLETS
	}
}
