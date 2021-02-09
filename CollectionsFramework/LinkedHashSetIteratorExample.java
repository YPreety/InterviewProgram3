package CollectionsFramework;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet - iterate using iterator, Enumeration and enhanced for loop program in java
public class LinkedHashSetIteratorExample {

	public static void main(String[] args) {
		Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

		linkedLinkedHashSet.add("ankit");
		linkedLinkedHashSet.add("javaMadeSoEasy");

		System.out.println("-------use iterator-------");
		Iterator<String> iterator = linkedLinkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("-------use Enumeration-------");
		Enumeration<String> listEnum = Collections.enumeration(linkedLinkedHashSet);
		while (listEnum.hasMoreElements()) {
			System.out.println(listEnum.nextElement());
		}

		System.out.println("-------use enhanced for loop-------");
		for (String string : linkedLinkedHashSet) {
			System.out.println(string);
		}

	}

}
/*
 * OUTPUT
 * 
 * -------use iterator------- ankit javaMadeSoEasy -------use Enumeration-------
 * ankit javaMadeSoEasy -------use enhanced for loop------- ankit javaMadeSoEasy
 * 
 */