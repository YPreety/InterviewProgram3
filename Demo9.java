package output;

import java.util.ArrayList;
import java.util.List;

public class Demo9 {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(1);
		arr.add(6);
		arr.add(4);
		System.out.println(" arr : " + arr);
		System.out.println(countBalancingElements(arr));

	}

	public static int countBalancingElements(List<Integer> arr) {
		int sumEven = 0;
		int sumOdd = 0;
		int diff;
		int x = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + arr.get(i);
				System.out.println(" sumEven : " + sumEven);
			} else {
				sumOdd = sumOdd + arr.get(i);
				System.out.println(" sumOdd : " + sumOdd);
			}
		}
		System.out.println(" final sumEven : " + sumEven);
		System.out.println(" final sumOdd : " + sumOdd);
		diff = sumEven - sumOdd;
		System.out.println(" diff : " + diff);
		for (int i = 0; i < arr.size(); i++) {
			if (diff == arr.get(i)) {
				if (sumEven > sumOdd) {
					if (i % 2 == 0) {
						x = arr.get(i);
						break;
					}
				} else {
					if (i % 2 == 1) {
						x = arr.get(i);
						break;
					}
				}
			}
		}
		return x;

	}

}
