package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Program to Sort Map by key in Ascending order by implementing Comparator interface and overriding its compare method
/*OUTPUT
Before sorting by key : 4=1  2=1  3=1  5=1 
After sorting by key(ascending): 2=1  3=1  4=1  5=1 
*/
public class SortMapByKeyAscending1 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		map.put(4, 1);
		map.put(2, 1);
		map.put(3, 1);
		map.put(5, 1);

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		List<Entry<Integer, Integer>> listOfentrySet = new ArrayList<Entry<Integer, Integer>>(entrySet);

		System.out.print("Before sorting by key : ");
		for (Map.Entry<Integer, Integer> entry : listOfentrySet) {
			System.out.print(entry.getKey() + "=" + entry.getValue() + "  ");
		}

		Collections.sort(listOfentrySet, new SortByKeyAscending());

		System.out.print("\nAfter sorting by key(ascending): ");
		for (Map.Entry<Integer, Integer> entry : listOfentrySet)
			System.out.print(entry.getKey() + "=" + entry.getValue() + "  ");

	}

}

class SortByKeyAscending implements Comparator<Map.Entry<Integer, Integer>> {

	@Override
	public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
		return (entry1.getKey()).compareTo(entry2.getKey());
	}
}
