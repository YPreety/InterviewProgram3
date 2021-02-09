package CollectionsFramework;

/*OUTPUT

Exception in thread "thread-2" java.util.ConcurrentModificationException
    at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    at java.util.ArrayList$Itr.next(Unknown Source)
    at ArrayListSynchronizationFails$2.run(ArrayListSynchronizationFails.java:43)
    at java.lang.Thread.run(Unknown Source)
 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronizationFailsExample {

	public static void main(String[] args) {
		final List<Integer> arrayList = new ArrayList<Integer>();
		final List<Integer> synchronizedArrayList;
		synchronizedArrayList = Collections.synchronizedList(arrayList);
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <= 3; i++) {
					synchronizedArrayList.add(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}, "thread-1");
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Iterator<Integer> it = synchronizedArrayList.iterator();
				while (it.hasNext()) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(it.next());
				}

			}
		}, "thread-2");
		t2.start();
	}
}
