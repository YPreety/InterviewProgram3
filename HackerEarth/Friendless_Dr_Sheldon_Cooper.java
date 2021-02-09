package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*         Input Format: The first line contains a number with the number of
*         test cases. Every test case has the following input:
* 
*         Two integers a, b. | a - number of places he needs to go. b - number
*         of cab drivers. b lines with two more integers. | m, n - cab driver
*         moving between points m and n.
* 
*         Output Format: Print the minimum number of cab drivers he needs to
*         have faith in to travel between places in the city.
* 
*/

public class Friendless_Dr_Sheldon_Cooper {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		while (T > 0) {
			if ((s = br.readLine().trim()) != null) {
				st = new StringTokenizer(s);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				System.out.println(a - 1);
				while (b > 0) {
					if ((s = br.readLine().trim()) != null) {

						b--;
					}
				}

				T--;

			}
		}

	}

}
