package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P58_SummaryRanges {
	

	/*
	 * https://leetcode.com/problems/summary-ranges/
	 * 
	 * Input: nums = [0,2,3,4,6,8,9]
		Output: ["0","2->4","6","8->9"]
		Explanation: The ranges are:
		[0,0] --> "0"
		[2,4] --> "2->4"
		[6,6] --> "6"
		[8,9] --> "8->9"
	 * Input : Array
	 * Output : List
	 * Create an empty array
	 * Iterate through the given array
	 * 	Initialize start and end, start to num[i] and end to start
	 * 		Inner loop with condition as nums.length - 1
	 * 		Index value+1 to compare the numbers //if (nums[i + 1] == nums[i] + 1)
	 *  	Increase the value of i 
	 *  	Assign the value of end to nums[i+1]
	 *  	If the above condition is not satisfied, break the loop 
	 * If the start and end are equal, just add the number(start)
	 * else
	 * Add the start and end to list
	 */
	
	@Test
	public void test() {
		List<String> expected = Arrays.asList("0->2", "4->5", "7");
		List<String> result = summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 });
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void test1() {
		List<String> expected = Arrays.asList("-1->0", "4->7", "20");
		List<String> result = summaryRanges(new int[] { -1, 0, 4, 5, 6, 7, 20 });
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void test2() {
		List<String> expected = Arrays.asList("0", "6->9", "15");
		List<String> result = summaryRanges(new int[] { 0, 6, 7, 8, 9, 15 });
		Assert.assertEquals(expected, result);
	}

	public List<String> summaryRanges(int[] nums) {
		List<String> li = new ArrayList<String>();

		for (int i = 0; i < nums.length; i++) {
			int start = nums[i];
			int end = start;
			while (i < nums.length - 1) {
				if (nums[i + 1] == nums[i] + 1) {
					end = nums[i + 1];
					i++;
				} else {
					break;
				}
			}
			if (start == end) {
				li.add(Integer.toString(start));
			} else {
				li.add(start + "->" + end);
			}
		}
		return li;
	}
}

