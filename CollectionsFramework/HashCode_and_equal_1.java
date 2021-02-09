package CollectionsFramework;
import java.util.HashMap;
import java.util.Map;

/*Create a Map which contains address of each employee and uses employee object as a key. Store address of some employees in this map.
Now create a method that accepts Map and Employee object as parameters and returns address of this employee.

Approach 1 (Without overriding hashCode and equals methods)*/

public class HashCode_and_equal_1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(110, "Sajid Ali Khan");
		Address adrs1 = new Address(304, "Marol Mahrisi", "Mumbai", 400069);

		Employee emp2 = new Employee(111, "Jaspreet Singh");
		Address adrs2 = new Address(203, "Seepz", "Mumbai", 400093);

		Map<Employee, Address> map = new HashMap<>();
		map.put(emp1, adrs1);
		map.put(emp2, adrs2);

		System.out.println(HashCode_and_equal_1.getAddress(map, new Employee(110, "Sajid Ali Khan")));

	}

	public static String getAddress(Map<Employee, Address> map, Employee emp) {
		Address adrs = map.get(emp);
		return adrs.getAddress();
	}

}

class Employee {
	private int empId;
	private String name;

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

}

class Address {
	private int houseNo;
	private String streetName;
	private String city;
	private int pinCode;

	public Address(int houseNo, String streetName, String city, int pinCode) {
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return houseNo + ", " + streetName + ", " + city + ", " + pinCode;
	}
}