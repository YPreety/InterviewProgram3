package HackerEarth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> num = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			num.add(String.valueOf(temp));
		}
		Collections.sort(num, new condition());
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}

	static class condition implements Comparator<String> {
		public int compare(String a, String b) {
			String left = a + b;
			String right = b + a;
			return -(left.compareTo(right));
		}
	}

}
