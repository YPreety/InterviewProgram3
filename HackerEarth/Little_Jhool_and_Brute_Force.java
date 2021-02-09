package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*         Input Format: The first line contains an integer, t - denoting the
*         number of test cases.
* 
*         The next t lines will contain, an integer - n - denoting the number
*         which Jhool gives.
* 
*         Output Format: You have to print the previous number satisfying the
*         given constraints. If no such previous number exists, print -1.
* 
*/

public class Little_Jhool_and_Brute_Force {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// To generate the valid numbers
		/*
		 * for(int i=1729;i<=704977;i++) { int c=0; l1:{ for(int
		 * j=1;j<=Math.cbrt(i);j++) { for(int k=j;k<=Math.cbrt(i);k++) {
		 * if(j*j*j+k*k*k==i) c++; if(c==2) break l1; } } } if(c==2)
		 * System.out.print(i+","); }
		 */

		int cube[] = { 1729, 4104, 13832, 20683, 32832, 39312, 40033, 46683, 64232, 65728, 110656, 110808, 134379,
				149389, 165464, 171288, 195841, 216027, 216125, 262656, 314496, 320264, 327763, 373464, 402597, 439101,
				443889, 513000, 513856, 515375, 525824, 558441, 593047, 684019, 704977 };
		int arr[] = new int[704978];
		arr[0] = -1;
		int k = 0;
		for (int i = 1; i <= 704977; i++) {
			if (cube[k] <= i) {
				arr[i] = cube[k];
				k++;
			} else {
				arr[i] = arr[i - 1];
			}
		}
		int T = Integer.parseInt(br.readLine().trim());
		while (T-- > 0) {
			int num = Integer.parseInt(br.readLine().trim());
			System.out.println(arr[num]);
		}
	}
}
