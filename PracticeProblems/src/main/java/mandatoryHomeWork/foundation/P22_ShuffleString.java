package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P22_ShuffleString {
	
	/*
	 * Input : String and array 
	 * Output : String
	 * Create an empty array
	 * Traverse through the input string
	 * For each of the char array index assign it with the input.charAt(i)
	 * Return the char array as String
	 */

	@Test
	public void test() {
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String actual = toShuffleString("codeleet", indices);
		Assert.assertEquals("leetcode", actual);
	}

	@Test
	public void test1() {
		int[] indices = { 0, 1, 2 };
		String actual = toShuffleString("abc", indices);
		Assert.assertEquals("abc", actual);
	}
	
	/*
	 * 13/09
	 * Input : String and indices array
	 * Output : String
	 * Create a map, iterate and get the indices along with the character
	 * Traverse through the input string
	 * 	For each of the index, get the value and add with the result string
	 * Return the result
	 */
	 public String restoreString(String s, int[] indices) {
    	 
			Map<Integer, Character> map = new HashMap<Integer, Character>();
			for(int i=0; i<s.length(); i++)
			{
				map.put(indices[i], s.charAt(i));
			}
			
			String result = "";
			for(int i=0;i <s.length(); i++)
			{
				result = result+ map.get(i);
			}
			return result;
		        
	        }

	public String toShuffleString(String input, int[] indices) {
		char[] temp = new char[indices.length];
		for (int i = 0; i < input.length(); i++) {
			temp[indices[i]] = input.charAt(i);	
		}
		return new String(temp);
	}

}
