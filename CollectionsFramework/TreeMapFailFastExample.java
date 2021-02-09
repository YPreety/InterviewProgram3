package CollectionsFramework;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//TreeMap program to find Iterator on keySet, values and entrySet is fail-fast in java
public class TreeMapFailFastExample {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(11, "ankit");
		treeMap.put(21, "javaMadeSoEasy");

		System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
		// fail-fast
		Iterator<Integer> keyIterator = treeMap.keySet().iterator();
		while (keyIterator.hasNext()) {
			treeMap.put(4, "newEle1");
			System.out.println(keyIterator.next());
		}

		System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
		// fail-fast
		Iterator<String> valueIterator = treeMap.values().iterator();
		while (valueIterator.hasNext()) {
			treeMap.put(4, "newEle1");
			System.out.println(valueIterator.next());
		}

		System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
		// fail-fast
		Iterator<Entry<Integer, String>> entryIterator = treeMap.entrySet().iterator();
		while (entryIterator.hasNext()) {
			treeMap.put(4, "newEle1");
			System.out.println(entryIterator.next());
		}

	}

}

/*
 * OUTPUT
 * 
 * 
 * ---1. Iterate on keys, by obtaining iterator on keySet--- Exception in thread
 * "main" java.util.ConcurrentModificationException at
 * java.util.TreeMap$PrivateEntryIterator.nextEntry(Unknown Source) at
 * java.util.TreeMap$KeyIterator.next(Unknown Source) at
 * TreeMapFailFastExample.main(TreeMapFailFastExample.java:24)
 * 
 */