package GeneralProgramming;

import java.util.ArrayList;
import java.util.Collections;

///we are sorting an ArrayList of strings using first form of Collections.sort() method
public class ListSorting1 {

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
		Collections.sort(list);
		System.out.println("ArrayList After Sorting :");
		System.out.println(list);
	}
}
