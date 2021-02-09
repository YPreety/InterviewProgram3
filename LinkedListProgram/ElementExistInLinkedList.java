package LinkedListProgram;

import java.util.LinkedList;

//1) Given an element, how do you find out whether that element exist in a LinkedList or not. If it exist retrieve the position of that element?

public class ElementExistInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("SERVLETS");
		list.add("JDBC");
		System.out.println(list); // Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

		String s = "JSP";
		boolean contains = list.contains(s);

		if (contains) {
			System.out.println(list.indexOf(s)); // Output : 2
		}

		s = "STRUTS";
		contains = list.contains("STRUTS");

		if (contains) {
			System.out.println(list.indexOf(s));
		}
	}
}
