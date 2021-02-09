package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*         Input: First line contains a positive integer N - total number of
*         checkpoints Second line contains N space-separated integers - ai -
*         the speeds of Dom's car at each checkpoint. Third line contains N
*         space-separated integers - bi - the speeds of Brian's car at each
*         checkpoint.
* 
*         Output: Print who had the maximum change in speed between 2
*         consecutive checkpoints - Dom or Brian. If both have equal maximum
*         change in speed, print "Tie". Print a single integer on a new line -
*         the maximum absolute change in speed between 2 consecutive
*         checkpoints.
* 
*/

public class TWO_Fast_TWO_Furious {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine().trim());
		int T = N;

		long dom[] = new long[N];
		long brian[] = new long[N];
		s = br.readLine().trim();
		st = new StringTokenizer(s);
		for (int i = 0; i < N; i++) {
			dom[i] = Long.parseLong(st.nextToken());
		}
		s = br.readLine().trim();
		st = new StringTokenizer(s);
		for (int i = 0; i < N; i++) {
			brian[i] = Long.parseLong(st.nextToken());
		}
		long maxbrian, maxdom, score;
		String ans = "";

		score = maxbrian = maxdom = 0l;
		for (int i = 1; i < N; i++) {
			maxdom = Math.max(maxdom, Math.abs(dom[i] - dom[i - 1]));
			maxbrian = Math.max(maxbrian, Math.abs(brian[i] - brian[i - 1]));
		}
		if (maxdom > maxbrian) {
			score = maxdom;
			ans = "Dom";
		} else if (maxdom < maxbrian) {
			score = maxbrian;
			ans = "Brian";

		} else {
			score = maxdom;
			ans = "Tie";
		}
		System.out.println(ans);
		System.out.println(score);

	}

}
