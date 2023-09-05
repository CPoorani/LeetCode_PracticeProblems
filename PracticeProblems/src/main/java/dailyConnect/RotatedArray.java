package dailyConnect;

import org.junit.Assert;
import org.junit.Test;

public class RotatedArray {
	/*
	 * Input : Array
	 * Output : Array
	 * Traverse through the array
	 * Find the index of K
	 * Create an empty array output and place the elements from the index k (after k)
	 * For before k, traverse from n-index
	 * Return the output array
	 */
	@Test
	public void test()
	{
			int[] expected = new int[] {3, 4, 5, 1, 2};
	        int[] actual = rotateArray(new int[] {1, 2, 3, 4, 5}, 3);
	        Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test2()
	{
			int[] expected = new int[] {43, 1, 1, 7, 5, 2, 11, 2};
	        int[] actual = rotateArray(new int[] {2, 11, 2, 43, 1, 1, 7, 5}, 43);
	        Assert.assertArrayEquals(expected, actual);
	}
	
	
	public int[] rotateArray(int[] arr, int k) {
		int n = arr.length;
		int[] output = new int[arr.length];
		int index = 0;

		if (index == -1) {
			return arr;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				index = i;
				break;
			}
		}

		int indexVal = 0;
		// after index
		for (int i = index; i < n; i++) {
			output[indexVal++] = arr[i];

		}

		// before index
		for (int i = n - index; i < n; i++) {
			output[i] = arr[i - (n - index)];
		}

		return output;
	}
}