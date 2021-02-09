package GeneralProgramming;

import java.util.Scanner;

/*Here is your pattern….!!!
1
10
101
1010
10101
101010
1010101*/

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
