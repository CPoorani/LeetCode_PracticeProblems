package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P50_CheckStraightLine {
	/*
	 * (1,2) (2,3) (3,4) (4,5) (5,6) (6,7)
	 * Slope = (y2-y1) / (x2-x1) -- Between P1 and P2
	 * Slope = (y3-y1) / (x3-x1) -- Between P1 and P3
	 * (y2-y1)*(x3-x1) == (x2-x1)*(y3-y1)
	 * 
	 * Hint : referred to get the formula on how to calculate the slope and to handle arithmetic exception
	 * Find the difference between P1 and P2 
	 * 		Difference of X and Difference of Y
	 * 		For X, X2-X1
	 * 		For Y, Y2-Y1
	 * Iterate through the input elements length to compare the first with the third, forth and so or the adjacent ones
	 * 		Find the coordinates for the given i
	 * 		Multiply ==> DifferenceOfY*(x3-x1) != DifferenceOfX*(y3-y1)
	 * 			return false
	 * else
	 * 			return true
	 * 
	 */

	public class CheckStraightLine {

		@Test
		public void test() {
			int[][] actual = new int[][] {{ 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 }};
			Assert.assertEquals(true, checkLine(actual));
		}

		@Test
		public void test1() {
			int[][] actual = new int[][] {{ 1, 1 }, { 2, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 67, 7 }};
			Assert.assertEquals(false, checkLine(actual));
		}

		public boolean checkLine(int[][] coordinates) {
			int differenceX = coordinates[1][0] - coordinates[0][0];
			int differenceY = coordinates[1][1] - coordinates[0][1];
			for (int i = 2; i < coordinates.length; i++) {
				if (differenceY * (coordinates[i][0] - coordinates[0][0]) != differenceX
						* (coordinates[i][1] - coordinates[0][1]))
					return false;
			}

			return true;

		}
	}


}
