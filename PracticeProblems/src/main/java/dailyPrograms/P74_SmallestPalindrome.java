package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;

public class P74_SmallestPalindrome {
	
	/*
	 * https://leetcode.com/problems/lexicographically-smallest-palindrome/
	 * 
	 * input : String
	 * output : String
	 * Convert the string to character array
	 * initialize two pointer left and right
	 * 	left to 0 and right to character array length - 1;
	 * if the left and right characters are not equal
	 * 	check if left<right
	 * 	if so right = left 
	 * 	else left = right
	 * increase the left and decrease the right
	 * return the ch array to new string
	 */
	@Test
	public void test() {
		Assert.assertEquals("efcfe", makeSmallestPalindrome("egcfe"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("aabbaa", makeSmallestPalindrome("aabbaa"));
	}

	public String makeSmallestPalindrome(String s) {
		char[] ch = s.toCharArray();
		int left = 0, right = ch.length - 1;

		while (left < right) {
			if (ch[left] != ch[right]) {
				if (ch[left] < ch[right]) {
					ch[right] = ch[left];
				} else {
					ch[left] = ch[right];
				}
			}
			left++;
			right--;
		}

		return new String(ch);
	}
}
	