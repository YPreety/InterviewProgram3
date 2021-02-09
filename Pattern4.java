package GeneralProgramming;

import java.util.Scanner;

/*How Many Rows You Want In Your Pyramid?
5
Here Is Your Pyramid
          1 
        1 2 1 
      1 2 3 2 1 
    1 2 3 4 3 2 1 
  1 2 3 4 5 4 3 2 1*/

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rows You Want In Your Pyramid?");
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		System.out.println("Here Is Your Pyramid");
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}
			for (int j = rowCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			rowCount++;
		}
	}
}
