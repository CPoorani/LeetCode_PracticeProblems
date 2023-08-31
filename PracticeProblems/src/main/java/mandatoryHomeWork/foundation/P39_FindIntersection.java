package mandatoryHomeWork.foundation;

import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

import org.junit.Assert;
import org.junit.Test;

public class P39_FindIntersection {

	/*
	 * Input : Array
	 * Output : Array
	 * Have two empty hashset (Set and Intersection)
	 * iterate through the input array and add it to set
	 * Iterate through the second array and check if the set already contains the value from first array
	 * If so, add it to intersection set
	 * Create an result array
	 * Add the intersection set value to the result array
	 * Return the result array
	 */
	@Test
	public void test() {
		int[] actual = intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 });
		Assert.assertArrayEquals(new int[] { 2 }, actual);
	}

	@Test
	public void test1() {
		int[] actual = intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
		Assert.assertArrayEquals(new int[] { 4, 9 }, actual);
	}

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> intersection = new HashSet<Integer>();

		for (int i : nums1) {
			set.add(i);
		}

		for (int i : nums2) {
			if (set.contains(i)) {
				intersection.add(i);
			}
		}

		int[] result = new int[intersection.size()];
		int index = 0;
		for (int num : intersection) {
			result[index++] = num;
		}
		return result;
	}
}
