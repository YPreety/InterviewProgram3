package CollectionsFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, String> studentPerformanceMap = new HashMap<String, String>();
		studentPerformanceMap.put("John Kevin", "Average");
		studentPerformanceMap.put("Rakesh Sharma", "Good");
		studentPerformanceMap.put("Prachi D", "Very Good");
		studentPerformanceMap.put("Ivan Jose", "Very Bad");
		studentPerformanceMap.put("Smith Jacob", "Very Good");
		studentPerformanceMap.put("Anjali N", "Bad");

		// HashMap Keys Into ArrayList 

		Set<String> keySet = studentPerformanceMap.keySet();
		ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
		System.out.println("ArrayList Of Keys :");
		for (String key : listOfKeys) {
			System.out.println(key);
		}
		
		System.out.println("--------------------------");

		// HashMap Values Into ArrayList
		Collection<String> values = studentPerformanceMap.values();
		ArrayList<String> listOfValues = new ArrayList<String>(values);
		System.out.println("ArrayList Of Values :");
		for (String value : listOfValues) {
			System.out.println(value);
		}

		System.out.println("--------------------------");

		// HashMap’s Key-Value Pairs Into ArrayList
		Set<Entry<String, String>> entrySet = studentPerformanceMap.entrySet();
		ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String, String>>(entrySet);
		System.out.println("ArrayList of Key-Values :");
		for (Entry<String, String> entry : listOfEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
