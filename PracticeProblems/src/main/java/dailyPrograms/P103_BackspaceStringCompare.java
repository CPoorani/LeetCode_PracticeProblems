package dailyPrograms;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class P103_BackspaceStringCompare {
	
	/*
	 * Two stacks : One for String s and other for String t
	 * Iterate through the length of s, if the character is # then pop it from stack else push it to stack
	 * Repeat the same above step for string t
	 * Return by comparing the content in the stack
	 */

	@Test
	public void test() {
		Assert.assertEquals(true, backspaceCompare("ab##", "c#d#"));
	}

	@Test
	public void test1() {
		Assert.assertEquals(false, backspaceCompare("z#", "z"));
	}

	public boolean backspaceCompare(String s, String t) {

		Stack<Character> strS = new Stack<>();
		Stack<Character> strT = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '#') {
				strS.push(s.charAt(i));
			} else if (!strS.isEmpty()) {
				strS.pop();
			}
		}

		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) != '#') {
				strT.push(t.charAt(i));
			} else if (!strT.isEmpty()) {
				strT.pop();
			}
		}

		return strS.equals(strT);
	}
}