package Dynamic_Programming;

/*The following is a description of the instance of this famous puzzle involving n=2 eggs and a building with k=36 floors.
Time Complexity: O(nk^2)
Auxiliary Space: O(nk)
Minimum number of trials in worst case with 2  eggs and 10 floors is 4
*/

public class EggDropping {

	public static void main(String[] args) {
		int n = 2, k = 10;
		System.out.println(
				"Minimum number of trials in worst case with " + n + "  eggs and " + k + " floors is " + eggDrop(n, k));
	}

	static int eggDrop(int n, int k) {
		int eggFloor[][] = new int[n + 1][k + 1];
		int res;
		int i, j, x;

		for (i = 1; i <= n; i++) {
			eggFloor[i][1] = 1;
			eggFloor[i][0] = 0;
		}

		for (j = 1; j <= k; j++)
			eggFloor[1][j] = j;

		for (i = 2; i <= n; i++) {
			for (j = 2; j <= k; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for (x = 1; x <= j; x++) {
					res = 1 + max(eggFloor[i - 1][x - 1], eggFloor[i][j - x]);
					if (res < eggFloor[i][j])
						eggFloor[i][j] = res;
				}
			}
		}
		return eggFloor[n][k];

	}
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
