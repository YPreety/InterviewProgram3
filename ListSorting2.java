package GeneralProgramming;
import java.util.ArrayList;
import java.util.Collections;

/*we use second form of the Collections.sort() method which takes two arguments. One is the list to be sorted and another one is the Comparator. 
We pass String.CASE_INSENSITIVE_ORDER as Comparator here. This Comparator ignores the case of the string elements.*/

public class ListSorting2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Virat");
		list.add("rohit");
		list.add("Shikar");
		list.add("ashwin");
		list.add("ravindra");
		list.add("Bhargav");
		System.out.println("ArrayList Before Sorting :");
		System.out.println(list);
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("ArrayList After Sorting :");
		System.out.println(list);
	}
}
