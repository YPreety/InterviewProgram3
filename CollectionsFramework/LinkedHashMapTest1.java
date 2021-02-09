package CollectionsFramework;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//LinkedHashMap - Iterate on keys by obtaining keySet, Iterate on values by obtaining values, Iterate on entry by obtaining entrySet in java
public class LinkedHashMapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(11, "ankit");
		linkedHashMap.put(21, "javaMadeSoEasy");

		System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
		Iterator<Integer> keyIterator = linkedHashMap.keySet().iterator();
		while (keyIterator.hasNext()) {
			System.out.println(keyIterator.next());
		}

		System.out.println("\n---obtain keySet from Map---");
		Set<Integer> keySet = linkedHashMap.keySet();
		System.out.println("---now iterate on keySet using enhanced for loop---");
		for (Integer key : keySet) {
			System.out.println(key);
		}

		System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
		Iterator<String> valueIterator = linkedHashMap.values().iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}

		System.out.println("\n---obtain values from Map---");
		Collection<String> collection = linkedHashMap.values();
		System.out.println("---now iterate on values using enhanced for loop---");
		for (String value : collection) {
			System.out.println(value);
		}

		System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
		Iterator<Entry<Integer, String>> entryIterator = linkedHashMap.entrySet().iterator();
		while (entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}

		System.out.println("\n---obtain entrySet from Map---");
		Set<Entry<Integer, String>> entrySet = linkedHashMap.entrySet();
		System.out.println("---now iterate on entrySet using enhanced for loop---");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

	}

}
/*
 * OUTPUT
 * 
 * 
 * ---1. Iterate on keys, by obtaining iterator on keySet--- 11 21
 * 
 * ---obtain keySet from Map--- ---now iterate on keySet using enhanced for
 * loop--- 11 21
 * 
 * ---2. Iterate on values, by obtaining iterator on values--- ankit
 * javaMadeSoEasy
 * 
 * ---obtain values from Map--- ---now iterate on values using enhanced for
 * loop--- ankit javaMadeSoEasy
 * 
 * ---3. Iterate on entry, by obtaining iterator on entrySet--- 11=ankit
 * 21=javaMadeSoEasy
 * 
 * ---obtain entrySet from Map--- ---now iterate on entrySet using enhanced for
 * loop--- 11=ankit 21=javaMadeSoEasy
 * 
 */