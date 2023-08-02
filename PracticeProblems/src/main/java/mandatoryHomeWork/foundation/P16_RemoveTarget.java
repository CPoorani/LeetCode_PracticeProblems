package mandatoryHomeWork.foundation;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class P16_RemoveTarget {
	
	/*
	 * Input : Array and a target element
	 * Output : Array
	 * Initialize a counter variable
	 * Traverse through the array 
	 * If the arr[index]!=target, then increase the counter variable by 1
	 * Create an empty array and copy the elements to the new array
	 * Return the newly created array
	 */

	@Test
	public void test() {
		int[] actual = removeTargetElement(new int[] { 2, 3, 3, 4, 5 }, 3);
		int[] expected = { 2, 4, 5 };
		Assert.assertArrayEquals(expected, actual);
	}

	public int[] removeTargetElement(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != target) {
				count++;
			}
		}

		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
				result[index] = arr[i];
				index++;
			}
		return result;
}

}
