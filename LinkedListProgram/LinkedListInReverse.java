package LinkedListProgram;
//Java program to traverse the elements of a LinkedList in reverse direction?
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInReverse {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("SERVLETS");
		list.add("JDBC");

		System.out.println(list); // Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

		Iterator<String> it = list.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
