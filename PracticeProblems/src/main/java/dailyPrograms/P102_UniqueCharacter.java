package dailyPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class P102_UniqueCharacter {
	/*
	 * Input : String
	 * Output : Int
	 * Initialize an empty set and stack 
	 * Iterate through the length of the string
	 * If the character is not present in the set, add it to the set as well as push it to stack
	 * From the stack, fetch the bottom element
	 * Iterate over the string and check the index along with the bottomChar
	 * return the index value
	 * else return -1
	 */

	public int firstUniqChar(String s) {
		Set<Character> set = new HashSet<>();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
				stack.push(ch);
			} else {
				stack.removeElement(ch);
			}
		}

		if (stack.isEmpty()) {
			return -1;
		}
		char bottomChar = stack.elementAt(0);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == bottomChar) {
				return i;
			}
		}
		return -1;
	}
	
	@Test
	public void test() {
		Assert.assertEquals(2, firstUniqChar("loveleetcode"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(-1, firstUniqChar("aadadaad"));
	}
}