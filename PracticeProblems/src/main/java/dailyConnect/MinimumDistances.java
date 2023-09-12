package dailyConnect;

import java.util.Arrays;
import java.util.List;

import org.checkerframework.checker.units.qual.min;
import org.junit.Assert;
import org.junit.Test;

public class MinimumDistances {
	
	/*
	 * Input : List, Output : Array
	 * Convert the list to array
	 * Initialize a variable minValue
	 * Outer loop to be iterated from 0 to arr.length
	 * Inner loop to be iterated from  i+1 to arr.length 
	 * 	If the value matches from i and j, find the difference between the indexes 
	 * 	If the value is negative, make it as positive
	 * Min between minvalue and difference
	 * Return minValue
	 */
	
	@Test
	public void test()
	{
		List<Integer> actual = Arrays.asList(5, 2, 1, 3, 5);
		Assert.assertEquals(4, minimumDistances(actual));
	}
	
	@Test
	public void test1()
	{
		List<Integer> actual = Arrays.asList(7, 1, 3, 4, 1, 7);
		Assert.assertEquals(3, minimumDistances(actual));
	}
	
	public int minimumDistances(List<Integer> a) {
		Integer[] arr = a.toArray(new Integer[0]);
		int minValue = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					int diff = j - i;
					if (diff < 0) {
						diff = -diff;
					}
					minValue = Math.min(minValue, diff);
				}
			}
		}
		if (minValue == Integer.MAX_VALUE) {
			return -1;
		}
		return minValue;

	}

}
