package CollectionsFramework;
import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicateElementsUsingHashSet {

	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("J2EE");
		listWithDuplicateElements.add("JSP");
		listWithDuplicateElements.add("SERVLETS");
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("STRUTS");
		listWithDuplicateElements.add("JSP");
		System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(listWithDuplicateElements);
		
		HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
		ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
		System.out.print("ArrayList After Removing Duplicate Elements :");
		System.out.println(listWithoutDuplicateElements);
	}
}

/*ArrayList With Duplicate Elements :[JAVA, J2EE, JSP, SERVLETS, JAVA, STRUTS, JSP]
ArrayList After Removing Duplicate Elements :[JAVA, SERVLETS, JSP, J2EE, STRUTS]*/