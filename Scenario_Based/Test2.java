package Scenario_Based;

import java.util.HashMap;
import java.util.Map;

/*Need to design and develop java program for assigning rankings to “Premier League” players. To start with all the players would have zero points. 
 * After every game, points would be updated for players based on the performance. Design data structure and algorithm to print the player rankings 
 * after every game. 
Sample input and outputs: Input to program would be of the format “player Id, points from the game”. Example : 
1 2 
2 1 
3 5 
1 2 
2 3 
3 5*/

public class Test2 {

	int numberOfPlayers;
	int numberOfGames;
	Map<Integer, Integer> scores;

	public Test2() {
		this.scores = new HashMap<Integer, Integer>();
	}

	public void printScore() {
		System.out.println("Printing Score");
		for (Integer id : this.scores.keySet()) {
			int key = id.intValue();
			int value = this.scores.get(id).intValue();
			System.out.println(key + "=" + value);
		}
	}

	public void startTournament(int players, int games) {
		this.numberOfGames = games;
		this.numberOfPlayers = players;
		System.out.println("starting tournament");
		for (int i = 1; i <= this.numberOfPlayers; i++) {
			this.scores.put(i, 0);
		}
	}

	public static void main(String[] args) {
		Test2 rankings = new Test2();
		rankings.startTournament(10, 10);
		rankings.printScore();
		System.out.println("Scores after first game");
		PlayerScore[] score1 = new PlayerScore[10];
		score1[0] = new PlayerScore(1, 3);
		score1[1] = new PlayerScore(2, 4);
		score1[2] = new PlayerScore(3, 10);
		score1[3] = new PlayerScore(4, 1);
		score1[4] = new PlayerScore(5, 0);
		score1[5] = new PlayerScore(6, 5);
		score1[6] = new PlayerScore(7, 2);
		score1[7] = new PlayerScore(8, 7);
		score1[8] = new PlayerScore(9, 2);
		score1[9] = new PlayerScore(10, 1);
		rankings.updatingScores(score1);
		rankings.printScore();
		System.out.println("Scores after second game");
		score1[0] = new PlayerScore(1, 3);
		score1[1] = new PlayerScore(2, 4);
		score1[2] = new PlayerScore(3, 3);
		score1[3] = new PlayerScore(4, 1);
		score1[4] = new PlayerScore(5, 4);
		score1[5] = new PlayerScore(6, 5);
		score1[6] = new PlayerScore(7, 2);
		score1[7] = new PlayerScore(8, 7);
		score1[8] = new PlayerScore(9, 2);
		score1[9] = new PlayerScore(10, 10);
		rankings.updatingScores(score1);
		rankings.printScore();

	}

	private void updatingScores(PlayerScore[] args) {
		int playerValue;
		for (int i = 0; i < args.length; i++) {
			playerValue = this.scores.get(args[i].idPlayer);
			this.scores.replace(args[i].idPlayer, args[i].score + playerValue);

		}

	}
}

class PlayerScore {
	int idPlayer;
	int score;

	public PlayerScore(int idPlayer, int score) {
		this.idPlayer = idPlayer;
		this.score = score;
	}
}