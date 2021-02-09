package Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		MyComparator comparator = new MyComparator();
		PriorityQueue<Employee3> pQueue = new PriorityQueue<Employee3>(7, comparator);

		pQueue.offer(new Employee3("AAA", 15000));
		pQueue.offer(new Employee3("BBB", 12000));
		pQueue.offer(new Employee3("CCC", 7500));
		pQueue.offer(new Employee3("DDD", 17500));
		pQueue.offer(new Employee3("EEE", 21500));
		pQueue.offer(new Employee3("FFF", 29000));
		pQueue.offer(new Employee3("GGG", 14300));

		System.out.println(pQueue.poll()); // Output --> CCC : 7500
		System.out.println(pQueue.poll()); // Output --> BBB : 12000
		System.out.println(pQueue.poll()); // Output --> GGG : 14300
		System.out.println(pQueue.poll()); // Output --> AAA : 15000
		System.out.println(pQueue.poll()); // Output --> DDD : 17500
		System.out.println(pQueue.poll()); // Output --> EEE : 21500
		System.out.println(pQueue.poll()); // Output --> FFF : 29000
	}
}

class Employee3 {
	String name;
	int salary;

	public Employee3(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " : " + salary;
	}
}
class MyComparator implements Comparator<Employee3> {
	@Override
	public int compare(Employee3 e1, Employee3 e2) {
		return e1.salary - e2.salary;
	}
}