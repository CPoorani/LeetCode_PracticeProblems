package mandatoryHomeWork.foundation;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P12_SingleElement {

	/*
	 * Input: Array of Integers 
	 * Output: An integer value 
	 * Initialize an empty set 
	 * Iterate through the elements in the array 
	 * If the element is not already present in the array, then add it to the set
	 * If the element is present in the set, remove the same element that is already present
	 * Return the unique element using iterator
	 */
	@Test
	public void test() {
		int actual = isSingleElement(new int[] { 4, 1, 2, 1, 2 });
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test1() {
		int actual = isSingleElement(new int[] { 2, 2, 1 });
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int actual = isSingleElement(new int[] { 1 });
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

	public int isSingleElement(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			if (!set.add(i)) {
				set.remove(i);
			}
		}

		return set.iterator().next();

	}

}
