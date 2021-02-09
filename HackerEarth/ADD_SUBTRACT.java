package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*         Input:
* 
*         The first line contains T indicating test cases.Second line contains
*         2 integers N indicating the number of elements in his array and K.
* 
*         Third line contains N space separated integers denoting Chandan
*         array.
* 
*         Output:
* 
*         The minimum cost required to get K equal elements.
* 
*/

public class ADD_SUBTRACT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;

		while (T > 0) {
			if ((s = br.readLine().trim()) != null) {
				st = new StringTokenizer(s);
				int N = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				int arr[] = new int[N];
				int mincost = Integer.MAX_VALUE;
				if ((s = br.readLine().trim()) != null) {
					st = new StringTokenizer(s);
					for (int i = 0; i < N; i++) {
						arr[i] = Integer.parseInt(st.nextToken());
					}
					for (int i = 1; i <= 100; i++) {
						int cost[] = new int[N];
						for (int j = 0; j < N; j++) {
							if (arr[j] > i) {
								cost[j] = (arr[j] - i) * 5;
							} else {
								cost[j] = (i - arr[j]) * 3;
							}
						}
						Arrays.sort(cost);
						int totalcost = 0;
						for (int j = 0; j < K; j++) {
							totalcost += cost[j];
						}

						mincost = Math.min(mincost, totalcost);
					}
					out.println(mincost);
					T--;
				}

			}

		}
		out.close();
	}

}
