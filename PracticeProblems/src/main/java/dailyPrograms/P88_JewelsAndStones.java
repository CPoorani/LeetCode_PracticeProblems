package dailyPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P88_JewelsAndStones {
	
	/*
	 * Create an empty hashset
	 * Initialize a variable count to 0
	 * Iterate through the jewels and add the characters to the set
	 * Iterate through the stones and check if it contains the character that is already present in the set
	 * If so, increment the value of count 
	 * Return count
	 */
	
	public int countStones(String jewels, String stones) {
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (char c : jewels.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char ch : stones.toCharArray()) {
			if (map.containsKey(ch)) {
				count += map.get(ch);
			}
		}
		return count;
	}
	
	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (char c : jewels.toCharArray()) {
			set.add(c);
		}
		for (char ch : stones.toCharArray()) {
			if (set.contains(ch)) {
				count++;
			}
		}
		return count;
	}
	
	@Test
	public void test()
	{
		Assert.assertEquals(3, countStones("aA", "aAAbbbb"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, numJewelsInStones("A", "a"));
	}
	
}
