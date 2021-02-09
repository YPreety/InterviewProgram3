package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Program to Sort Map by value in Ascending order by implementing Comparator interface and overriding its compare method
/*Before sorting by value: 1=2  2=1  3=9  4=8  
After sorting by value(ascending): 2=1  1=2  4=8  3=9  */

public class SortMapByValueAscending {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 1);
		map.put(3, 9);
		map.put(4, 8);

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		List<Entry<Integer, Integer>> listOfentrySet = new ArrayList<Entry<Integer, Integer>>(entrySet);

		System.out.print("Before sorting by value: ");
		for (Map.Entry<Integer, Integer> entry : listOfentrySet) {
			System.out.print(entry.getKey() + "=" + entry.getValue() + "  ");
		}

		Collections.sort(listOfentrySet, new SortByValue());

		System.out.print("\nAfter sorting by value(ascending): ");
		for (Map.Entry<Integer, Integer> entry : listOfentrySet)
			System.out.print(entry.getKey() + "=" + entry.getValue() + "  ");

	}

}

class SortByValue implements Comparator<Map.Entry<Integer, Integer>> {

	@Override
	public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
		return (entry1.getValue()).compareTo(entry2.getValue());
	}
}