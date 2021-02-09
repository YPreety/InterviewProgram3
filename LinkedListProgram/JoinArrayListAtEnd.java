package LinkedListProgram;
//join an ArrayList at the end of a LinkedList?
import java.util.ArrayList;
import java.util.LinkedList;

public class JoinArrayListAtEnd {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("ONE");
		linkedList.add("TWO");
		linkedList.add("THREE");
		linkedList.add("FOUR");
		linkedList.add("FIVE");

		System.out.println(linkedList); // Output : [ONE, TWO, THREE, FOUR, FIVE]

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("SIX");
		arrayList.add("SEVEN");
		arrayList.add("EIGHT");
		arrayList.add("NINE");

		System.out.println(arrayList); // Output : [SIX, SEVEN, EIGHT, NINE]

		linkedList.addAll(arrayList);
		System.out.println(linkedList); // Output : [ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE]
	}
}
