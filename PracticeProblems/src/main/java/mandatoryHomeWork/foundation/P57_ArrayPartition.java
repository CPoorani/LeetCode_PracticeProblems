package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P57_ArrayPartition {

	/*
	 * Problem stmt : Given an integer array nums of 2n integers, group these
	 * integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of
	 * min(ai, bi) for all i is maximized. Return the maximized sum.
	 * 
	 * 
	 * Input : Array
	 * Output : Int
	 * Initialize a variable sum to 0 to hold the maximized sum
	 * Iterate through the array
	 * 	Find the min of i and i+1 (to compare adjacent elements)
	 * 	Add the min value with sum
	 * Return sum
	 */

	@Test
	public void test1() {
		Assert.assertEquals(1, arrayPairSum(new int[] { 0, 1, 2, 0 }));
	}

	@Test
	public void test() {
		Assert.assertEquals(17, arrayPairSum(new int[] { 1, 4, 3, 2, 5, 8, 16, 7 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(9, arrayPairSum(new int[] { 6, 2, 6, 5, 1, 2 }));
	}

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		int i = 0;
		while (i < nums.length) {
			sum = sum + Math.min(nums[i], nums[i + 1]);
			i = i+2;
		}

		return sum;
	}

}
