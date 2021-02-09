package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//TreeMap’s constructor to sort map on basis of key
/*OUTPUT
treeMap : {2=1, 3=1, 4=1}
*/

public class SortMapByKey {

	public static void main(String[] args) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(4, 1);
		hashMap.put(2, 1);
		hashMap.put(3, 1);

		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(hashMap);
		System.out.println("treeMap : " + treeMap);
	}
}
