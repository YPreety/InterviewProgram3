package Queue;
import java.util.PriorityQueue;

//Java PriorityQueue Example With Default Comparator :

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.offer(21);
		pQueue.offer(17);
		pQueue.offer(37);
		pQueue.offer(41);
		pQueue.offer(9);
		pQueue.offer(67);
		pQueue.offer(31);

		System.out.println(pQueue.poll()); // Output : 9
		System.out.println(pQueue.poll()); // Output : 17
		System.out.println(pQueue.poll()); // Output : 21
		System.out.println(pQueue.poll()); // Output : 31
		System.out.println(pQueue.poll()); // Output : 37
		System.out.println(pQueue.poll()); // Output : 41
		System.out.println(pQueue.poll()); // Output : 67
	}
}
