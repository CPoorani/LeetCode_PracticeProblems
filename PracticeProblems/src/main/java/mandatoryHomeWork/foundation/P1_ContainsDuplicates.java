package mandatoryHomeWork.foundation;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P1_ContainsDuplicates {
	/*
	 * Input: Array of integers
	 * Output : boolean value
	 * Initialize an empty set
	 * Iterate through the elements in an array	
	 * If the element is already present in the set, then return false
	 * Else, add it to the set and return true.
	 */
	@Test
	public void test() {
		boolean actual = isDuplicate(new int[] { 1, 2, 3, 1 });
		Assert.assertEquals(true, actual);

	}

	@Test
	public void test1() {
		boolean actual = isDuplicate(new int[] { 1, 2, 3, 4 });
		Assert.assertEquals(false, actual);

	}

	@Test
	public void test2() {
		boolean actual = isDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 });
		Assert.assertEquals(true, actual);

	}
	
	@Test
	public void test3() {
		boolean actual = isDuplicate(new int[] { 9, 10 });
		Assert.assertEquals(false, actual);

	}

	public boolean isDuplicate(int[] nums) {
		Set<Integer> values = new HashSet<Integer>();

		for (int i=0; i<nums.length;i++) {
			if (!values.add(nums[i])) {
				return true;
			}
		}
		return false;

	}
}
