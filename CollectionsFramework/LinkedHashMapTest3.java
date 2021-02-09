package CollectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap - put, get, containsKey , containsValue, remove, size methods in java
public class LinkedHashMapTest3 {

	public static void main(String[] args) {
		System.out.println("-----1. create Map---");
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		System.out.println("\n-----2. put key-value pair in Map ---");
		linkedHashMap.put(11, "ankit");
		linkedHashMap.put(21, "mittal");
		linkedHashMap.put(31, "javaMadeSoEasy");

		System.out.println("\n-----3. get method returns value corresponding to key ---");
		System.out.println("linkedHashMap.get(11) : " + linkedHashMap.get(11));

		System.out.println(
				"\n-----4. containsKey method returns true if map " + "contains a mapping for the specified key ---");
		System.out.println("linkedHashMap.containsKey(11) : " + linkedHashMap.containsKey(11));

		System.out.println("\n-----5. containsValue method returns true if map maps one "
				+ "or more keys to the specified value. ---");
		System.out.println("linkedHashMap.containsValue(\"ankit\") : " + linkedHashMap.containsValue("ankit"));

		System.out.println("linkedHashMap.remove(11) : " + linkedHashMap.remove(11));

		System.out.println("\n-----6. size ---");

		System.out.println("linkedHashMap.size() : " + linkedHashMap.size());

	}

}
/*
 * OUTPUT
 * 
 * -----1. create Map---
 * 
 * -----2. put key-value pair in Map ---
 * 
 * -----3. get method returns value corresponding to key ---
 * linkedHashMap.get(11) : ankit
 * 
 * -----4. containsKey method returns true if map contains a mapping for the
 * specified key --- linkedHashMap.containsKey(11) : true
 * 
 * -----5. containsValue method returns true if map maps one or more keys to the
 * specified value. --- linkedHashMap.containsValue("ankit") : true
 * linkedHashMap.remove(11) : ankit
 * 
 * -----6. size --- linkedHashMap.size() : 2
 * 
 * 
 */