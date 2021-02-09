package CollectionsFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet - synchronizing using Collections.synchronizedSet program in java
public class LinkedHashSetSynchronizingExample {

	public static void main(String[] args) {
		Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

		linkedLinkedHashSet.add("ankit");
		linkedLinkedHashSet.add("javaMadeSoEasy");
		Set<String> synchronizedSet = Collections.synchronizedSet(linkedLinkedHashSet);
		System.out.println("------- iterating on synchronized set -------");
		synchronized (synchronizedSet) {
			Iterator<String> iterator = synchronizedSet.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}
}

/*
 * output
 * 
 * ------- iterating on synchronized set ------- ankit javaMadeSoEasy
 * 
 */