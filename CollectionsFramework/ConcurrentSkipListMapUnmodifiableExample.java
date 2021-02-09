package CollectionsFramework;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

//ConcurrentSkipListMap example to make map unmodifiable in java
public class ConcurrentSkipListMapUnmodifiableExample {

	public static void main(String[] args) {
		Map<Integer, String> concurrentSkipListMap = new ConcurrentSkipListMap<Integer, String>();

		concurrentSkipListMap.put(11, "ankit");
		concurrentSkipListMap.put(21, "mittal");
		concurrentSkipListMap.put(31, "javaMadeSoEasy");

		// getting unmodifiable ConcurrentSkipListMap
		Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(concurrentSkipListMap);

		/*
		 * Now any attempt to modify map will throw
		 * java.lang.UnsupportedOperationException
		 */
		unmodifiableMap.put(41, "java");

	}

}
/*OUTPUT

Exception in thread "main" java.lang.UnsupportedOperationException
    at java.util.Collections$UnmodifiableMap.put(Unknown Source)
    at concurrentSkipListMap_unmodifiable.concurrentSkipListMapTest.main(concurrentSkipListMapTest.java:24)
 
 
*/