package CollectionsFramework;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//Program to Sort Map by key in descending order by using TreeMap and implementing Comparator interface, where key is Integer type
/*OUTPUT
treeMap : {5=1, 4=1, 3=1, 2=1}
*/

public class SortMapByKeyAscending {

	public static void main(String[] args) {
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// using Comparator to sort map in descending order of keys.
				return o2.compareTo(o1);
			}
		});

		treeMap.put(4, 1);
		treeMap.put(2, 1);
		treeMap.put(3, 1);
		treeMap.put(5, 1);

		System.out.println("treeMap : " + treeMap);

	}

}
