package CollectionsFramework;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("JAVA");
		set.add("STRUTS");
		set.add("JSP");
		set.add("SERVLETS");
		set.add("JSF");

		Set<String> synchronizedSet = Collections.synchronizedSet(set);
		synchronized (synchronizedSet) {
			Iterator<String> it = synchronizedSet.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
