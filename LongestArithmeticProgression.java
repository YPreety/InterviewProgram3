package Dynamic_Programming;

/*Given a set of numbers, find the Length of the Longest Arithmetic Progression (LLAP) in it.
set[] = {1, 7, 10, 15, 27, 29}
output = 3
The longest arithmetic progression is {1, 15, 29}
set[] = {5, 10, 15, 20, 25, 30}
output = 6
The whole set is in AP
Time Complexity: O(n2)
Auxiliary Space: O(n2)
*/

public class LongestArithmeticProgression {

	public static void main(String[] args) {
		int set1[] = { 1, 7, 10, 13, 14, 19 };
		int n1 = set1.length;
		System.out.println(lenghtOfLongestAP(set1, n1));  //4

		int set2[] = { 1, 7, 10, 15, 27, 29 };
		int n2 = set2.length;
		System.out.println(lenghtOfLongestAP(set2, n2)); //3

		int set3[] = { 2, 4, 6, 8, 10 };
		int n3 = set3.length;
		System.out.println(lenghtOfLongestAP(set3, n3)); //5
	}

	static int lenghtOfLongestAP(int set[], int n) {
		if (n <= 2)
			return n;
		int L[][] = new int[n][n];
		int llap = 2;
		for (int i = 0; i < n; i++)
			L[i][n - 1] = 2;
		for (int j = n - 2; j >= 1; j--) {
			int i = j - 1, k = j + 1;
			while (i >= 0 && k <= n - 1) {
				if (set[i] + set[k] < 2 * set[j])
					k++;
				else if (set[i] + set[k] > 2 * set[j]) {
					L[i][j] = 2;
					i--;

				}
				else {
					L[i][j] = L[j][k] + 1;
					llap = Math.max(llap, L[i][j]);
					i--;
					k++;
				}
			}
			while (i >= 0) {
				L[i][j] = 2;
				i--;
			}
		}
		return llap;
	}
}
