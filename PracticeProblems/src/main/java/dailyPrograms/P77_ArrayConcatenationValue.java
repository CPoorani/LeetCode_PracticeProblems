package dailyPrograms;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class P77_ArrayConcatenationValue {

	/*
	 * https://leetcode.com/problems/find-the-array-concatenation-value/
	 * Input: nums = [7,52,2,4] ; Output: 596
	 * 
	 * Input : array
	 * Output : long
	 * Initialize variables cv, left to 0 and right to nums.length-1
	 * Get the concatenated value by taking the left and right
	 * convert value to long, add it with cv and assign it to cv
	 * Increment left pointer and decrement right
	 * if the left and right are equal, add it along with the cv and return cv
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(596, findTheArrayConcVal(new int[] { 7, 52, 2, 4 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(7137, findTheArrayConcVal(new int[] { 7, 28, 109 }));
	}

	@Test
	public void test1() {
		Assert.assertEquals(26, findTheArrayConcVal(new int[] { 26 }));
	}

	public long findTheArrayConcVal(int[] nums) {

		long cv = 0;
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			String value = String.valueOf(nums[left]) + String.valueOf(nums[right]);
			cv = cv + Long.parseLong(value);

			left++;
			right--;
		}

		if (left == right) {
			cv = cv + nums[left];
		}

		return cv;
	}
}
