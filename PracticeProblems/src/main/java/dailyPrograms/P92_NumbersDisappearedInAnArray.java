package dailyPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;


public class P92_NumbersDisappearedInAnArray {
	/*
	 * Input : Array
	 * Output : List
	 * Create an empty list and set
	 * Iterate through the array and add all the elements to set
	 * Iterate from 1 to length of the array
	 * If the set doesn't contain the value of i, then add it to the list
	 * Return list
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(Arrays.asList(5, 6), findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
	}

	@Test
	public void test1() {
		Assert.assertEquals(Arrays.asList(2), findDisappearedNumbers(new int[] { 1, 1 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(Arrays.asList(1, 2, 3), findDisappearedNumbers(new int[] { 4, 4, 5 }));
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> li = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int n : nums) {
			set.add(n);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (!(set.contains(i))) {
				li.add(i);
			}
		}
		return li;
	}
	
	public List<Integer> disappearedNumbers(int[] nums) {
		List<Integer> li = new ArrayList<>();

		int n = nums.length;
		boolean[] arr = new boolean[n + 1];

		for (int num : nums) {
			arr[num] = true;
		}

		for (int i = 1; i <= n; i++) {
			if (!arr[i]) {
				li.add(i);
			}
		}

		return li;
	}

}