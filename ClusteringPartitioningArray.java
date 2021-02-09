package Dynamic_Programming;

/*Clustering/Partitioning an array such that sum of square differences is minimum
Input : arr[] = {1, 5, 8, 10}
k = 2
Output : 20  
 Time Complexity of O(2^n)*/
public class ClusteringPartitioningArray {

	static int inf = 1000000000;
	static int ans = inf;

	public static void main(String[] args) {
		int k = 2;
		int a[] = { 1, 5, 8, 10 };
		int n = a.length;
		solve(-1, 0, a, n, k, 0);
		System.out.println(ans); // 20
	}

	static void solve(int i, int par, int a[], int n, int k, int current_ans) {
		if (par > k)
			return;
		if (par == k && i == n - 1) {
			ans = Math.min(ans, current_ans);
			return;
		}
		for (int j = i + 1; j < n; j++)
			solve(j, par + 1, a, n, k, current_ans + (a[j] - a[i + 1]) * (a[j] - a[i + 1]));
	}
}
