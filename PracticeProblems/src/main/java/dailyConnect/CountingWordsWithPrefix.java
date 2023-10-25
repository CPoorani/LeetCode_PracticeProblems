package dailyConnect;

import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;

public class CountingWordsWithPrefix {
	
	/*
	 * Create a variable count to track the no.of words
	 * Iterate through the words
	 * If the word starts with pref
	 * Then increase the count
	 * Return count
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(2, prefixCount(new String[] { "pay", "attention", "practice", "attend" }, "at"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(0, prefixCount(new String[] { "leetcode" }, "de"));
	}

	public int prefixCount(String[] words, String pref) {

		int count = 0;
		for (String word : words) {
			if (word.startsWith(pref)) {
				count++;
			}
		}

		return count;

	}
}
