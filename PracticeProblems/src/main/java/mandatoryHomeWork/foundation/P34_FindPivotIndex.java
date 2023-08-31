package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P34_FindPivotIndex {
	
	/*
	 * Input: array
	 * Output: Integer
	 * Initialize a variable
	 * Have two empty arraylist
	 * List1 -- left -- Traverse through the numbers from beginning and add each element along with the sum and add the result to list
	 * List2 -- right -- Traverse in reverse order and add each element with the sum and add it to list with the starting index as 0 each time
	 * Check if the index value of leftsum and rightsum equals at any position
	 * If so, return the index
	 * else
	 * return -1
	 */
	
	@Test
	public void test() {
		int actual = pivot(new int[] {1,7,3,6,5,6});
        Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, pivot(new int[] {2,1,-1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(-1, pivot(new int[] {1,2,3}));
	}

	public int pivot(int[] nums)
	{
		int n = nums.length;
	    
	    List<Integer> leftSum = new ArrayList<Integer>();
	    int sum = 0;
	    for (int num : nums) {
	       sum = sum+num;
	       leftSum.add(sum);
	    }
	    
	    List<Integer> rightSum = new ArrayList<Integer>();
	    sum = 0;
	    for (int i = n - 1; i >= 0; i--) {
	        sum = sum + nums[i];
	       rightSum.add(0, sum);
	    }

	    for (int i = 0; i < n; i++) {
	        if (leftSum.get(i) == rightSum.get(i)) {
	            return i;
	        }
	    }

	    return -1;
	}
	
	public int pivotIndex(int[] nums) {
		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];
		
		leftSum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			leftSum[i] = leftSum[i - 1] + nums[i];
		}
		
		rightSum[nums.length - 1] = nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 0; i--) {
			rightSum[i] = rightSum[i + 1] + nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			if (leftSum[i] == rightSum[i]) {
				return i;
			}
		}

		return -1;

	}
}


