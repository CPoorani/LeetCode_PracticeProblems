package dailyConnect;

import org.junit.Assert;
import org.junit.Test;

public class P72_DistinctCharacters {
	
	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
	 * 
	 * Input : String
	 * Output : Int
	 * If the length is lesser than 3, return 0
	 * Initialize two variable, left to 0 and right to 2
	 * Get the substring from left to right
	 * If the characters are not repeated, increase the count by 1
	 * Move the left and right pointers
	 * Return the count
	 */

	@Test
	public void test()
	{
		Assert.assertEquals(1, countGoodSubstrings("xyzzaz"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, countGoodSubstrings("a"));
	}
	
	 public int countGoodSubstrings(String s) { //aababcabc
			int count = 0;

			if (s.length() < 3) {
				return 0;
			}

			int left = 0;
			int right = 2;

			while (right < s.length()) {
				String str = s.substring(left, right + 1);

				if (str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2)
						&& str.charAt(0) != str.charAt(2)) {
					count++;
				}

				left++;
				right++;
			}

			return count;
		}
	}