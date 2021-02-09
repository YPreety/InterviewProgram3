package CollectionsFramework;

import java.util.Map;
import java.util.TreeMap;

//TreeMap program to use put, get, containsKey , containsValue, remove, size methods in java
public class TreeMapExample {

	public static void main(String[] args) {
		System.out.println("-----1. create Map---");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		System.out.println("\n-----2. put key-value pair in Map ---");
		treeMap.put(11, "ankit");
		treeMap.put(21, "mittal");
		treeMap.put(31, "javaMadeSoEasy");

		System.out.println("\n-----3. get method returns value corresponding to key ---");
		System.out.println("treeMap.get(11) : " + treeMap.get(11));

		System.out.println(
				"\n-----4. containsKey method returns true if map " + "contains a mapping for the specified key ---");
		System.out.println("treeMap.containsKey(11) : " + treeMap.containsKey(11));

		System.out.println("\n-----5. containsValue method returns true if map maps one "
				+ "or more keys to the specified value. ---");
		System.out.println("treeMap.containsValue(\"ankit\") : " + treeMap.containsValue("ankit"));

		System.out.println("treeMap.remove(11) : " + treeMap.remove(11));

		System.out.println("\n-----6. size ---");

		System.out.println("treeMap.size() : " + treeMap.size());

	}

}

/*
 * OUTPUT
 * 
 * -----1. create Map---
 * 
 * -----2. put key-value pair in Map ---
 * 
 * -----3. get method returns value corresponding to key --- treeMap.get(11) :
 * ankit
 * 
 * -----4. containsKey method returns true if map contains a mapping for the
 * specified key --- treeMap.containsKey(11) : true
 * 
 * -----5. containsValue method returns true if map maps one or more keys to the
 * specified value. --- treeMap.containsValue("ankit") : true treeMap.remove(11)
 * : ankit
 * 
 * -----6. size --- treeMap.size() : 2
 * 
 * 
 */