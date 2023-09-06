package dailyConnect;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimizeTheDifference {

	/*
	 * Input : Array and int (K) 
	 * Output : int 
	 * Sort the array
	 * Calculate the difference between the last and first element
	 * Update the values of max and min by traversing through the array and return the min difference
	 */
	@Test
	public void test() {
		int[] arr = { 1, 2, 3, 4, 5};
		int k = 2; 
		Assert.assertEquals(4, minimize(arr, k));
	}
	
	@Test
	public void test1() {
		int[] arr = { 1, 3, 3};
		int k = 2; 
		Assert.assertEquals(4, minimize(arr, k));
	}

	public int minimize(int[] arr, int k) {
		int n = arr.length;

		Arrays.sort(arr);

		int diffference = arr[n - 1] - arr[0]; // 4

		for (int i = 0; i < n; i++) { // need to correct to find min and max
			int currentMin = Math.min(arr[i] - k, 0);
			int currentMax = Math.max(arr[i] + k, 0);

			int diff = currentMax - currentMin;
			diffference = Math.min(diffference, diff);

		}
		return diffference;
	}
}