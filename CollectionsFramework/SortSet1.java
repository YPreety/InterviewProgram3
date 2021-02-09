package CollectionsFramework;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Program to Sort Set in Ascending order by using TreeSet and implementing Comparator interface, where elements are customObject/Employee type.
/*OUTPUT
treeSet : [Employee{name=amy, id=2}, Employee{name=brad, id=1}, Employee{name=sam, id=4}]
*/
public class SortSet1 {

	public static void main(String[] args) {
		Employee11 emp1 = new Employee11("sam", "4");
		Employee11 emp2 = new Employee11("amy", "2");
		Employee11 emp3 = new Employee11("brad", "1");

		Set<Employee11> treeSet = new TreeSet<Employee11>(new Comparator<Employee11>() {
			@Override
			public int compare(Employee11 o1, Employee11 o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);

		System.out.println("treeSet : " + treeSet);

	}

}

class Employee11 {
	String name;
	String id;

	public Employee11(String name, String id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee{" + "name=" + name + ", id=" + id + '}';
	}
}