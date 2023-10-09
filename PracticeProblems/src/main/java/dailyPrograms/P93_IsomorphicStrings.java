package dailyPrograms;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class P93_IsomorphicStrings {
	/*
	 * Input : Strings
	 * Output : Boolean
	 * Create an empty map
	 * Iterate through the map 
	 * Get the character of s and t for each i
	 * If map has the character of s, then check if the characters matches (mapping of s is not equal to t)
	 * else check if the map contains the value of t, if so return false
	 * Add the s and t to map
	 * Return true, if all the conditions are satisfied
	 */
	
	@Test
	public void test2() {
		Assert.assertEquals(false, isIsomorphic("xyz", "zzz"));
	}

	@Test
	public void test() {
		Assert.assertEquals(true, isIsomorphic("egg", "add"));
	}

	@Test
	public void test1() {
		Assert.assertEquals(false, isIsomorphic("foo", "bar"));
	}

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

			if (map.containsKey(sChar)) {
				if (map.get(sChar) != tChar) {
					return false;
				}
			} else {
				if (map.containsValue(tChar)) {
					return false;
				}
				map.put(sChar, tChar);
			}
		}

		return true;
	}
}
