package todo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class AirthmeticTriplets {
	
	/*
	 * Input : Array and int
	 * Output : int
	 * 
	 * [0,1,4,6,7,10], diff = 3 --- 2
	 * [0,1,2,3,4,5,9,10,11], diff = 1 --- 6
	 * [15, 23, 29], diff = 9 --- 0
	 * 
	 * 
	 * Outer loop to iterate from 0 to length of the array-2
	 * Inner loop to iterate from i+1 to length of the array-1
	 * Another inner loop to iterate from j+1 to length of the array
	 * check the the the difference of j & i and k and j
	 * If the are equal to given diff, then increment the count
	 * 
	 * Initialize three pointers i at position 0, j at position 1 and k at position 2
	 * Iterate through the array
	 * Find the difference between j and i and then k and j
	 * If the differences are equal increment count, i, j and k
	 * else if the firstdiff is lesser, increment the j and k
	 * else i alone
	 * return count
	 * 
	 * Using hashset -- Create an empty hashset
	 * Add the numbers to the set
	 * Outer loop from 0 to length of the array
	 * Inner loop from i+1 to length of the array
	 * Find the diff between j and i and check if the set contains j+diff
	 * if so, increment the count
	 * return count
	 */
	
	@Test
	public void test()
	{
		int res = findTriplets(new int[] {0,1,4,6,7,10}, 3);
		System.out.println(res);
	}
	
	@Test
	public void test1()
	{
		int res = findTriplets(new int[] {15, 23, 29}, 9);
		System.out.println(res);
	}
	
	public int findTriplets(int[] nums, int diff) {
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
	
	public int triplets(int[] nums, int diff) {
		int count = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length-1; i++) {
				for (int k = j + 1; j < nums.length; i++)
					if (nums[k] - nums[j] == diff || nums[j] - nums[i] == diff) {
						count++;
					}
			}
		}
		return count;
	}
	
	public int usingThreePointers(int[] nums, int diff) {
	    int i = 0, j = 1, k = 2;
	    int count = 0;
	    int n = nums.length;

	    while (i < n && j < n && k < n) {
	        int firstDiff = nums[j] - nums[i];
	        int secondDiff = nums[k] - nums[j];

	        if (firstDiff == diff && secondDiff == diff) {
	            count++;
	            i++;  
	            j++;
	            k++;
	        } else if (firstDiff < diff) {
	            j++;
	            k++;
	        } else {
	            i++;
	        }
	    }

	    return count;
	}
	
}
	
	
	