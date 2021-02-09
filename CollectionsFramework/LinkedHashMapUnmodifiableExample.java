package CollectionsFramework;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap - making it unmodifiable in java
public class LinkedHashMapUnmodifiableExample {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(11, "ankit");
		linkedHashMap.put(21, "mittal");
		linkedHashMap.put(31, "javaMadeSoEasy");

		// getting unmodifiable LinkedHashMap
		Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);

		/*
		 * Now any attempt to modify map will throw
		 * java.lang.UnsupportedOperationException
		 */
		unmodifiableMap.put(41, "java");

	}

}
/*
 * OUTPUT
 * 
 * Exception in thread "main" java.lang.UnsupportedOperationException at
 * java.util.Collections$UnmodifiableMap.put(Unknown Source) at
 * linkedHashMap_unmodifiable.linkedHashMapTest.main(linkedHashMapTest.java:24)
 * 
 * 
 */