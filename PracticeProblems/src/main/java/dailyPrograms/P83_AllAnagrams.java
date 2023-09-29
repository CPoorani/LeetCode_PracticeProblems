package dailyPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

import groovyjarjarantlr4.v4.runtime.misc.Array2DHashSet;

public class P83_AllAnagrams {
	
	/*
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	 * 
	 * Input: s = "cbaebabacd", p = "abc"   output : [0,6]
	 * Input: s = "abab", p = "ab" output : [0,1,2]
	 * Inout : s = "af", p= "be", output : [0]
	 * 
	 * Input : String 
	 * Output List
	 * Iterate through the length of the string a (parameters for the function will be left to right and the string p)
	 * Using ascii array, do the increment for the string a (Left to right - for which anagram is to be checked) and decrement for b (This will be the String p)
	 * Iterate through the array, if the count is not equal to 0, then return false
	 * Initialize variables left and right and have at same position 0
	 * if the length of p is greater than s, return false
	 * else iterate and get the substring from left to right, right should be as left plus the length of p
	 * if it is anagram then add the left index to list
	 * Increment the left pointer
	 * Return the list
	 */
	
	@Test
	public void test1() {
		List<Integer> expected = Arrays.asList(0, 6);
		Assert.assertEquals(expected, findAnagrams("cbaebabacd", "abc"));
	}
	
	@Test
	public void test2() {
		List<Integer> expected = Arrays.asList(0, 1, 2);
		Assert.assertEquals(expected, findAnagrams("abab", "ab"));
	}
	

	@Test
	public void test() {
		List<Integer> expected = Arrays.asList();
		Assert.assertEquals(expected, findAnagrams("af", "be"));
	}

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> li = new ArrayList<>();
		int left = 0, right = 0;

		if (p.length() > s.length()) {
			return li;
		}

		while (right < s.length()) {
			right = left + p.length();
			String subStr = s.substring(left, right);
			if (isAnagramCheck(subStr, p)) {
				li.add(left);
			}
			left++;
		}

		return li;
	}

	public boolean isAnagramCheck(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		int[] count = new int[26];

		for (int i = 0; i < a.length(); i++) {
			count[a.charAt(i) - 'a']++;
			count[b.charAt(i) - 'a']--;
		}

		for (int c : count) {
			if (c != 0) {
				return false;
			}
		}

		return true;
	}
}