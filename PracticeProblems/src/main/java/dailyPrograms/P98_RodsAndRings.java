package dailyPrograms;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class P98_RodsAndRings {
	
	/*
	 * Input : String
	 * Output : Int
	 * Create an empty hashmap
	 * Initialize variable countColors
	 * Iterate over the length of the ring
	 * Get the color and rod values
	 * Get the numeric value of the rod to place the colors
	 * Check if the rod is present in the map
	 * If so, retain the colors and add the new color
	 * else place the color in the specific rod
	 * Increment the value of i to 2
	 * Iterate through the map and get the values, if it contains all three colors, increment countColors
	 */

	public int countPoints(String rings) {
		Map<Integer, String> map = new HashMap<>();
		int countColors = 0;
		int i = 0;
		while (i < rings.length()) {
			char color = rings.charAt(i);
			char rod = rings.charAt(i + 1);
			int val = Character.getNumericValue(rod);
			if (map.containsKey(val)) {
				String rodColor = map.get(val);
				map.put(val, rodColor + color);
			} else {
				map.put(val, String.valueOf(color));
			}
			i = i + 2;
		}

		for (String colors : map.values()) {
			if (colors.contains("R") && colors.contains("G") && colors.contains("B")) {
				countColors++;
			}
		}

		return countColors;

	}

	@Test
	public void test() {
		Assert.assertEquals(1, countPoints("B0R0G0R9R0B0G0"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, countPoints("B0R0G0R9G9B9G0"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, countPoints("B1"));
	}
}