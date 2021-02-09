package GeneralProgramming;

import java.util.Scanner;

/*Here is your pattern….!!!
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7*/

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
