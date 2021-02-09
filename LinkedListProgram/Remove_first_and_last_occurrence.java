package LinkedListProgram;
// remove the first occurrence and last occurrence of a given element in a LinkedList?
import java.util.LinkedList;

public class Remove_first_and_last_occurrence {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("J2EE");
		list.add("JDBC");

		System.out.println(list); // Output : [JAVA, J2EE, JSP, J2EE, JDBC]

		// Removing the first occurrence of "J2EE"
		list.removeFirstOccurrence("J2EE");
		System.out.println(list); // Output : [JAVA, JSP, J2EE, JDBC]

		// Removing the last occurrence of "J2EE"
		list.removeLastOccurrence("J2EE");
		System.out.println(list); // Output : [JAVA, JSP, JDBC]
	}
}
