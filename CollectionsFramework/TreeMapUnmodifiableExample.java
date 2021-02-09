package CollectionsFramework;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

//TreeMap program to make it unmodifiable in java
public class TreeMapUnmodifiableExample {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(11, "ankit");
		treeMap.put(21, "mittal");
		treeMap.put(31, "javaMadeSoEasy");

		Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(treeMap);
		unmodifiableMap.put(41, "java");

	}

}
/*
 * OUTPUT
 * 
 * Exception in thread "main" java.lang.UnsupportedOperationException at
 * java.util.Collections$UnmodifiableMap.put(Unknown Source) at
 * treeMap_unmodifiable.treeMapTest.main(treeMapTest.java:24)
 * 
 * 
 */