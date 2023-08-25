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
		Assert.assertEquals(2, findContentChildren(new int[] { 5, 9, 8 }, new int[] { 0, 3, 9, 8 }));
	}

	public int findContentChildren(int[] g, int[] s) {
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

	public int findContentChildren1(int[] g, int[] s) {
		int maxNum = 0;
		boolean[] used = new boolean[s.length];

		for (int i = 0; i < g.length; i++) {
			int currentChild = g[i];
			int cookie = Integer.MAX_VALUE;
			int index = -1;
		}
		return maxNum;
	}
}