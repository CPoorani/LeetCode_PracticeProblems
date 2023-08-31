package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P9_TwoSum {

	// https://leetcode.com/problems/two-sum/description/

	/*
	 * Input : Array 
	 * Output : Array
	 * Create an inner and an outer loop 
	 * Traverse through the array
	 * If(arr[i] + arr[j] == target) then have a new array created with index as 2 
	 * 		 Assign the value of num[0] = i and num[1] = j
	 * 		 return the indices of i and j
	 */
	@Test
	public void test()
	{
		int[] actual = twoSumIndices(new int[] {2,7,11,15},9);
		Assert.assertArrayEquals(new int[] {0,1}, actual);
	}
	
	@Test
	public void test1()
	{
		int[] actual = twoSumIndices(new int[] {3, 2, 4},6);
		Assert.assertArrayEquals(new int[] {1, 2}, actual);
	}
	
	@Test
	public void test2()
	{
		int[] actual = twoSumIndices(new int[] {3, 3},6);
		Assert.assertArrayEquals(new int[] {0,1}, actual);
	}

	public int[] twoSumIndices(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					int[] num = new int[2];
					num[0] = i;
					num[1] = j;
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1};

	}

}
