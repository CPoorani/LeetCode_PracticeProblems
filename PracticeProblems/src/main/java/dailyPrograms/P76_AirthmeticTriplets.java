package dailyPrograms;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P76_AirthmeticTriplets {
	
	/*
	 * https://leetcode.com/problems/number-of-arithmetic-triplets/description/
	 * 
	 * Input: nums = [0,1,4,6,7,10], diff = 3, Output: 2
	 * 
	 * Input : Array and int
	 * Output : int
	 * Create an empty set
	 * Iterate over the array and add the numbers to set
	 *	 Outer loop from 0 to array length
	 * 	 Inner loop from i+1 to array length
	 * if the nums[j]-nums[i] == diff and set contains nums[j]+diff
	 * 	Increment count
	 * return count
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(2, arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3));
	}
	
	public int arithmeticTriplets(int[] nums, int diff) {
		int count = 0;
	    Set<Integer> set = new HashSet<>();

	    for (int num : nums) {
	        set.add(num);
	    }

	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] - nums[i] == diff && set.contains(nums[j] + diff)) {
	                count++;
	            }
	        }
	    }

	    return count;
	}
}