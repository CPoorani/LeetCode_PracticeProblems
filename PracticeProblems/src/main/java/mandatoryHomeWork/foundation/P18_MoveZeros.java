package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P18_MoveZeros {
	
	//https://leetcode.com/problems/move-zeroes/
	
	/* Input : Integer array
	 * Output : Array
	 * Create an empty list and add the numbers to the list if the number!=0
	 * For zeros, have a separate counter variable and increment 
	 * For the number of zeros, use a loop and add the zeros to list
	 * Convert the list back to array and return it
	 */
	@Test
	public void test()
	{
		int[] actual = moveZerosToEnd(new int[] {0,1,0,3,12});
		int[] expected = {1,3,12,0,0};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test1()
	{
		int[] actual = moveZerosToEnd(new int[] {0});
		int[] expected = {0};
		Assert.assertArrayEquals(expected, actual);
	}

	public int[] moveZerosToEnd(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		int zeros = 0;
		for (int num : arr) {
			if (num != 0) {
				list.add(num);
			} else {
				zeros++;
			}
		}

		for (int i = 0; i < zeros; i++) {
			list.add(0);
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
