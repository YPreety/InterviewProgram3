package HackerEarth;

import java.util.Scanner;

public class MaxGCD {

	public static int GCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return GCD(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int g[] = new int[N];
		g[0] = a[N - 1];
		int pos = 0;
		int max = g[0];
		for (int i = N - 2; i > 0; i--) {
			g[N - i] = GCD(g[N - i - 1], a[i]);
			if (g[N - i] < max) {
				pos = i + 1;
				break;
			}
		}
		System.out.println(pos);
	}

}
