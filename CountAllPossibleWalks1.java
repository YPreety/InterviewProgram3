package Dynamic_Programming;

//solution using Dynamic Programming.
public class CountAllPossibleWalks1 {

	static final int V = 4; 

	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 1, 1, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 } };
		int u = 0, v = 3, k = 2;
		CountAllPossibleWalks1 p = new CountAllPossibleWalks1();
		System.out.println(p.countwalks(graph, u, v, k)); //2
	}

	int countwalks(int graph[][], int u, int v, int k) {
		int count[][][] = new int[V][V][k + 1];
		for (int e = 0; e <= k; e++) {
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					count[i][j][e] = 0;
					if (e == 0 && i == j)
						count[i][j][e] = 1;
					if (e == 1 && graph[i][j] != 0)
						count[i][j][e] = 1;
					if (e > 1) {
						for (int a = 0; a < V; a++) 
							if (graph[i][a] != 0)
								count[i][j][e] += count[a][j][e - 1];
					}
				}
			}
		}
		return count[u][v][k];
	}
}
