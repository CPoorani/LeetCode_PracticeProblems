package dailyPrograms;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class P73_NumOfSubArrays {
	
	/*
	 * https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
	 * arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
	 * Output: 3
	 * 
	 * Input : Array
	 * Output : Int
	 * Initialize variables pointer, sum and count to 0
	 * Iterate the input array till K and get the sum
	 * if the sum/k is greater or equal to threshold, increment count
	 * iterate through the array length, by removing the previous element and by adding the next element
	 * get the avg for each iteration, if it is greater than threshold then increase the count
	 * return count
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(3, numOfSubarrays(new int[] {2,2,2,2,5,5,5,8}, 3, 4));
	}

	public int numOfSubarrays(int[] arr, int k, int threshold) {
		int pointer = 0, sum = 0, count = 0;

		for (; pointer < k; pointer++) {
			sum += arr[pointer];
		}
		while (pointer <= arr.length) { 
	        if (sum / k >= threshold) {
	            count++;
	        }

	        if (pointer < arr.length) {
	            sum = sum + arr[pointer] - arr[pointer - k];
	        }
	        
	        pointer++;
	    }

	    return count;
	}
}