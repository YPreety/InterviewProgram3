package Dynamic_Programming;

/*Time Complexity : O(m*n)
Auxiliary Space : O(m)*/

/*The LCIS is : 3 9 
Length of LCIS is 2*/
public class LongestCommonIncreasingSubsequence1 {

	public static void main(String[] args) {
		int arr1[] = { 3, 4, 9, 1 };
		int arr2[] = { 5, 3, 8, 9, 10, 2, 1 };
		int n = arr1.length;
		int m = arr2.length;
		System.out.println("\nLength of LCIS is " + LCIS(arr1, n, arr2, m));
	}

	static int LCIS(int arr1[], int n, int arr2[], int m) {
		int table[] = new int[m];
		int parent[] = new int[m];
		for (int j = 0; j < m; j++)
			table[j] = 0;
		for (int i = 0; i < n; i++) {
			int current = 0, last = -1;
			for (int j = 0; j < m; j++) {
				if (arr1[i] == arr2[j]) {
					if (current + 1 > table[j]) {
						table[j] = current + 1;
						parent[j] = last;
					}
				}
				if (arr1[i] > arr2[j]) {
					if (table[j] > current) {
						current = table[j];
						last = j;
					}
				}
			}
		}
		int result = 0, index = -1;
		for (int i = 0; i < m; i++) {
			if (table[i] > result) {
				result = table[i];
				index = i;
			}
		}
		int lcis[] = new int[result];
		for (int i = 0; index != -1; i++) {
			lcis[i] = arr2[index];
			index = parent[index];
		}
		System.out.print("The LCIS is : ");
		for (int i = result - 1; i >= 0; i--)
			System.out.print(lcis[i] + " ");
		return result;
	}
}
