package CollectionsFramework;
import java.util.HashMap;
import java.util.Map;

//Approach 2 (Overriding hashCode and equals method)

public class HashCode_and_equal_2 {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(110, "Sajid Ali Khan");
		Address1 adrs1 = new Address1(304, "Marol Mahrisi", "Mumbai", 400069);

		Employee1 emp2 = new Employee1(111, "Jaspreet Singh");
		Address1 adrs2 = new Address1(203, "Seepz", "Mumbai", 400093);

		Map<Employee1, Address1> map = new HashMap<>();
		map.put(emp1, adrs1);
		map.put(emp2, adrs2);

		System.out.println(HashCode_and_equal_2.getAddress1(map, new Employee1(110, "Sajid Ali Khan")));

	}

	public static String getAddress1(Map<Employee1, Address1> map, Employee1 emp) {
		Address1 adrs = map.get(emp);
		return adrs.getAddress1();
	}
}

class Employee1 {
	private int empId;
	private String name;

	public Employee1(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

class Address1 {
	private int houseNo;
	private String streetName;
	private String city;
	private int pinCode;

	public Address1(int houseNo, String streetName, String city, int pinCode) {
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getAddress1() {
		return houseNo + ", " + streetName + ", " + city + ", " + pinCode;
	}

}