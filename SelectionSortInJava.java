package GeneralProgramming;
/*Performance Of The Selection Sort Algorithm :
Worst Case : O(n^2)
Average Case : O(n^2)
Best Case : O(n^2)*/

public class SelectionSortInJava {

	public static void main(String[] args) {
		selectionSort(new int[] { 45, 84, 101, 62, 12, 45 });
		selectionSort(new int[] { 62, -45, 14, 8, -52, 45 });
		selectionSort(new int[] { 21, 12, 56, -48, 15, 45 });
	}

	static void selectionSort(int[] inputArray) {
		int temp, pos;
		for (int i = 0; i < inputArray.length - 1; i++) {
			pos = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[pos]) {
					pos = j;
				}
			}
			temp = inputArray[i];
			inputArray[i] = inputArray[pos];
			inputArray[pos] = temp;
		}
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();
	}
}
