package mandatoryHomeWork.foundation;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P31_MissingNumber {
	/*
	 * Input: Array 
	 * Output : Int
	 * Create an empty hashset
	 * Traverse through the array
	 * Add the numbers to the set
	 * Iterate through the set 
	 * If the !set.contains(index) - return index
	 * else return 0
	 */

	@Test
	public void test() {
		int actual = findMissingNumber(new int[] { 3, 0, 1 });
		Assert.assertEquals(2, actual);

	}

	@Test
	public void test1() {
		int actual = findMissingNumber(new int[] { 0, 1 });
		Assert.assertEquals(2, actual);

	}

	@Test
	public void test2() {
		int actual = findMissingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 });
		Assert.assertEquals(8, actual);

	}

	public int findMissingNumber(int[] arr) {
		int length = arr.length;
		Set<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			set.add(i);
		}

		for (int i = 0; i <= length; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}

		return 0;

	}

}
