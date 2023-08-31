package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P19_Squares {

	// https://leetcode.com/problems/squares-of-a-sorted-array/
	
	/*
	 * Input : Array
	 * Output : Array
	 * Traverse through the array
	 * Inside the loop, have it as arr[index] = arr[index]*arr[index]
	 * Sort the array after squaring
	 * Return the array
	 */

	@Test
	public void test() {
		int[] actual = squaresOfAnArray(new int[] { -4, -1, 0, 3, 10 });
		int[] expected = { 0, 1, 9, 16, 100 };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void test1() {
		int[] actual = squaresOfAnArray(new int[] { -7, -3, 2, 3, 11 });
		int[] expected = { 4, 9, 9, 49, 121 };
		Assert.assertArrayEquals(expected, actual);
	}

	public int[] squaresOfAnArray(int[] arr) {
		int result;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}

		Arrays.sort(arr);
		return arr;

	}
}
