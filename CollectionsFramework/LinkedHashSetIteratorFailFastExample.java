package CollectionsFramework;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet - fail-fast iteration using iterator, Enumeration and enhanced for loop example program in java
public class LinkedHashSetIteratorFailFastExample {

	public static void main(String[] args) {
		Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

		linkedLinkedHashSet.add("ankit");
		linkedLinkedHashSet.add("javaMadeSoEasy");

		System.out.println("-------use iterator-------");
		// fail-fast
		Iterator<String> iterator = linkedLinkedHashSet.iterator();
		while (iterator.hasNext()) {
			linkedLinkedHashSet.add("newElement1");
			System.out.println(iterator.next());
		}

		System.out.println("-------use Enumeration-------");
		// fail-fast
		Enumeration<String> listEnum = Collections.enumeration(linkedLinkedHashSet);
		while (listEnum.hasMoreElements()) {
			linkedLinkedHashSet.add("newElement2");
			System.out.println(listEnum.nextElement());
		}

		System.out.println("-------use enhanced for loop-------");

		// enhanced for loop is fail-fast
		for (String string : linkedLinkedHashSet) {
			linkedLinkedHashSet.add("newElement3");
			System.out.println(string);
		}

	}

}
/*
 * OUTPUT
 * 
 * -------use iterator------- Exception in thread "main"
 * java.util.ConcurrentModificationException at
 * java.util.LinkedHashMap$LinkedHashIterator.nextNode(Unknown Source) at
 * java.util.LinkedHashMap$LinkedKeyIterator.next(Unknown Source) at
 * LinkedHashSetIteratorFailFastExample.main(
 * LinkedHashSetIteratorFailFastExample.java:25)
 * 
 * 
 */