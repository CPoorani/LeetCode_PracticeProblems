package dailyPrograms;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class P91_ConsistentStrings {
	
	/*
	 * Initialize variables count to 0, flag to true
	 * Iterate through the allowed string and add it to map 
	 * Iterate through the input string words 
	 * For each of the word, check if the map contains the character that is in allowed
	 * If not, make the flag to false and break 
	 * else increment the count by 1
	 * return count
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(2, countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, countConsistentStrings("zy", new String[] {"adc", "uv"}));
	}

	
	public int countConsistentStrings(String allowed, String[] words) {
		Map<Character, Integer> map = new HashMap<>();

		for (char c : allowed.toCharArray()) {
			map.put(c, 1);
		}

		int count = 0;

		for (String word : words) {
			boolean flag = true;
			for (char c : word.toCharArray()) {
				if (!map.containsKey(c)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
			}
		}

		return count;
	}
}