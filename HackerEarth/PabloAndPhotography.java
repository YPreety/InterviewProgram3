package HackerEarth;

import java.util.Scanner;

public class PabloAndPhotography {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T != 0) {
			T--;
			int N = sc.nextInt();
			int temp = 0, k = 0, j = 0, sumeven = 0, sumodd = 0;
			for (int i = 0; i < N; i++) {
				temp = sc.nextInt();
				if (i % 2 == 0) {
					sumeven += temp;
				} else {
					sumodd += temp;
				}
			}
			if (sumeven - sumodd >= 0) {
				System.out.println(sumeven - sumodd);
			} else {
				System.out.println(sumodd - sumeven);
			}
		}
	}

}
