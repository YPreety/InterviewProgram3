package HackerEarth;

import java.util.Scanner;

public class Series {

	public static int nod(int n) {
		int number = 0;
		while (n != 0) {
			n = n / 10;
			number++;
		}
		return number;
	}

	public static String padding(int a) {
		int p = nod(a);
		String temp = "";
		if (p < 5) {
			for (int i = 0; i < (5 - p); i++) {
				temp += "0";
			}
			temp = temp + a;

		}
		return temp;
	}

	public static String[] populate(int b[], int num) {
		String temp1[] = new String[1000000];
		temp1[0] = "00006";
		b[0] = 6;
		for (int i = 1; i < num; i++) {
			b[i] = b[i - 1] + 22 + 16 * (i - 1);
			temp1[i] = padding(b[i]);
		}
		return temp1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int series[] = new int[100000];
		String p[] = populate(series, N * (N + 1) / 2);

		// System.out.println(k);
		int k = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print(p[k++] + " ");
			System.out.println("");
		}

	}
}
