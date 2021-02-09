package GeneralProgramming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// Using Arrays.asList() Method
		String[] array = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
		System.out.println(list);

		// Using Collections.addAll() Method
		String[] array1 = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };
		ArrayList<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, array1);
		System.out.println(list1);

		// Using ArrayList.addAll() Method
		String[] array2 = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };
		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(Arrays.asList(array2));
		System.out.println(list2);

		// Using Streams from Java 8
		String[] array3 = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };
		List<Object> list3 = Arrays.stream(array3).collect(Collectors.toList());
		System.out.println(list);
	}
}
