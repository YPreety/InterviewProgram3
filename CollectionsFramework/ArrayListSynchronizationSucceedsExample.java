package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*output 
0 
*/
public class ArrayListSynchronizationSucceedsExample {

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
				synchronized (synchronizedArrayList) { 
					while (it.hasNext()) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(it.next());
					}
				}

			}
		}, "thread-2");
		t2.start();
	}
}
