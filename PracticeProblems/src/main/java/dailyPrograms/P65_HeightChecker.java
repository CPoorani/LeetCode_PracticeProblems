package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;
import java.util.Arrays;


public class P65_HeightChecker {
	
	/*
	 * Input : Array, Output : Int
	 * Copy the input array using clone or copy of or by iterating and add it to the expected array
	 * Initialize a variable count to 0
	 * Iterate through the input array 
	 * 	If the expected!=height
	 * 	Increase the counter value
	 * Return count
	 */
	
	@Test
	public void test() {
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		int expected = 3;
		Assert.assertEquals(expected, heightChecker(heights));
	}

	@Test
	public void test1() {
		int[] heights = { 1, 1, 1, 1 };
		int expected = 0;
		Assert.assertEquals(expected, heightChecker(heights));
	}

	@Test
	public void test2() {
		int[] heights = { 5, 1, 2, 3, 4 };
		int expected = 5;
		Assert.assertEquals(expected, heightChecker(heights));
	}
	
	public int heightChecker(int[] heights) {
		int[] arr = new int[heights.length];
		int count = 0, index = 0, j = 0;

		for (int height : heights) {
			arr[index++] = height;
		}
		Arrays.sort(arr);

		for (; j < heights.length; j++) {
			if (arr[j] != heights[j]) {
				count++;
			}
		}
		return count;

	}

}
