package HackerEarth;

import java.util.Scanner;

public class PabloAndTheDEA {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			long m = sc.nextLong();
			System.out.println(numbersWithDiff(n, m));
		}
	}

	public static int Sod(long num) {
		int sod = 0;
		while (num != 0) {
			sod += (num % 10);
			num /= 10;
		}
		return sod;
	}

	public static long numbersWithDiff(long num, long k) {
		long low = 1l;
		long high = num;
		long mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (mid - Sod(mid) < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return (num - high);
	}

}
