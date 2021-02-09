package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

//Program to create method that provides functionality similar to putIfAbsent method of ConcurrentHashMap and to be used with HashMap

/*hashMap : {1=javaMadeSoEasy}

functionalityOfPutIfAbsent method >> javaMadeSoEasy
hashMap : {1=javaMadeSoEasy}

functionalityOfPutIfAbsent method >> null
hashMap : {1=javaMadeSoEasy, 2=audi}*/

public class HashMapTest {

	static Map<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String[] args) {
		map.put(1, "javaMadeSoEasy");
		System.out.println("hashMap : " + map);

		System.out.println("\n functionalityOfPutIfAbsent method >> " + functionalityOfPutIfAbsent(1, "ankit"));
		System.out.println("hashMap : " + map);

		System.out.println("\n functionalityOfPutIfAbsent method >> " + functionalityOfPutIfAbsent(2, "audi"));
		System.out.println("hashMap : " + map);

	}

	public static synchronized String functionalityOfPutIfAbsent(Integer key, String value) {
		if (!map.containsKey(key))
			return map.put(key, value);
		else
			return map.get(key);
	}
}
