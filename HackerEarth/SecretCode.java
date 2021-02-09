package HackerEarth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SecretCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int b[] = new int[100001];
		sieve(b, b.length - 1);
		while (T-- > 0) {
			int N = sc.nextInt();
			int a[] = new int[N];
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
				if (b[a[i]] == 0) {
					list.add(String.valueOf(a[i]));
				}
			}
			if (list.size() == 0) {
				System.out.println("No Secret Code!");
			} else {
				Collections.sort(list, new condition());
				String val = list.get(0);
				if (val.equals("0")) {
					System.out.println(0);
				} else {
					for (int i = 0; i < list.size(); i++) {
						System.out.print(list.get(i));
					}
					System.out.println();
				}
			}

		}
	}

	static class condition implements Comparator<String> {
		public int compare(String a, String b) {
			String left = a + b;
			String right = b + a;
			return -(left.compareTo(right));
		}
	}

	public static void sieve(int a[], int n) {
		for (int i = 2; i <= n; i++)
			a[i] = i;
		for (int i = 2; i <= n; i++) {
			if (a[i] != 0) {
				for (int j = 2 * i; j <= n;) {
					a[j] = 0;
					j = j + i;
				}
			}
		}
	}
}
