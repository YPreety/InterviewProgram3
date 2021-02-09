package GeneralProgramming;

import java.util.Scanner;

/*How Many Rows You Want In Your Pyramid?
5
Here Is Your Pyramid
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 */
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rows You Want In Your Pyramid?");
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		System.out.println("Here Is Your Pyramid");
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount + " ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
