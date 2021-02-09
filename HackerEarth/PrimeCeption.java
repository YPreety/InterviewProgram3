package HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeCeption {

	public static int[] sieve(int N) {
		int[] arr = new int[N + 1];
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (arr[i] == 0) {
				for (int j = i * i; j <= N; j += i) {
					arr[j] = 1;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> ascii = new ArrayList<Integer>();
		ascii.add(67);
		ascii.add(71);
		ascii.add(73);
		ascii.add(79);
		ascii.add(83);
		ascii.add(89);
		ascii.add(97);
		ascii.add(101);
		ascii.add(103);
		ascii.add(107);
		ascii.add(109);
		ascii.add(113);
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a[] = sieve(10001);
		int b[] = new int[1230];
		int j = 0;
		for (int i = 2; i < a.length; i++) {
			if (a[i] == 0)
				b[j++] = i;
		}
		char c[] = s.toCharArray();
		int i;
		for (i = b[0], j = 0; i < s.length();) {
			if (ascii.contains((int) c[i])) {
				System.out.println(i + " " + c[i]);
			}
			i = b[++j];
		}
	}

}
