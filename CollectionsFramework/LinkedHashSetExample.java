package CollectionsFramework;

import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet - isEmpty, size and clear methods program
public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

		System.out.println("--------add element ");
		linkedLinkedHashSet.add("ankit");
		linkedLinkedHashSet.add("mittal");
		linkedLinkedHashSet.add("javaMadeSoEasy");

		System.out.println("linkedLinkedHashSet = " + linkedLinkedHashSet);
		System.out.println("linkedLinkedHashSet.isEmpty() = " + linkedLinkedHashSet.isEmpty());

		System.out.println("\n--------clear list - remove all elements from set");
		linkedLinkedHashSet.clear();

		System.out.println("linkedLinkedHashSet.isEmpty() = " + linkedLinkedHashSet.isEmpty());

		System.out.println("linkedLinkedHashSet = " + linkedLinkedHashSet);

	}

}
/*
 * OUTPUT
 * 
 * --------add element linkedLinkedHashSet = [ankit, mittal, javaMadeSoEasy]
 * linkedLinkedHashSet.isEmpty() = false
 * 
 * --------clear list - remove all elements from set
 * linkedLinkedHashSet.isEmpty() = true linkedLinkedHashSet = []
 * 
 */