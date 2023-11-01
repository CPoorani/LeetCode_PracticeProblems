package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class SumDifferences {
	
	/*
	 * Input : Array
	 * Output : Array
	 * Create two arrays left and right
	 * Initialize two variables left and right to 0
	 * Iterate through the array from 0 to length of the array
	 * Add the numbers on left
	 * Iterate the array in reverse order
	 * Add the numbers from right
	 * Iterate till the length of the array, find the difference and store it in right sum
	 * return rightsum
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(new int[] {15,1,11,22}, leftRightDifference(new int[] {10,4,8,3}));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(new int[] {0}, leftRightDifference(new int[] {1}));
	}
	
	public int[] leftRightDifference(int[] nums) {
		int n = nums.length;
		int left = 0, right = 0;
		int[] leftSum = new int[n];
		int[] rightSum = new int[n];

		for (int i = 0; i < nums.length; i++) { 
			leftSum[i] = left;
			left = left + nums[i];
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			rightSum[i] = right;
			right = right + nums[i];
		}

		for (int i = 0; i < n; i++) {
	        rightSum[i] = Math.abs(leftSum[i] - rightSum[i]);
		}

		return rightSum;

	}

}
