package dailyConnect;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class NumberOfGoodPairs {
	
	/*
	 * https://leetcode.com/problems/number-of-good-pairs/description/
	 * 
	 * [1,2,3,1,1,3] -- 4
	 * [1, 2, 3, 4, 5] -- 0
	 * [1, 1, 1, 1] -- 6
	 * 
	 * Initialize a counter variable
	 * Outer loop from to 0 to length of the array
	 * Inter loop from i+1 to length of the array
	 * If the value of i and j are equal, then increment the counter
	 * return count
	 * 
	 * Using Map, iterate through the array 
	 * Increment the count for the current number in the map
	 * pairs formed with the current element
	 * Increment the count in the map for the current element
	 * Return the count
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(16, IdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3, 6, 9, 15, 1, 1, 1 }));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(4, IdenticalPairs(new int[] { 1,2,3,1,1,3 }));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, numIdenticalPairs(new int[] { 1, 2, 3, 4, 5 }));
	}

	public int IdenticalPairs(int[] nums) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			int current = map.getOrDefault(num, 0);
			count = count + current;
			map.put(num, current + 1);
		}

		return count;
	}

	public int numIdenticalPairs(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}

		}
		return count;
	}

}
