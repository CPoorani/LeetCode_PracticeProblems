package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P13_DistrubuteCandies {

	// https://leetcode.com/problems/distribute-candies/description/

	/*
	 * Input : Integer array 
	 * Output : Integer value 
	 * Initialize a counter variable to 1, considering the candy will be unique atleast once
	 * Traverse through the array
	 * if arr[i]!=arr[j] ==> increment 
	 * Return count
	 * 
	 * Have an empty HashSet
	 * Initialize the length variable to arr.length/2
	 * Iterate through the array and add the elements to set
	 * Return the minimum value (length or Set)
	 * 
	 */
	@Test
	public void test()
	{
		int actual = distrubuteCandies(new int[] {1,1,2,2,3,3});
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test1()
	{
		int actual = distrubuteCandies(new int[] {1,1,2,3});
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = distrubuteCandies(new int[] {6,6,6,6});
		Assert.assertEquals(1, actual);
	}

	//O(n/2) - O(n)
	public int distrubuteCandies(int[] arr) {
		int count = 1;
		for (int i = 1; i < arr.length && count < arr.length / 2; i++) {
			if (arr[i] != arr[i - 1]) {
				count++;
			}
		}
		return count;
	}

}
