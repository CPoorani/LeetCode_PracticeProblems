package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P56_SetMismatch {
	
	//https://leetcode.com/problems/set-mismatch/description/
	
	/*
	 * Input : Array
	 * Output : Array
	 * Resultant array with size as 2
	 * Boolean array to keep in track of the visited elements
	 * Iterate through the numbers
	 * 	for the non-visited element, the flag will be false
	 * 	if the number is visited, set the result[0] = num
	 * Iterate through the numbers till the given length, assign the non-visited element with i(result array)
	 * return result array
	 */

	@Test
	public void test() {
		int[] expected = new int[] {2, 3};
		Assert.assertArrayEquals(expected, mismatch(new int[] { 1, 2, 2, 4 }));
	}
	
	@Test
	public void test1() {
		int[] expected = new int[] {1, 2};
		Assert.assertArrayEquals(expected, mismatch(new int[] { 1, 1 }));
	}
	
	@Test
	public void test2() {
		int[] expected = new int[] {1, 4};
		Assert.assertArrayEquals(expected, mismatch(new int[] { 1, 1, 2, 3 }));
	}

	public int[] mismatch(int[] nums) {
		   int[] result = new int[2];
		    boolean[] val = new boolean[nums.length + 1];
		    
		    for (int num : nums) {
		        if (val[num]) {
		            result[0] = num; 
		        }
		        val[num] = true;
		    }
		    
		    for (int i = 1; i <= nums.length; i++) {
		        if (!val[i]) {
		            result[1] = i; 
		            break;
		        }
		    }
		    
		    return result;
		}
}
       