package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*To synchronize ArrayList, we use Collections.synchronizedList() method. This method returns synchronized list backed by the specified list. 
There is an advise from javadocs that while iterating over the synchronized list, you must use it in a synchronized block. Failed to do so may 
result in non-deterministic behavior.*/

public class SynchronizedList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("STRUTS");
		list.add("JSP");
		list.add("SERVLETS");
		list.add("JSF");

		List<String> synchronizedList = Collections.synchronizedList(list);
		synchronized (synchronizedList) {
			Iterator<String> it = synchronizedList.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
