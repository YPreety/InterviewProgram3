package Dynamic_Programming;

/*Count all possible walks from a source to a destination with exactly k edges
A simple solution*/

public class CountAllPossibleWalks {

	static final int V = 4; 

	public static void main(String[] args) throws java.lang.Exception {
		int graph[][] = new int[][] { { 0, 1, 1, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 } };
		int u = 0, v = 3, k = 2;
		CountAllPossibleWalks p = new CountAllPossibleWalks();
		System.out.println(p.countwalks(graph, u, v, k)); //2
	}

	int countwalks(int graph[][], int u, int v, int k) {
		if (k == 0 && u == v)
			return 1;
		if (k == 1 && graph[u][v] == 1)
			return 1;
		if (k <= 0)
			return 0;
		int count = 0;
		for (int i = 0; i < V; i++)
			if (graph[u][i] == 1) 
				count += countwalks(graph, i, v, k - 1);
		return count;
	}
}
