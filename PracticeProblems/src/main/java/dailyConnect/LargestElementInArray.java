package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class LargestElementInArray {
	
	/*
	 * Input : array
	 * Output: int
	 * Initialize a variale max with the first index of the array
	 * Iterate through the array
	 * if the arr[i] is greater than max
	 * Assign the max value to arr[i] and return max
	 */
	
	@Test
	public void test() {
        int[] arr = {4, 7, 8, 6, 7, 6};
        int expected = largestElement(arr);
        Assert.assertEquals(8, expected);
    }
	
	@Test
	public void test1() {
        int[] arr = {15};
        int expected = largestElement(arr);
        Assert.assertEquals(1, expected);
    }
	
	public int largestElement(int[] arr) {
		int max = arr[0];

		if (arr.length == 0) {
			return -1;
		}

		if (arr.length == 1) {
			return arr[0];
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

}
