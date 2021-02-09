package Puzzles;

//Given n number of spots, and two players. Players need to connect any two spots without intersecting any of the drawn line, 
//the player who cannot give a move, loses. Determine who will win player1 or player2

/*Input : n = 2
Output : player 2

Input : n = 3
Output : player 1*/

public class GameofBrusselsSprouts {

	public static void main(String[] args) {
		int n1 = 2;
		winner(n1);  //Player 2
		int n2 = 3;
		winner(n2);  //Player 1
	}

	static void winner(int n) {
		int m = 5 * n - 2;
		if (m % 2 == 1)
			System.out.println("Player 1");
		else
			System.out.println("Player 2");
	}
}
