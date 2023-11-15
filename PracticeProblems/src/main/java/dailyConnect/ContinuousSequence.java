package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class ContinuousSequence {
	
	/*
	 * Given a binary array, find the index of 0 to be replaced with 1 to get a maximum length sequence of continuous ones.
	 * 
	 * Input : Array
	 * Output : Int
	 * 
	 * { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }	-- 7
	 * { 0, 0, 1, 0} -- 1 or 3
	 * { 0, 0, 1, 1, 1} -- 2
	 * {1} -- 0
	 * {0} -- 1
	 * 
	 * Initialize variables zeros, ones, maxLength, currentLength and index
	 * Iterate through the array
	 * Count zeros and ones and reset the counters 
	 * Update the maxLength according to the ones encountered
	 * Calculate index and return it
	 */

	public int findIndex(int[] arr) {
		int zeros = 0;
		int ones = 0;
		int maxLength = 0;
		int currentLength = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeros++;
				if (zeros > 1) {
					ones = 0;
					zeros = 1;
					currentLength = 0;
				} else {
					ones++;
					currentLength++;

					if (ones > maxLength) {
						maxLength = ones;
						index = i - ones + 1;
					}
				}

			}
		}
		return index;
	}
}
