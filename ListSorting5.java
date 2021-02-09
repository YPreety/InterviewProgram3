package GeneralProgramming;

import java.util.ArrayList;
import java.util.Collections;

//Sort An ArrayList In The Reverse Order
//You can sort the list in the reverse order also by passing the Comparator returned by Collections.reverseOrder() as 
//Comparator to Collections.sort() method.

public class ListSorting5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1452);
		list.add(6854);
		list.add(8741);
		list.add(6542);
		list.add(3845);
		System.out.println("ArrayList Before Sorting :");
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("ArrayList Sorted In The Reverse Order :");
		System.out.println(list);
	}
}
