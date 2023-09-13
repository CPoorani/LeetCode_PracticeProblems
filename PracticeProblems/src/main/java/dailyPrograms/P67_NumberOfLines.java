package dailyPrograms;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class P67_NumberOfLines {
	/*
	 * Input : Array and String, Output : Array
	 * Initialize variables lines and sum to 0
	 * Iterate through the input array
	 * 	Get the value of width by taking the character minus the 'a'
	 * 	If the sum is lesser than 100, do the sum + width
	 * 	else increase the lines count and assign sum to the width
	 * Return lines and sum as array
	 */

	@Test
	public void test() {
		Assert.assertEquals(new int[] { 3, 60 }, numberOfLines(new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, "abcdefghijklmnopqrstuvwxyz"));
	}

	@Test
	public void test1() {
		Assert.assertEquals(new int[] { 2, 4 }, numberOfLines(new int[] { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, "bbbcccdddaaa"));
	}

	public int[] numberOfLines(int[] widths, String s) {

		int lines = 1, sum = 0;

		for (int i = 0; i < s.length(); i++) {
			int width = widths[s.charAt(i) - 'a'];

			if (sum + width <= 100) {
				sum = sum + width;
			} else {
				lines++;
				sum = width;
			}
		}
		return new int[] { lines, sum };
	}
}
