package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P29_DiffernceString {
	/*
	 * Input : Two Strings
	 * Output : Character
	 * Traverse through the first string
	 * if s.charAt(i) != t.charAt(i) >> return the distinct character in t
	 * else
	 * return the last character in t
	 */
	@Test
	public void test() {
		char actual = isDiffernt("abcd", "abcde");
		Assert.assertEquals('e', actual);
	}

	@Test
	public void test1() {
		char actual = isDiffernt("abcd", "abrdc");
		Assert.assertEquals('r', actual);
	}
	
	@Test
	public void test2() {
		char actual = isDiffernt("", "y");
		Assert.assertEquals('y', actual);
	}

	public char isDiffernt(String s, String t) {
		char ch = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return t.charAt(i);
			}
		}
		return t.charAt(t.length() - 1); 
	}

}
