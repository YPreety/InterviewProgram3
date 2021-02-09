package Dynamic_Programming;

/*The Floyd Warshall Algorithm is for solving the All Pairs Shortest Path problem. 
The problem is to find shortest distances between every pair of vertices in a given edge weighted directed Graph.
Time Complexity: O(V^3)
Input:
    graph[][] = { {0,   5,  INF, 10},
                 {INF,  0,  3,  INF},
                 {INF, INF, 0,   1},
                 {INF, INF, INF, 0} }

Output:
Shortest distance matrix
      0      5      8      9
    INF      0      3      4
    INF    INF      0      1
    INF    INF    INF      0 */
/* Let us create the following weighted graph
>         10
>      (0)------->(3)
>      |         /|\
>      5 |          |
>      |          | 1
>      \|/         |
>      (1)------->(2)
>         3           */

public class FloydWarshallAlgorithm {

	final static int INF = 99999, V = 4;

	public static void main(String[] args) {
		int graph[][] = { { 0, 5, INF, 10 }, { INF, 0, 3, INF }, { INF, INF, 0, 1 }, { INF, INF, INF, 0 } };
		FloydWarshallAlgorithm a = new FloydWarshallAlgorithm();
		a.floydWarshall(graph);
	}

	void floydWarshall(int graph[][]) {
		int dist[][] = new int[V][V];
		int i, j, k;
		for (i = 0; i < V; i++)
			for (j = 0; j < V; j++)
				dist[i][j] = graph[i][j];
		for (k = 0; k < V; k++) {
			for (i = 0; i < V; i++) {
				for (j = 0; j < V; j++) {
					if (dist[i][k] + dist[k][j] < dist[i][j])
						dist[i][j] = dist[i][k] + dist[k][j];
				}
			}
		}
		printSolution(dist);
	}

	void printSolution(int dist[][]) {
		System.out.println("Following matrix shows the shortest " + "distances between every pair of vertices");
		for (int i = 0; i < V; ++i) {
			for (int j = 0; j < V; ++j) {
				if (dist[i][j] == INF)
					System.out.print("INF ");
				else
					System.out.print(dist[i][j] + "   ");
			}
			System.out.println();
		}
	}
}


/*Following matrix shows the shortest distances between every pair of vertices
0   5   8   9   
INF 0   3   4   
INF INF 0   1   
INF INF INF 0  */