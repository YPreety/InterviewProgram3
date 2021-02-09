package output;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		int [] input1 = new int []{1,2,3};
		int [] input2 = new int [] {20,30,40};
		int mincost = minCostCalculation(n , input1 , input2);
		System.out.println("minCost : " +  mincost);

	}

	private static int minCostCalculation(int n, int[] input1, int[] input2) {
		int minCost =0 ;
		int x = 0;
		int y = 0;
		int cal = 0;
		//int [] minCostArray = new int [n];
		for(int i = 0 ; i <n ; i++){
			for(int j = 0 ; j < input1.length ; j ++){
				//for (int k = 0 ; k < input2.length ; k ++){
					if	(i > j){
						x = j + 1;
						y = j + 1;
					}
					else if( j > i){
						x = i + 1;
						y = i + 1;
					}
					else{
						x = i + 1;
						y = j + 1;		
					}
					cal = (y - x)* input2[j];
					System.out.println("minCost : " +  minCost);
					System.out.println("cal : " +  cal);
					if (cal < minCost){
						minCost = cal;
					}
				//}
			}
		}
		
		//for(int m = 0 ; m < minCostArray.length ; m++){
			//minCost = Math.min(minCostArray[m], minCostArray[m++]);
		//}
		return minCost;
	}	

}
