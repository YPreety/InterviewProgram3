package GeneralProgramming;

import java.util.Scanner;

/*Here is your pattern….!!!
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1*/

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		for (int i = rows; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
