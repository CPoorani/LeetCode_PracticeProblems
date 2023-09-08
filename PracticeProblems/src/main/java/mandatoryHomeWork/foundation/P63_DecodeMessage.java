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
	 * Map each character with the character array
	 */
	
	@Test
	public void test()
	{
		String actual = decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
		String expected = "this is a secret";
		Assert.assertEquals(expected, actual);
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

		//message
		StringBuilder output = new StringBuilder();		
		 for (int j = 0; j < message.length(); j++) {
		        char currentChar = message.charAt(j);
		    }
		    return output.toString();
		}
}
