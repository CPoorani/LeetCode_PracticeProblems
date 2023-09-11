package dailyConnect;

import org.junit.Assert;
import org.junit.Test;

public class SortNumbers {
	
	/*
	 * Input : Array, Output : Array
	 * Initialize variables zero, one and two to 0
	 * Iterate through the array
	 * 	If there's "zero" in the array, increment by 1, same for 1's and 2's
	 * In the same input array
	 * 	0's - Iterate from 0 to zeros
	 * 	1's - Iterate from zero to zero+one and add it 
	 * 	2's - Iterate from zero+one to arr.length
	 * Return arr
	 */

	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] { 0, 0, 0, 1, 1, 1, 2, 2 }, sortArray(new int[] { 0, 1, 2, 1, 1, 2, 0, 0 }));
	}

	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] { 0, 2 }, sortArray(new int[] { 2, 0 }));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {}, sortArray(new int[] {}));
	}

	public int[] sortArray(int[] arr) {
		int i = 0, zero = 0, one = 0, two = 0;

		for (; i < arr.length; i++) {
			if (arr[i] == 0) {
				zero++;
			} else if (arr[i] == 1) {
				one++;
			} else {
				two++;
			}
		}

		for (int j = 0; j < zero; j++) {
			arr[j] = 0;
		}
		for (int j = zero; j < zero + one; j++) {
			arr[j] = 1;
		}
		for (int j = zero + one; j < arr.length; j++) {
			arr[j] = 2;
		}
		return arr;

	}
}
