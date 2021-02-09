package Dynamic_Programming;

/*Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … 
shows the first 11 ugly numbers. By convention, 1 is included.space complexity of this method is O(1)
Input  : n = 7
Output : 8
Input  : n = 10
Output : 12*/
public class UglyNumbers {

	public static void main(String[] args) {
		UglyNumbers obj = new UglyNumbers();
		int no = obj.getNthUglyNo(150);
		System.out.println("150th ugly no. is " + no); //150th ugly no. is 5832
	}

	int getNthUglyNo(int n) {
		int i = 1;
		int count = 1; 
		while (n > count) {
			i++;
			if (isUgly(i) == 1)
				count++;
		}
		return i;
	}

	int isUgly(int no) {
		no = maxDivide(no, 2);
		no = maxDivide(no, 3);
		no = maxDivide(no, 5);
		return (no == 1) ? 1 : 0;
	}

	int maxDivide(int a, int b) {
		while (a % b == 0)
			a = a / b;
		return a;
	}
}
