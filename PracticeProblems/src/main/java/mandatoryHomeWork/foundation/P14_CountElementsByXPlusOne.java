package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P14_CountElementsByXPlusOne {

	/*
	 * Input : Integer Array 
	 * Output : Integer
	 * First have a counter variable and initialize it to 0
	 * Create an empty set
	 * Traverse through the array and add the elements to set
	 * Iterate through the elements in set and check if the num+1 is present -- If num=7, check the (num+1)-8 is present
	 * If so, increase the count variable by 1 and return
	 * 
	 */
	@Test
	public void test() {
		int actual = countArrayElements(new int[] { 1,3,2,3,5,0 });
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		int actual = countArrayElements(new int[] { 1,1,3,3,5,5,7,7 });
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		int actual = countArrayElements(new int[] {1, 1, 2});
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		int actual = countArrayElements(new int[] { 1,2,3 });
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	
	public int countArrayElements(int[] arr) {
		int count = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (Integer num : arr) {
			set.add(num);
		}
		for (Integer num : arr) {
			if (set.contains(num + 1)) {
				count++;
			}
		}

		return count;

	}

}
