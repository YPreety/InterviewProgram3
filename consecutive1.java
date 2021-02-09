package Dynamic_Programming;

//Count number of binary strings without consecutive 1’s
//Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1’s.
//Input:  N = 2
//Output: 3
// The 3 strings are 00, 01, 10

public class consecutive1 {

	public static void main(String[] args) {
		System.out.println(countStrings(3));
	}

	static int countStrings(int n) {
		int a[] = new int[n];
		int b[] = new int[n];
		a[0] = b[0] = 1;
		for (int i = 1; i < n; i++) {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
		}
		return a[n - 1] + b[n - 1];
	}
}
