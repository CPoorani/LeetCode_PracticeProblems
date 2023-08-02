package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class P2_CharacterOccurence {

	/*
	 * Initialize a map 
	 * Convert the string to character array 
	 * Iterate through the array of characters 
	 * If the character matches with the one present in the map
	 * Then, fetch the index value and increment the count 
	 * If not,the count remains the same 
	 * Iterate and fetch the key and the respective value
	 */

	@Test
	public void test() {
		Map<Character, Integer> expected = new HashMap<Character, Integer>();
		expected.put('c', 2);
		expected.put('a', 2);
		expected.put('r', 3);
		expected.put('t', 1);
		expected.put('e', 1);
		expected.put('h', 1);

		Map<Character, Integer> actual = characterOcc("characterr");

		Assert.assertEquals(expected, actual);

	}

	public Map<Character, Integer> characterOcc(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] chArr = str.toCharArray();
		for (char ch : chArr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		for (Map.Entry values : map.entrySet()) {
			System.out.println(values.getKey() + " " + values.getValue());
		}

		return map;

	}

}
