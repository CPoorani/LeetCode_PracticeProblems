package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P63_DecodeMessage {
	
	/*
	 * https://leetcode.com/problems/decode-the-message/
	 * 
	 * Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
	 * Output: "this is a secret"
	 * thequickbrownfxjmpsvlazydg
	 * 
	 * Input : String (key and message)
	 * Output : String 
	 * Convert the key to character array by removing the spaces
	 * Initialize an character array with length 26
	 * Iterate through the given key and fetch each character and append it with str
	 * 	Map each character with the character array
	 * Create a string builder output to have the decoded message
	 * Iterate through the message
	 * 	Get each character 
	 * 	If it is a space, append it as space in output
	 * 	else get the index and append it with output
	 * Return output as string object
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals("the five boxing wizards jump quickly", decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals("this is a secret", decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
	}

	public String decodeMessage(String key, String message) {
		char[] keyArr = key.replace(" ", "").toCharArray();
		char[] arr = new char[26];
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < keyArr.length; i++) {
			char ch = keyArr[i];
			if (str.indexOf(String.valueOf(ch)) == -1) {
				str.append(ch);
				arr[str.length() - 1] = ch;
			}
		}

		StringBuilder output = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);

			if (c == ' ') {
				output.append(' ');
			} else if (c >= 'a' && c <= 'z') {
				int index = str.indexOf(String.valueOf(c));
				output.append((char) ('a' + index));
			} else {
				output.append(c);
			}
		}

		return output.toString();
	}
	
}
