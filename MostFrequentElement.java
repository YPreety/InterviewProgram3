package GeneralProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentElement {

	public static void main(String[] args) {
		getMostFrequentElement(new int[] { 4, 5, 8, 7, 4, 7, 6, 7 });
		getMostFrequentElement(new int[] { 1, 2, 7, 5, 3, 6 });
	}

	static void getMostFrequentElement(int inputArray[]) {
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
		for (int i : inputArray) {
			if (elementCountMap.containsKey(i)) {
				elementCountMap.put(i, elementCountMap.get(i) + 1);
			} else {
				elementCountMap.put(i, 1);
			}
		}

		int element = 0;
		int frequency = 1;
		Set<Entry<Integer, Integer>> entrySet = elementCountMap.entrySet();

		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > frequency) {
				element = entry.getKey();

				frequency = entry.getValue();
			}
		}

		if (frequency > 1) {
			System.out.println("Input Array : " + Arrays.toString(inputArray));
			System.out.println("The most frequent element : " + element);
			System.out.println("Its frequency : " + frequency);
			System.out.println("========================");
		} else {
			System.out.println("Input Array : " + Arrays.toString(inputArray));
			System.out.println("No frequent element. All elements are unique.");
			System.out.println("=========================");
		}
	}
}
