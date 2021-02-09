package HackerEarth;

import java.util.Scanner;

public class BeautifulArrays {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int a[] = new int[N];
			int zero = 0, negOne = 0, posOne = 0, other = 0;
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
				if (a[i] == 0) {
					zero++;
				} else if (a[i] == -1) {
					negOne++;
				} else if (a[i] == 1) {
					posOne++;
				} else {
					other++;
				}
			}
			if (negOne > 1 && zero == 0) {
				System.out.println("No");
			} else if (negOne > 1 && other > 0) {
				System.out.println("No");
			} else if (other > 1) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

}
