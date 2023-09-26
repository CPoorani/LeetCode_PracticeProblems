package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;

public class P82_BowlingGame {
	
	/*
	 * player1 = [4,10,7,9], player2 = [6,5,2,3] Output: 1
	 * Lengths are equal
	 * First index as 10
	 * Last index as 10
	 * 
	 * {5, 7, 7, 10} {10, 2, 3, 4}
	 * {9, 9, 9, 9 } {10, 2, 3, 5}
	 * {2} {2}
	 * 
	 * Initialize a boolean variable flag to keep in track of the 10
	 * Initialize a variable score to 0
	 * Iterate through the loop 
	 * 	If the flag is set to false, then add the score along with the player value
	 * 	else Check if the index value has 10, set the flag to true and from next number, multiply 2 along with player value and add score along with it
	 * Return the score
	 * Calculate for both player 1 and player 2
	 * if the player1 score is higher, return 1
	 * if the player2 score is higher, return 2
	 * else return 0
	*/

	@Test
	public void test2() {
		Assert.assertEquals(2, isWinner(new int[] { 5, 6, 1, 10 }, new int[] { 5, 1, 10, 5 }));
	}

	@Test
	public void test1() {
		Assert.assertEquals(1, isWinner(new int[] { 4, 10, 7, 9 }, new int[] { 6, 5, 2, 3 }));
	}

	@Test
	public void test() {
		Assert.assertEquals(0, isWinner(new int[] { 2 }, new int[] { 2 }));
	}
	
	public int checkScore(int[] player) {
		int score = 0;
		boolean flag = false;

		for (int i = 0; i < player.length; i++) {
			if (flag) {
				score += 2 * player[i];
			} else {
				score += player[i];
			}

			if (player[i] == 10 && i < player.length - 2) {
				flag = true;
			}
		}

		return score;
	}

	public int isWinner(int[] player1, int[] player2) {
		int score1 = checkScore(player1);
		int score2 = checkScore(player2);

		if (score1 > score2) {
			return 1;
		} else if (score2 > score1) {
			return 2;
		} else {
			return 0;
		}
	}
}
