package HackerEarth;

import java.util.Scanner;

public class SuperASCII {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[26];
		int flag = 1;
		while (t-- > 0) {
			String s = sc.next();
			char c[] = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				a[c[i] - 97]++;
			}
			for (int i = 0; i < 26; i++) {
				if (a[i] != 0 && a[i] != i + 1) {
					flag = 0;
				}
			}
			if (flag == 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			for (int i = 0; i < 26; i++) {
				a[i] = 0;
			}
			flag = 1;
		}
	}

}
