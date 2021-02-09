package GeneralProgramming;
import java.util.Scanner;

/*output

1        16        15        14        13
2        17        24        23        12
3        18        25        22        11
4        19        20        21        10
5        6         7         8         9*/

public class SpiralMatrixInAntiClockwise {

	public static void main(String[] args) {
		System.out.println("Enter The Value For N :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] spiral = new int[n][n];
		int value = 1;
		int minCol = 0;
		int maxCol = n - 1;
		int minRow = 0;
		int maxRow = n - 1;
		while (value <= n * n) {
			for (int i = minRow; i <= maxRow; i++) {
				spiral[i][minCol] = value;
				value++;
			}

			for (int i = minCol + 1; i <= maxCol; i++) {
				spiral[maxRow][i] = value;
				value++;
			}

			for (int i = maxRow - 1; i >= minRow; i--) {
				spiral[i][maxCol] = value;
				value++;
			}

			for (int i = maxCol - 1; i >= minCol + 1; i--) {
				spiral[minRow][i] = value;
				value++;
			}
			minCol++;
			minRow++;
			maxCol--;
			maxRow--;
		}

		for (int i = 0; i < spiral.length; i++) {
			for (int j = 0; j < spiral.length; j++) {
				System.out.print(spiral[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
