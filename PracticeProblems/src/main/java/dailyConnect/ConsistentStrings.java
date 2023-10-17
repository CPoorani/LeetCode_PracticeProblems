package dailyConnect;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;


public class ConsistentStrings {
	
	/*
	 * Input : String ad Array
	 * Output : String
	 * Create an empty map and initialize a variable count
	 * Iterate through the allowed string and add it to map
	 * Convert each of the word to char array
	 * Iterate through the words and check if the character is present
	 * If not, make the flag as flase and true
	 * if true, increase the count by 1
	 */

	@Test
	public void test()
	{
		Assert.assertEquals(7, countConsistentStrings("abc", new String[] {"a","b","c","ab","ac","bc","abc"}));
	}
	
	public int countConsistentStrings(String allowed, String[] words) {
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;

		for (char ch : allowed.toCharArray()) {
			map.put(ch, 1);
		}

		for (String word : words) {
			boolean flag = true;
			for (char c : word.toCharArray()) {
				if (!(map.containsKey(c))) {
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
