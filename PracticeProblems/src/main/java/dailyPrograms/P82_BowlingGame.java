package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;

public class P82_BowlingGame {
	
	/*
	 * player1 = [4,10,7,9], player2 = [6,5,2,3] Output: 1
	 * 
	 * {5, 7, 7, 10} {10, 2, 3, 4}
	 * {9, 9, 9, 9 } {10, 2, 3, 5}
	 * {2} {2}
	 * First index as 10
	 * Last index as 10
	 * Adjacent as 10
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
	public void test() {
		Assert.assertEquals(1, isWinner(new int[] { 4,10,7,9 },
				new int[] { 6,5,2,3 }));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(1, isWinner(new int[] { 5, 3 },
				new int[] { 4, 1}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, isWinner(new int[] { 7, 10, 2, 6, 8, 5, 4, 6, 10, 9, 1, 4, 3, 10, 0, 9, 6, 1, 0 },
				new int[] { 2, 1, 9, 4, 5, 0, 6, 5, 6, 10, 10, 4, 8, 8, 6, 9, 2, 9, 5 }));
	}
	

	public int checkScore(int[] player) {
		int score = 0;
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < player.length; i++) {
			if (flag) {
				score += 2 * player[i];
				count++;
				if (count > 1) {
					flag = false;
					count = 0;
				}
			} else {
				score += player[i];
			}

			if (player[i] == 10) {
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