package CollectionsFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//ConcurrentHashMap program to use put, get, containsKey , containsValue, remove, size methods in java
public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		System.out.println("-----1. create Map---");
		Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>();

		System.out.println("\n-----2. put key-value pair in Map ---");
		concurrentHashMap.put(11, "ankit");
		concurrentHashMap.put(21, "mittal");
		concurrentHashMap.put(31, "javaMadeSoEasy");

		System.out.println("\n-----3. get method returns value corresponding to key ---");
		System.out.println("concurrentHashMap.get(11) : " + concurrentHashMap.get(11));

		System.out.println(
				"\n-----4. containsKey method returns true if map " + "contains a mapping for the specified key ---");
		System.out.println("concurrentHashMap.containsKey(11) : " + concurrentHashMap.containsKey(11));

		System.out.println("\n-----5. containsValue method returns true if map maps one "
				+ "or more keys to the specified value. ---");
		System.out.println("concurrentHashMap.containsValue(\"ankit\") : " + concurrentHashMap.containsValue("ankit"));

		System.out.println("concurrentHashMap.remove(11) : " + concurrentHashMap.remove(11));

		System.out.println("\n-----6. size ---");

		System.out.println("concurrentHashMap.size() : " + concurrentHashMap.size());

	}

}


/*OUTPUT

-----1. create Map---
 
-----2. put key-value pair in Map ---
 
-----3. get method returns value corresponding to key ---
concurrentHashMap.get(11) : ankit
 
-----4. containsKey method returns true if map contains a mapping for the specified key ---
concurrentHashMap.containsKey(11) : true
 
-----5. containsValue method returns true if map maps one or more keys to the specified value. ---
concurrentHashMap.containsValue("ankit") : true
concurrentHashMap.remove(11) : ankit
 
-----6. size ---
concurrentHashMap.size() : 2
 
 
*/