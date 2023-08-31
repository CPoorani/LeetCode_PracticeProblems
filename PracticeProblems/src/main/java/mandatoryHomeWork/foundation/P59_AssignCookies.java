package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P59_AssignCookies {
	
	/*
	 * https://leetcode.com/problems/assign-cookies/description/
	 * 
	 * Input : Array
	 * Output : Int
	 * Sort the array g and s
	 * Initialize a variable maxNum to hold the count
	 * Initialize two variables i and j, i(g) and j(s)
	 * while i and j is lesser than the length
	 * 	if, the size of cookie is greater s[j]>=g[i]
	 * 		Increase the maxNum
	 * 		Increase the counter i and j
	 * If the above condition is not satisfied, increase only the cookie count
	 * return maxNum
	 * 	
	 */

	@Test
	public void test() {
		Assert.assertEquals(2, findContentChildren(new int[] { 10, 9, 8, 7 }, new int[] { 5, 6, 7, 8 }));
	}

	@Test
	public void test1() {
		Assert.assertEquals(1, findContentChildren(new int[] { 1, 2, 3 }, new int[] { 1, 1 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, ContentChildren(new int[] { 5, 9, 8 }, new int[] { 0, 3, 9, 8 }));
	}
	
	/*
	 * Outer loop to iterate through g and inner loop for s
	 * Initialize a variable maxNum to 0 and index to -1
	 * Initialize a variable current to g[i]
	 * Index to hold the value of j, if the condition s[j] > current, then change the index to j
	 * If the index is not equal to -1, then increment the value of maxNum
	 */
	
	public int findContentChildren(int[] g, int[] s) {
		int maxNum = 0;
		for (int i = 0; i < g.length; i++) {
			int current = g[i];
			int index = -1;
			for (int j = 0; j < s.length; j++) {
				if (s[j] >= current && (index == -1 || s[j] < s[index])) {
					index = j;
				}
			}
			if (index != -1) {
				maxNum++;
				index = -1; // reset the index
			}

		}
		return maxNum;
	}
	
	
	public int ContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s); 

		int maxNum = 0;
		int i = 0;
		int j = 0;

		while (i < g.length && j < s.length) {
			if (s[j] >= g[i]) {
				maxNum++;
				i++;
				j++;
			} else {
				j++;
			}
		}

		return maxNum;
	}

}