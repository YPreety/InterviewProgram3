package LinkedListProgram;

import java.util.LinkedList;

public class GetNumberOfElements {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("SERVLETS");
		list.add("JDBC");

		System.out.println(list); // Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

		// Getting the number of elements in list
		System.out.println(list.size()); // Output : 5
	}
}
