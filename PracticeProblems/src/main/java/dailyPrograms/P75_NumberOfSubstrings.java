package dailyPrograms;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class P75_NumberOfSubstrings {

	//yet to make it work for all the inputs.

	@Test
	public void test()
	{
		Assert.assertEquals(3, numberOfSubstrings("aaacb"));
	}
	
	public int numberOfSubstrings(String s) {
		int totalCount = 0;
		List<Character> li = new ArrayList<>();

		for (int right = 0, left = 0; right < s.length(); right++) {
			li.add(s.charAt(right));

			while (li.contains('a') && li.contains('b') && li.contains('c')) {
				li.remove(0);
				left++;
			}

			totalCount = totalCount + left;
		}

		return totalCount;
	}
}

/*
 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 * Input: s = "abcabc"
   Output: 10
   Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
 * 
 * Input : String
 * Output : int
 * 
 * Initialize variable totalCount to 0
 * Create an empty list
 * Loop through the characters of the string from left to right using two pointers, right and left.
 * For each character at the right pointer, add it to the list.
 * Check if the list contains all three characters 'a', 'b', and 'c'.
 * remove characters from the beginning of the list (from the left side) 
 * Increment the left pointer.
 * Add the value of left to the totalCount
 * return totalcount
 */

