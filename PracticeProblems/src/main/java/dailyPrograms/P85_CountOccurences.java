package dailyPrograms;

import org.junit.Assert;
import org.junit.Test;

public class P85_CountOccurences {
	
	/*
	 * Iterate through the array
	 * Initialize a counter variable
	 * If the number is present, increament the counter
	 * Return coun
	 */
	
	@Test
	public void test() {
		int result = countOccurances(new int[] { -1, 0, 2, 3, 3, 3, 4, 4, 4 }, 1);
		Assert.assertEquals(0, result);

	}

	@Test
	public void test1() {
		int result = countOccurances(new int[] { 1, 1, 2, 2, 2, 2, 3 }, 2);
		Assert.assertEquals(4, result);

	}

	public int countOccurances(int[] num, int x) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == x) {
				count++;
			}
		}
		return count;

	}

}
