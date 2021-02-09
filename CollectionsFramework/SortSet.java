package CollectionsFramework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TreeMap’s constructor to sort java Collection framework classes
/*OUTPUT
treeSet : [1, 2, 3]
*/
public class SortSet {

	public static void main(String[] args) {
		Collection<Integer> collection = new HashSet<Integer>();
		collection.add(3);
		collection.add(1);
		collection.add(2);

		// TreeSet's constructor
		Set<Integer> treeSet = new TreeSet<Integer>(collection);
		System.out.println("treeSet : " + treeSet);

	}

}
