package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P33_PlusOne {
	/*
	 * Input : Array
	 * Output : Array
	 * Traverse through the input array in reverse order 
	 * If the last digit is lesser than 9
	 * Then, just increase the value by 1
	 * else
	 * make the value as 0 and the increase the array size by input array length+1
	 * Make the arr[0] to 1 and return the array
	 */

	@Test
	public void test() {
		int[] actual = onePlus(new int[] { 4, 3, 2, 1 });
		Assert.assertArrayEquals(new int[] { 4, 3, 2, 2 }, actual);
	}

	@Test
	public void test1() {
		int[] actual = onePlus(new int[] { 9 });
		Assert.assertArrayEquals(new int[] { 1, 0 }, actual);
	}

	public int[] onePlus(int[] input) {
		for (int i = input.length - 1; i >= 0; i--) {
			if (input[i] < 9) {
				input[i]++;
				return input;
			}
			input[i] = 0;
		}

		input = new int[input.length + 1];
		input[0] = 1;
		return input;
	}
}