package mandatoryHomeWork.foundation;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class P6_MajorityElement {
	
	//https://leetcode.com/problems/majority-element/
	
	/*
	 * Input : Integer array
	 * Output : Integer value
	 * Assign a variable to arr.length/2
	 * Have an empty hashmap and iterate through the array 
	 * If the map contains the array value, then get the value of i and increase to 1
	 * else just insert the value
	 * From map, get the value and check if it greater than n, if so return it
	 */

	@Test
	public void test() {
		int actual = majority(new int[] { 3, 2, 3 });
		Assert.assertEquals(3, actual);
	}

	@Test
	public void test1() {
		int actual = majority(new int[] { 2, 2, 1, 1, 1, 2, 2 });
		Assert.assertEquals(2, actual);
	}

	public int majority(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = arr.length / 2;

		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}

			if (map.get(i) > n)
				return i;

		}
		return -1;

	}
}